package text.bwei.com.wuzijing0108.presenter;

/**
 * Created by dell on 2018/1/8.
 */


import text.bwei.com.wuzijing0108.bean.DetailsBean;
import text.bwei.com.wuzijing0108.model.Idetailsmodel;
import text.bwei.com.wuzijing0108.model.OnselectDetails;
import text.bwei.com.wuzijing0108.model.model;
import text.bwei.com.wuzijing0108.view.Idetailsview;

/**
 * Created by dell on 2018/1/4.
 */

public class presenterDetails {
    Idetailsview idetailsview;
    Idetailsmodel idetailsmodel;

    public presenterDetails(Idetailsview idetailsview) {
        this.idetailsview = idetailsview;
        idetailsmodel = new model();
    }

    public void getOkDetails(String url, int pid) {
        idetailsmodel.RequestDetails(url, pid, new OnselectDetails() {
            @Override
            public void dataDetailsSuccess(DetailsBean.DataBean list) {
                idetailsview.shouDetails(list);
            }
        });

    }


}
