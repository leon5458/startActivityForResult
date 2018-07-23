package com.hly.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/23~~~~~~
 * ~~~~~~更改时间:2018/7/23~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class Basic1Activity extends AppCompatActivity {
    private EditText show_age, show_name;
    private TextView finish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic1_activity_layout);
        finish = findViewById(R.id.finish);
        show_age = findViewById(R.id.show_age);
        show_name = findViewById(R.id.show_name);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置返回的数据
                Intent intent = new Intent();
                intent.putExtra("name", show_name.getText().toString().trim());
                intent.putExtra("age", show_age.getText().toString().trim());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
