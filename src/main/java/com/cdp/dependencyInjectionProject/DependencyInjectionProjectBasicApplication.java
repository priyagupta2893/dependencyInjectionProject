package com.cdp.dependencyInjectionProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdp.dependencyInjectionProject.basic.BinarySearchImpl;
import com.cdp.dependencyInjectionProject.basic.BubbleSortAlgorithm;
import com.cdp.dependencyInjectionProject.basic.QuickSortAlgorithm;

@SpringBootApplication
public class DependencyInjectionProjectBasicApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ApplicationContext context = SpringApplication.run(DependencyInjectionProjectBasicApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
		System.out.println(result);
		
	}

}
