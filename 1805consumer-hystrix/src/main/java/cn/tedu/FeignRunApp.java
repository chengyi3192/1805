package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableFeignClients  //开启feign
@EnableCircuitBreaker //标识htstrix
@EnableHystrixDashboard 
public class FeignRunApp {
	public static void main(String[] args) {
		SpringApplication.run(FeignRunApp.class, args);
	}
}
