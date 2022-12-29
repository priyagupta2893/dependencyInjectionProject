package com.cdp.dependencyInjectionProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdp.dependencyInjectionProject.scope.BinarySearchDao;

@SpringBootApplication
public class DependencyInjectionProjectScopeApplication {

	static Logger LOGGER = LoggerFactory.getLogger(DependencyInjectionProjectScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionProjectScopeApplication.class, args);
		BinarySearchDao binarySearch1 = context.getBean(BinarySearchDao.class);
		BinarySearchDao binarySearch2 = context.getBean(BinarySearchDao.class);
		LOGGER.info("{}", binarySearch1);
		LOGGER.info("{}", binarySearch1.getConnection());
		LOGGER.info("{}", binarySearch2);
		LOGGER.info("{}", binarySearch1.getConnection());

	}

}
