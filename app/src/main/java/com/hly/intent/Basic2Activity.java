package com.hly.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.Serializable;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/23~~~~~~
 * ~~~~~~更改时间:2018/7/23~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class Basic2Activity extends AppCompatActivity {
    private TextView show_name,show_age;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_activity_layout);

        show_age = findViewById(R.id.show_age);
        show_name = findViewById(R.id.show_name);


        Intent intent = getIntent();
        //反序列化对象
        Serializable se = intent.getSerializableExtra("key");
        if (se instanceof DateBean){
            //获取到携带数据的DataBean对象db
            DateBean db = (DateBean) se;

            show_name.setText(db.getName());
            show_age.setText(db.getAge());

        }
    }
}
