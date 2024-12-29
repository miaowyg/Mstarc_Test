package com.mstarc.app.mvptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IView {
    private TextView tvRes;
    private Button btnA;
    private IPresenter mPresenter;

    private void assignViews() {
        tvRes = (TextView) findViewById(R.id.tv_res);
        btnA = (Button) findViewById(R.id.btn_a);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        //test ssh commit
        mPresenter = new Presenter(this);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onClick();
            }
        });
    }

    @Override
    public void setData(final String data) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvRes.setText(data);
            }
        });
    }
}
