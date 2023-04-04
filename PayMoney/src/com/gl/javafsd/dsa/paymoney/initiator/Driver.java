package com.gl.javafsd.dsa.paymoney.initiator;

import com.gl.javafsd.dsa.paymoney.input_and_process.TransactionKeeper;

public class Driver {

	public static void main(String[] args) {



		TransactionKeeper keeper = new TransactionKeeper();

		keeper.process();

	}

}
