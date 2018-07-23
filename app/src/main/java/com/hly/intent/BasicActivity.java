package com.hly.intent;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/23~~~~~~
 * ~~~~~~更改时间:2018/7/23~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class BasicActivity extends AppCompatActivity {
    private TextView bage, bname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_activity_layout);

        bname = findViewById(R.id.show_name);
        bage = findViewById(R.id.show_age);


        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        String str1 = intent.getStringExtra("age");


        bname.setText(str);
        bage.setText(str1);
    }
}
