package com.springbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //specifying its a bean
public class BinarySearchImp {
	//SORTING ARRAY
	//BINARY SEARCH
	//RETRUN
	
	
	//inorder to switch between the different type of algorithms create an interface 
	//also this bean is dependent on sorting
	@Autowired
	private Sorting sorting;//interface variable 
	
	/*public BinarySearchImp(Sorting sorting) {//Constructor inject or setter can also be used or none
		super();
		this.sorting = sorting;
	}*/

	public int binarySearch(int [] numbers,int numbertosearch) {
		//inorder to switch between the different sorting algorithms we use an interface
		
		
		//the sorting algorithm can be any sorting hence we create different class for easvh type of sorting
		
		
		/*BubbleSort bubblesort= new BubbleSort();
		int [] sortednumbers=bubblesort.bubbleSort(numbers);*/
		
		int [] sortednumbers = sorting.sort(numbers);
		System.out.println(sorting);
	
		
		//searching algorithm
		return 3;// dummy
	}

}
