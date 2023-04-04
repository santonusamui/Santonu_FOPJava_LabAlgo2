package com.gl.javafsd.dsa.paymoney.input_and_process;


import java.util.Scanner;

import com.gl.javafsd.dsa.paymoney.output.Result;

public class TransactionKeeper {


	public TransactionKeeper() {
		
	}

	public void process() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array ");	
		int transactionArraySize = input.nextInt();	
		int[] transactionsArray = new int[transactionArraySize];


		System.out.println("Enter the value(s) of the array");	
		for (int index = 0; index < transactionArraySize; index ++) {

			transactionsArray[index] = input.nextInt();
			input.nextLine();
		}				

		System.out.println("Enter the total no of target(s) that needs to be achieved");
		int transactionsInstanceSize = input.nextInt();

		input.nextLine();

		for (int index = 1; index <= transactionsInstanceSize; index ++) {

			System.out.println();
			System.out.println("Enter the value of the target");
			int dailyTarget = input.nextInt();

			input.nextLine();

			TargetDeterminator determinator = new TargetDeterminator(transactionsArray, dailyTarget);

			Result result = determinator.determine();

			if(result.isTargetAchievedOrNot()) {

//				System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
				System.out.println("Target achieved after "+result.getNoOfTransactionsNeeded()+" number of Transaction(s).");

			}else {

//				System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
				System.out.println("Target achieved can not be Achieved.");

			}					
		}		
	}
}


