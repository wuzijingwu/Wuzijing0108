package text.bwei.com.wuzijing0108.api;

/**
 * Created by dell on 2018/1/8.
 */

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;
import text.bwei.com.wuzijing0108.bean.DetailsBean;

/**
 * Created by dell on 2018/1/4.
 */

public interface ApiServers {
    //    product/getProductDetail?pid=1
    @POST
    Observable<DetailsBean> getdataDetails(@Url String url, @QueryMap Map<String, Integer> map);
}
