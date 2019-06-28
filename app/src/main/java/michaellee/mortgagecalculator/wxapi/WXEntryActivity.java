package michaellee.mortgagecalculator.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by MichaelLee826 on 2016-08-19-0019.
 */
public class WXEntryActivity extends Activity  {
    private String WXAppID = "wxe1309186360d6399";
    //正式版：wxe1309186360d6399
    //测试版：wx0cccc66f5792e9d0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        setIntent(intent);
    }

   
}