package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	@Override
	public int getPerformance() {
		int res=(getTorque() * getRpm())/5252;
		return res;
	}
}
