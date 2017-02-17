package com.mstarc.app.mvptest;

/**
 * 作者: Created by wyg
 * 时间: 2017/2/17 0017  13:31
 */

public class Model implements IModel {
    @Override
    public void getData(final ICallback callback) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                callback.onResult("耗时操作");
            }
        }).start();
    }
}
