package michaellee.mortgagecalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class ActivityWeb3 extends BaseWebView {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("汇率计算器");
    }

    @Override
    public void requestWeb() {
        mWebView.loadUrl(Api.UnlockFragmentUrl3);

    }


    @Override
    public void hideBottom() {
        try {
            //定义javaScript方法
            String javascript = "javascript:(function() { " +
                  
                    "document.getElementsByClassName('navbar')[0].style.display='none'; " +
                    "document.getElementsByClassName('gg')[0].style.display='none'; " +
                    "document.getElementsByClassName('table-responsive')[0].style.display='none'; " +
                    "document.getElementsByClassName('footer')[0].style.display='none'; " +
                    "document.getElementsByTagName('h4')[0].style.display='none'; " +
            
//                    "document.getElementById('pmk_sj_lxwm').style.display='none'; " +
//                    "document.getElementById('bottom_top').style.display='none'; " +
//                    "document.getElementById('bottom').style.display='none'; " +
//                    "document.getElementById('jie_mian_qie_huan').style.display='none'; " +
//                    "document.getElementById('google_osd_static_frame_4088598361258').style.display='none'; " +
//                    "document.getElementById('google_pedestal_container').style.display='none'; " +

                    "})()";


            //加载方法
            mWebView.loadUrl(javascript);
            //执行方法
            mWebView.loadUrl("javascript:hideBottom();");

//            String javascript1 = "javascript:(function() { " +
//                    "document.getElementsByClassName('other-login')[0].style.display='none'; " +
//                    "})()";
////            //加载方法
//            mWebView.loadUrl(javascript1);
//            //执行方法
//            mWebView.loadUrl("javascript:hideBottom();");
//         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
