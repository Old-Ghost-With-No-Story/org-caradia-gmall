package org.caradia.gmall.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 姽辫
 * @className ProductServiceApplication
 * @date Create in 2022-10-29 20:28
 */
@SpringCloudApplication
@MapperScan(basePackages = "org.caradia.gmall.product.mapper")
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}
