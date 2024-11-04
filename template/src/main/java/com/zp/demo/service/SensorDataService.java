package com.zp.demo.service;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

/** author: zp date: 2024/11/4 14:43 */
public class SensorDataService {
    // 模拟一个Observable，持续产生数据
    public Observable<String> getSensorData() {
        return Observable.interval(1, TimeUnit.SECONDS)  // 每秒产生一个数据
                .map(tick -> "传感器数据 - 时间戳: " + System.currentTimeMillis());
    }
}
