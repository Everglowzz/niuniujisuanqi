package michaellee.mortgagecalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class ActivityWeb5 extends BaseWebView {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("大写数字转换");
    }

    @Override
    public void requestWeb() {
        mWebView.loadUrl(Api.UnlockFragmentUrl5);

    }


    @Override
    public void hideBottom() {
        try {
            //定义javaScript方法
            String javascript = "javascript:(function() { " +
                    "document.getElementsByTagName('header')[0].style.display='none'; " +
//                    "document.getElementsByClassName('navbar navbar-inverse navbar-fixed-top')[0].style.display='none'; " +
//                    "document.getElementsByClassName('col-md-4  course-sidebar')[0].style.display='none'; " +
//                    "document.getElementsByClassName('article-list-body row')[0].style.display='none'; " +
//                    "document.getElementsByClassName('panel-heading')[0].style.display='none'; " +
//                    "document.getElementsByClassName('panel-title')[0].style.display='none'; " +
//                    "document.getElementsByClassName('panel-title')[1].style.display='none'; " +
//                    "document.getElementsByClassName('panel-body-city')[0].style.display='none'; " +
                   
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
