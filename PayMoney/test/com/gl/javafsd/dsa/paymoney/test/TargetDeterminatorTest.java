package com.gl.javafsd.dsa.paymoney.test;

import com.gl.javafsd.dsa.paymoney.input_and_process.TargetDeterminator;
import com.gl.javafsd.dsa.paymoney.output.Result;

public class TargetDeterminatorTest {

	public static void main(String[] args) {

				scenario1();
				scenario2();
				scenario3();


	}

	static void scenario1(){
		int [] transactionArray = {20,12,31};
		int target = 21;


		TargetDeterminator determinator = new TargetDeterminator(transactionArray, target);

		Result result = determinator.determine();

		if(result.isTargetAchievedOrNot()) {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved after "+result.getNoOfTransactionsNeeded()+" number of Transactions.");

		}else {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target can not be Achieved.");

		}

	}	

	static void scenario2(){
		int [] transactionArray = {20,12,31};
		int target = 19;


		TargetDeterminator determinator = new TargetDeterminator(transactionArray, target);

		Result result = determinator.determine();

		if(result.isTargetAchievedOrNot()) {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved after "+result.getNoOfTransactionsNeeded()+" number of Transactions.");

		}else {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved can not be Achieved.");

		}



	}	

	static void scenario3(){
		int [] transactionArray = {100};
		int target = 101;


		TargetDeterminator determinator = new TargetDeterminator(transactionArray, target);

		Result result = determinator.determine();

		if(result.isTargetAchievedOrNot()) {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved after "+result.getNoOfTransactionsNeeded()+" number of Transactions.");

		}else {

			System.out.println("Target achieved--->"+result.isTargetAchievedOrNot());
			System.out.println("Target achieved can not be Achieved.");

		}

	}	

}
