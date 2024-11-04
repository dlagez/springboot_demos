package com.zp.demo.service;

import io.reactivex.rxjava3.observers.DisposableObserver;

/** author: zp date: 2024/11/4 14:44 */
public class SensorDataObserver extends DisposableObserver<String> {
    @Override
    public void onNext(String data) {
        System.out.println("收到数据: " + data);
    }

    @Override
    public void onError(Throwable e) {
        System.err.println("发生错误: " + e.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("数据流结束");
    }
}
