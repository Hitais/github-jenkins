package com.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //it automatically cans the packages which gives where to search the beans
public class DemoApplication {
	//what are the beans here we will consider that bubble sort and binarysearchimp are the bean with @component
	//what are the dependency for beans with the help of autowired
	//where to search for the beans springbootapplication anntation is used

	public static void main(String[] args) {
		//BinarySearchImp binarysearch =new BinarySearchImp(new BubbleSort());//you can also change it to quick sort
		
		
		//the above calling of binary implementation is done with the help of beans 
		//Application context
		ApplicationContext applicationcontext=SpringApplication.run(DemoApplication.class, args);
		BinarySearchImp binarysearch=applicationcontext.getBean(BinarySearchImp.class);
		int result= binarysearch.binarySearch(new int [] {1,2,3,4},3);
		//System.out.println(result);
		
	}

}
