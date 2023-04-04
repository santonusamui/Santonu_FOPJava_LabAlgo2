package com.gl.javafsd.dsa.denominations.test;

import com.gl.javafsd.dsa.denominations.input_and_process.DescendingSorter;

public class DescendinSorterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int [] arr = {25,8,9,46,2,3};
		int [] arr = {25,8,9,46,2,300,-1};
		DescendingSorter sorter = new DescendingSorter(arr);
		
		int [] resultArr = sorter.sort(arr);
		for(int i =0; i< resultArr.length; i++)
			System.out.print(resultArr[i]+ ", ");
		
		

	}
	
	

}
