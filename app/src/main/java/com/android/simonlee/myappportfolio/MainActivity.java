package com.android.simonlee.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFilms;
    Button btnStock;
    Button btnReader;
    Button btnNews;
    Button btnGraduDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilms = (Button) findViewById(R.id.btn_films);
        btnFilms.setOnClickListener(this);

        btnStock = (Button) findViewById(R.id.btn_stock);
        btnStock.setOnClickListener(this);

        btnReader = (Button) findViewById(R.id.btn_reader);
        btnReader.setOnClickListener(this);

        btnNews = (Button) findViewById(R.id.btn_news);
        btnNews.setOnClickListener(this);

        btnGraduDesign = (Button) findViewById(R.id.btn_design);
        btnGraduDesign.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_films:
                this.showMessage(btnFilms.getText(), Toast.LENGTH_LONG);
                break;
            case R.id.btn_stock:
                this.showMessage(btnStock.getText(),Toast.LENGTH_LONG);
                break;
            case R.id.btn_reader:
                this.showMessage(btnReader.getText(),Toast.LENGTH_LONG);
                break;
            case R.id.btn_news:
                this.showMessage(btnNews.getText(),Toast.LENGTH_LONG);
                break;
            case  R.id.btn_design:
                this.showMessage(btnGraduDesign.getText(),Toast.LENGTH_LONG);
                break;
            default:
                break;
        }

    }

    /**
     * 显示消息
     */
    private void showMessage(CharSequence text, int duration) {
        Toast.makeText(MainActivity.this, "启动应用：" + text, duration).show();
    }
}
