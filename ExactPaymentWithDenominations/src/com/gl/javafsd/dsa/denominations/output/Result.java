package com.gl.javafsd.dsa.denominations.output;

import java.util.List;

import com.gl.javafsd.dsa.denominations.DenominationInstancePair;

import java.util.ArrayList;

public class Result {


	private boolean exactPaymentAchievedOrNot;
	private List<DenominationInstancePair> denominationInstancePairList;

	public Result() {
		denominationInstancePairList = new ArrayList<>();
	}

	public boolean isExactPaymentAchievedOrNot() {
		return exactPaymentAchievedOrNot;
	}
	public void setExactPaymentAchievedOrNot(boolean exactPaymentAchievedOrNot) {
		this.exactPaymentAchievedOrNot = exactPaymentAchievedOrNot;
	}
	public List<DenominationInstancePair> getDenominationInstanceList() {
		return denominationInstancePairList;
	}
	public void setDenominationInstancesList(List<DenominationInstancePair> denominationInstancesList) {
		this.denominationInstancePairList = denominationInstancesList;
	}	

}
