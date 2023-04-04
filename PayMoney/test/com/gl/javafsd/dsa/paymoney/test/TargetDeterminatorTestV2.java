package com.gl.javafsd.dsa.paymoney.test;

import com.gl.javafsd.dsa.paymoney.input_and_process.TargetDeterminator;
import com.gl.javafsd.dsa.paymoney.output.Result;

public class TargetDeterminatorTestV2 {

	public static void main(String[] args) {

		testCase(new int[]{20, 12, 31}, 21);			
		testCase(new int[] {20, 12, 31}, 19);						
		testCase(new int[] {100}, 101);				
		testCase(new int[] {1, 1}, 2);		
		testCase(new int[] {1, 1}, 3);		
		testCase(new int[] {2, 22, 40, 30, 28}, 105);


	}

	static void testCase(int transactionsArray[], int dailyTarget ) {

		TargetDeterminator determinator = new TargetDeterminator(transactionsArray, dailyTarget);

		Result result = determinator.determine();

		if(result.isTargetAchievedOrNot()) {

			//			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved after "+result.getNoOfTransactionsNeeded()+" number of Transaction(s).");

		}else {

			//			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved can not be Achieved.");		
		}
	}	
}	







