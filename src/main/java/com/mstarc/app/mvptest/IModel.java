package com.mstarc.app.mvptest;

/**
 * 作者: Created by wyg
 * 时间: 2017/2/17 0017  13:29
 */

public interface IModel {

    void getData(ICallback callback);

    interface ICallback {
        void onResult(String data);
    }
}
