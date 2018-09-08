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
                 * 到底怎么合并代码
                 * fetch实验
                 *
                 *
                 * 不知道怎么用fetch啊
                 * 我也不知道怎么用啊，大兄弟
                 *
                 * 两位太笨了，哈哈哈哈
                 *
                 * LALALA    我是卖报的小行家
                 */

                text.setText("");
            }
        });
    }
}
