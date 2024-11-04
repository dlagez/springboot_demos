package com.zp.rxjava.controller;
import io.reactivex.rxjava3.disposables.Disposable;
import com.zp.rxjava.service.SensorDataObserver;
import com.zp.rxjava.service.SensorDataService;

/** author: zp date: 2024/11/4 14:45 */
public class SensorController {
    private final SensorDataService sensorDataService;
    private Disposable disposable;

    public SensorController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    public String startSensorData() {
        // 创建一个观察者
        SensorDataObserver observer = new SensorDataObserver();
        // 订阅数据流
        disposable = sensorDataService.getSensorData().subscribeWith(observer);
        return "传感器数据流已启动";
    }

    public String stopSensorData() {
        // 停止订阅
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
            return "传感器数据流已停止";
        }
        return "传感器数据流未启动";
    }
}
