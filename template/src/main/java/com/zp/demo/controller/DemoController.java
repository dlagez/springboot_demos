package com.zp.demo.controller;

import com.zp.demo.service.OrderService;
import com.zp.demo.service.UserService;
import io.reactivex.rxjava3.core.Single;
import org.springframework.stereotype.Controller;

/** author: zp date: 2024/11/4 14:32 */
@Controller
public class DemoController {
    private final UserService userService;
    private final OrderService orderService;

    public DemoController(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    public Single<String> getUserInfo(Long userId) {
        return userService.getUserById(userId)
                .zipWith(orderService.getOrdersByUserId(userId), (user, orders) ->
                        "用户信息: " + user + ", 订单信息: " + orders
                );
    }
}
