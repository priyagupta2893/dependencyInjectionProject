package com.cdp.dependencyInjectionProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cdp.componentScan.ComponentDao;

@SpringBootApplication
@ComponentScan("com.cdp.componentScan")
public class DependencyInjectionProjectComponentScanApplication {

	static Logger LOGGER = LoggerFactory.getLogger(DependencyInjectionProjectComponentScanApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionProjectComponentScanApplication.class, args);
		ComponentDao binarySearch1 = context.getBean(ComponentDao.class);
		LOGGER.info("{}", binarySearch1);
		LOGGER.info("{}", binarySearch1.getConnection());

	}

}
