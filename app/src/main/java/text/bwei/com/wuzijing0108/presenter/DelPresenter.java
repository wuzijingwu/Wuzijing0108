package text.bwei.com.wuzijing0108.presenter;

/**
 * Created by dell on 2018/1/8.
 */

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import text.bwei.com.wuzijing0108.bean.MessageBean;
import text.bwei.com.wuzijing0108.model.DelModel;
import text.bwei.com.wuzijing0108.view.Iview;


public class DelPresenter implements BasePresenter {
    private Iview iv;
    private DisposableSubscriber subscriber2;

    public void attachView(Iview iv) {
        this.iv = iv;
    }

    public void detachView() {
        if (iv != null) {
            iv = null;
        }

        if (!subscriber2.isDisposed()){
            subscriber2.dispose();
        }
    }

    @Override
    public void getData(String uid,String pid) {
        DelModel model = new DelModel(this);
        model.getData(uid,pid);
    }



    public void delData(Flowable<MessageBean> delFlowable) {
        subscriber2 = delFlowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<MessageBean>() {
                    @Override
                    public void onNext(MessageBean listMessageBean) {
                        if (listMessageBean != null) {
                            iv.delSuccess(listMessageBean);

                        }
                    }



                    @Override
                    public void onError(Throwable t) {
                        iv.onFailed((Exception) t);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
