package com.example.administrator.gitusingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text);
        text.setText("哈哈哈");
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("wokao");
                /**
                 * pull 方法测试
                 * 我是测试员
                 * pull测试终端
                 * 我在这里合并冲突
                 */
                text.setText("");

            }
        });

        String newContent = "";
        newContent = "123456";
        text.setText(newContent);
    }
}
