package cloud.ecosphere.yy.base.frontend;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@EnableFeignClients(basePackages = "cloud.ecosphere")
@EnableDiscoveryClient
@ComponentScan(basePackages= "cloud.ecosphere.yy.distribution.frontend")
public class DistributionFrontApplication {

	private static Logger logger = LoggerFactory.getLogger(DistributionFrontApplication.class);
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DistributionFrontApplication.class,args);
	}

}
