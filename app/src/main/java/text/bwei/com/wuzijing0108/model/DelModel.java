package text.bwei.com.wuzijing0108.model;

/**
 * Created by dell on 2018/1/8.
 */

import io.reactivex.Flowable;
import text.bwei.com.wuzijing0108.bean.MessageBean;
import text.bwei.com.wuzijing0108.presenter.DelPresenter;
import text.bwei.com.wuzijing0108.utils.RetrofitUtils;


public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}