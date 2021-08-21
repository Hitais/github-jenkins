package com.springbasics.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//primary bean
public class QuickSort implements Sorting {
	public int[] sort(int [] numbers) {
		//sorting algorithm
		return numbers;
	}

}
