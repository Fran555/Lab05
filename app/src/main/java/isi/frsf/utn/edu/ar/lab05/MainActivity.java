package isi.frsf.utn.edu.ar.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TareaDao td = new TareaDao(this);

        WebView wb = (WebView) findViewById(R.id.navegador);
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wb.addJavascriptInterface(td,"tareaDaoAndroid");

        wb.loadUrl("file:///android_asset/index.html");




    }
}
