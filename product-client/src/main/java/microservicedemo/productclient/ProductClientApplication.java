package microservicedemo.productclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"microservicedemo.productclient.controller",
        "microservicedemo.productclient.client"})
@EnableEurekaClient
@EnableFeignClients("microservicedemo.productclient.client")
public class ProductClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductClientApplication.class, args);
    }
}
