package text.bwei.com.wuzijing0108;

/**
 * Created by dell on 2018/1/8.
 */

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}