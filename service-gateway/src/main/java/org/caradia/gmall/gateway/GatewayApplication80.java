package org.caradia.gmall.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 姽辫
 * @className GatewayApplication80
 * @date Create in 2022-10-29 20:16
 */

//@EnableCircuitBreaker  //开启服务熔断功能。【hystrix、sentinel】
//@EnableDiscoveryClient  //开启服务发现功能
//@SpringBootApplication
@SpringCloudApplication //集成了上面三个注解
public class GatewayApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication80.class,args);
    }
}
