package com.smm.muzzammil.makeuseful.WebView;
/**
 * Created by Syed Muhammad Muzzammil on 10/18/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.smm.muzzammil.makeuseful.GridView.GridViewActivity;

public class WebViewActivity extends Activity {

    private WebView mWebview ;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mWebview .loadUrl(GridViewActivity.url);
        setContentView(mWebview );

    }

}
