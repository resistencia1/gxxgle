package com.example.gxxgle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    WebView miVisorWeb;
    String url = "https://www.google.com/";
    Dialog myDialog;

    Button button;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog=new Dialog(this);

        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        myDialog.setContentView(R.layout.custompopup);
//        WebView wv=(WebView)myDialog.findViewById(R.id.visorWebPOP);
//        wv.loadUrl("https://www.google.com/");
//        wv.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//
//                return true;
//            }
//        });

//        miVisorWeb = (WebView) findViewById(R.id.visorWebPOP);
//        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();


//        button=(Button)findViewById(R.id.buton1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(miVisorWeb.getVisibility()==View.GONE){
//                    miVisorWeb.setVisibility(View.VISIBLE);
//                }else{miVisorWeb.setVisibility(View.GONE);}
//            }
//        });


//        ajustesVisorWeb.setJavaScriptEnabled(true);
//        miVisorWeb.setWebViewClient(new WebViewClient());
//        miVisorWeb.loadUrl(url);

    }

    public void ShowPopUp(View v){





        TextView txtclose ;
        myDialog.setContentView(R.layout.custompopup);


        WebView wv=(WebView)myDialog.findViewById(R.id.visorWebPOP);
        wv.loadUrl("https://www.google.com/");
        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return true;
            }
        });


        txtclose=(TextView)myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }


//    //Impedir que el botón Atrás cierre la aplicación
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        WebView miVisorWeb;
//        miVisorWeb = (WebView) findViewById(R.id.visorWeb);
//        if (event.getAction() == KeyEvent.ACTION_DOWN) {
//            switch (keyCode) {
//                case KeyEvent.KEYCODE_BACK:
//                    if (miVisorWeb.canGoBack()) {
//                        miVisorWeb.goBack();
//                    } else {
//                        finish();
//                    }
//                    return true;
//            }
//        }
//        return super.onKeyDown(keyCode, event);
//    }

}
