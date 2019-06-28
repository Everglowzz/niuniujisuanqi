package michaellee.mortgagecalculator;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ActivityWeb1 extends BaseWebView {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("亲戚计算器");
    }

    @Override
    public void requestWeb() {
        mWebView.loadUrl(Api.UnlockFragmentUrl1);
        
       
    }
}
