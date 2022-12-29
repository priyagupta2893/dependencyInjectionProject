package com.cdp.dependencyInjectionProject.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BinarySearchImpl {
	@Autowired
	@Qualifier("quick")
	SortAlgorithm bubbleSortAlgorithm;

//	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
//		super();
//		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numToSearch) {
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		return 3;
	}

}
