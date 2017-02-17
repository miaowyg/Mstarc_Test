package com.mstarc.app.mvptest;

/**
 * 作者: Created by wyg
 * 时间: 2017/2/17 0017  13:29
 */

public class Presenter implements IPresenter {

    private IView mView;
    private IModel mModel;

    public Presenter(IView view) {
        mView = view;
        mModel = new Model();
    }

    @Override
    public void onClick() {

        mModel.getData(new IModel.ICallback() {
            @Override
            public void onResult(String data) {

                String temp = data + ",  Presenter加工过;";
                mView.setData(temp);
            }
        });
    }
}
