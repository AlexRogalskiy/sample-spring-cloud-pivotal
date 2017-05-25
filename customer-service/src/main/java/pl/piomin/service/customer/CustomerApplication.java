package pl.piomin.service.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import pl.piomin.service.customer.contract.AccountClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {AccountClient.class})
@EnableCircuitBreaker
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
