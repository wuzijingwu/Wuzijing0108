package text.bwei.com.wuzijing0108.view;

import text.bwei.com.wuzijing0108.bean.MessageBean;

/**
 * Created by dell on 2018/1/8.
 */



public interface Iview {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}