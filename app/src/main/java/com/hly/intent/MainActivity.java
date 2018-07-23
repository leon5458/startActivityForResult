package com.hly.intent;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.text.DateTimePatternGenerator.PatternInfo.OK;

public class MainActivity extends AppCompatActivity {
    private TextView name, age;
    private static final int REQUEST_NG = 0x001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);


        findViewById(R.id.intent1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BasicActivity.class);
                i.putExtra("name", "hly");
                i.putExtra("age", "22");
                startActivity(i);
            }
        });

        findViewById(R.id.intent2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BundleActivity.class);
                Bundle budle = new Bundle();
                budle.putString("name", "leon");
                budle.putString("age", "23");
                intent.putExtra("key", budle);
                startActivity(intent);
            }
        });

        findViewById(R.id.intent3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Basic1Activity.class);
                startActivityForResult(intent, 0x001);

            }
        });

        findViewById(R.id.intent4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Basic2Activity.class);
                DateBean bean = new DateBean();
                bean.setName("hly");
                bean.setAge("sex");
                intent.putExtra("key", bean);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(MainActivity.this, "姓名:" + n + "年龄:" + a, Toast.LENGTH_LONG).show();
        name.setText(n);
        age.setText(a);
    }

    String n;
    String a;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) return;
        if (resultCode == RESULT_OK) {
            if (requestCode == 0x001) {
                n = data.getStringExtra("name");
                a = data.getStringExtra("age");
            }
        }

    }
}
