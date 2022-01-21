package com.renguangli.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-cloud-alibaba-samples
 * Created by renguangli at 2022/1/21 4:53 下午
 *
 * @since JDK1.8
 */
@RestController
@RefreshScope // 配置中心修改，自动刷新
public class ConfigController {

    @Value("${config}")
    private String config;

    @GetMapping("/config")
    public String config(){
        return config;
    }
}
