package text.bwei.com.wuzijing0108.model;

/**
 * Created by dell on 2018/1/8.
 */

import java.util.List;

import io.reactivex.Flowable;
import text.bwei.com.wuzijing0108.bean.DatasBean;
import text.bwei.com.wuzijing0108.bean.MessageBean;
import text.bwei.com.wuzijing0108.presenter.NewsPresenter;
import text.bwei.com.wuzijing0108.utils.RetrofitUtils;


public class NewsModel implements IModel {
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter) {
        this.presenter = (NewsPresenter) presenter;

    }

    @Override
    public void getData(String uid, String pid) {
        Flowable<MessageBean<List<DatasBean>>> flowable = RetrofitUtils.getInstance().getApiService().getDatas(uid);
        presenter.getNews(flowable);

    }
}
