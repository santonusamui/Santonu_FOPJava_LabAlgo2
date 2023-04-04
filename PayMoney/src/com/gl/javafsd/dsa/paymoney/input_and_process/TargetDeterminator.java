package com.gl.javafsd.dsa.paymoney.input_and_process;

import com.gl.javafsd.dsa.paymoney.output.Result;

public class TargetDeterminator {

	private int[] noOfTransactionsRecordArray;
	private int dailyTarget;

	Result result = new Result();

	public TargetDeterminator(int [] noOfTransactionsRecordArray, int dailyTarget) {

		this.noOfTransactionsRecordArray = noOfTransactionsRecordArray;
		this.dailyTarget = dailyTarget;


	}

	public Result determine() {

		//		Iteration done over the array
		//		for each iteration we calculate the intermediate sum-value
		//		and compare the intermediate sum-value with the target, if it is achieved or not

		long tempSum = 0;
		result.setTargetAchievedOrNot(false);

		for (int index = 0;index < noOfTransactionsRecordArray.length;index++) {

			int transactionValue = noOfTransactionsRecordArray[index];

			tempSum = tempSum + transactionValue;

			if(tempSum >= dailyTarget) {

				result.setTargetAchievedOrNot(true);
				result.setNoOfTransactionsNeeded(index +1);

				break;

			}
			if (!result.isTargetAchievedOrNot()) {
				
				result.setNoOfTransactionsNeeded(-1);
			}

		}

	

	return result;

}

}
