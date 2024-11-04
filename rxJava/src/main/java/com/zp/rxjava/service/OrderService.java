package com.zp.rxjava.service;

import io.reactivex.rxjava3.core.Single;
import org.springframework.stereotype.Service;

/** author: zp date: 2024/11/4 14:34 */
@Service
public class OrderService {
    public Single<String> getOrdersByUserId(Long userId) {
        return Single.create(emitter -> {
            // 模拟延迟
            Thread.sleep(1500);
            emitter.onSuccess("订单信息: 用户ID " + userId);
        });
    }
}
