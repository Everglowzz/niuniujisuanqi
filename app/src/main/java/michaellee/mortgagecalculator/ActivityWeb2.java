package michaellee.mortgagecalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class ActivityWeb2 extends BaseWebView {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("强大计算器");
    }

    @Override
    public void requestWeb() {
        mWebView.loadUrl(Api.UnlockFragmentUrl2);

    }


    @Override
    public void hideBottom() {
        try {
            //定义javaScript方法
            String javascript = "javascript:(function() { " +
                    "document.getElementById('pmk_sj_top').style.display='none'; " +
                    "document.getElementById('main_title').style.display='none'; " +
                
                    "document.getElementById('ggwz___3').style.display='none'; " +
                    "document.getElementById('ggwz___11').style.display='none'; " +
//                    "document.getElementById('pmk_sj_lxwm').style.display='none'; " +
                    "document.getElementsByClassName('nry_bt')[0].style.display='none'; " +
                    "document.getElementsByClassName('xiaoshuomingkuang_biaoti')[0].style.display='none'; " +
                    "document.getElementsByClassName('xiaoshuomingkuang_neirong')[0].style.display='none'; " +
                    "document.getElementsByClassName('kuang pmk_sj_show')[0].style.display='none'; " +
                    
            
                    "document.getElementById('pmk_sj_lxwm').style.display='none'; " +
                    "document.getElementById('bottom_top').style.display='none'; " +
                    "document.getElementById('bottom').style.display='none'; " +
                    "document.getElementById('jie_mian_qie_huan').style.display='none'; " +
                    "document.getElementById('google_osd_static_frame_4088598361258').style.display='none'; " +
                    "document.getElementById('google_pedestal_container').style.display='none'; " +

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
