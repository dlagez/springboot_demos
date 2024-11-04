package com.zp.demo.service;

import io.reactivex.rxjava3.core.Single;
import org.springframework.stereotype.Service;

/** author: zp date: 2024/11/4 14:33 */
@Service
public class UserService {
    public Single<String> getUserById(Long userId) {
        return Single.create(emitter -> {
            // 模拟延迟
            Thread.sleep(1000);
            emitter.onSuccess("用户信息: 用户ID " + userId);
        });
    }
}
