package michaellee.mortgagecalculator;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;


/**
 * @author admin
 */
public class MyApplication extends Application {

    
    @Override
    public void onCreate() {
        super.onCreate();
        APP = this;
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
 
    public static  MyApplication APP;
    public static MyApplication getApplication() {
        return APP;
    }


}
