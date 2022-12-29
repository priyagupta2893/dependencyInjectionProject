package com.cdp.dependencyInjectionProject.basic;

import org.springframework.stereotype.Component;
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		return numbers;
	}

}
