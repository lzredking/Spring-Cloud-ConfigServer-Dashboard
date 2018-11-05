package com.ms.configserver.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yangkunguo
 *
 */
@SpringBootApplication(scanBasePackages= {"com.ms.configserver"})
public class ConfigServerApplication {

	public static ConfigurableApplicationContext context;//bena容器
	
	
	public static void main(String[] args) {
		context= SpringApplication.run(ConfigServerApplication.class, args);
	}
  
}