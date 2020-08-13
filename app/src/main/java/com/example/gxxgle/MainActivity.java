package com.example.gxxgle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView miVisorWeb;
    String url = "https://www.google.com/";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miVisorWeb = (WebView) findViewById(R.id.visorWeb);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();


        button=(Button)findViewById(R.id.buton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(miVisorWeb.getVisibility()==View.GONE){
                    miVisorWeb.setVisibility(View.VISIBLE);
                }else{miVisorWeb.setVisibility(View.GONE);}
            }
        });


        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorWeb.setWebViewClient(new WebViewClient());
        miVisorWeb.loadUrl(url);

    }

    //Impedir que el botón Atrás cierre la aplicación
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView miVisorWeb;
        miVisorWeb = (WebView) findViewById(R.id.visorWeb);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (miVisorWeb.canGoBack()) {
                        miVisorWeb.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
