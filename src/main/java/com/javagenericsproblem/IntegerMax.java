package com.javagenericsproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerMax {
	private static final Logger logger = LogManager.getLogger(App.class);

	// find the largest of three Comparable integer objects
	int calculateMaximum(int[] ArrayOfInputs) {
		int max = ArrayOfInputs[0]; // initially assign integer present 0th position to maxno variable
		if (ArrayOfInputs[1] > max) {
			max = ArrayOfInputs[1];
		}
		if (ArrayOfInputs[2] > max) {
			max = ArrayOfInputs[2];
		}
		return max;
	}

	// check that maximum(largest) number is present at second position
	<T> void checkMaxAt2ndPos(T val, T max) {
		if (val == max) {
			logger.info("Max Number is at Position 2! " + max);
		} else {
			logger.info("Max Number is not present at Position 2! " + max);
		}
	}
}