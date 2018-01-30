package com.example.arjun_mu.a22webview;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by arjun_mu on 1/29/2018.
 */

public class JavaScriptInterface {

    Context context;

    JavaScriptInterface(Context c) {
        context = c;
    }
    // App targets API 16 and higher

    /**
     * Show a toast from the web page
     */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void newActivity(String toast) {
        context.startActivity(new Intent(context,PageNavigation.class));
    }

}
