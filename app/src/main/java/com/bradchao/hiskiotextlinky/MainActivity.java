package com.bradchao.hiskiotextlinky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t1, t2, t3, t4, t5, t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);
        t4 = findViewById(R.id.text4);
        t5 = findViewById(R.id.text5);
        t6 = findViewById(R.id.text6);

        String s = "<h1>Hello</h1><a href='https://www.bradchao.com'>Brad Big Company</a>";
        t1.setText(s);

        t2.setText(Html.fromHtml(s, Html.FROM_HTML_MODE_LEGACY));
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        String s3 = "Mail: <a href='mailto:brad@brad.tw'>Brad</a>";
        t3.setText(Html.fromHtml(s3, Html.FROM_HTML_MODE_LEGACY));
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        String s4 = "地圖呈現: <a href='https://goo.gl/maps/gPAAmUiF6M8f6Epz5'>日月潭</a>";
        t4.setText(Html.fromHtml(s4, Html.FROM_HTML_MODE_LEGACY));
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        String s5 = "Tel: <a href='tel:0912123456'>老闆</a>";
        t5.setText(Html.fromHtml(s5, Html.FROM_HTML_MODE_LEGACY));
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        String s6 = "SMS: <a href='sms:1922?body=Hello, OK'>老闆</a>";
        t6.setText(Html.fromHtml(s6, Html.FROM_HTML_MODE_LEGACY));
        t6.setMovementMethod(LinkMovementMethod.getInstance());


    }
}