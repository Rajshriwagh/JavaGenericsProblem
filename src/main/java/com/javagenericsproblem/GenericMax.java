package com.javagenericsproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericMax<T> {
	private static final Logger logger = LogManager.getLogger(App.class);

	<T extends Comparable<T>> T calculateMaximumString(T... ArrayOfStrings) {
		T max = ArrayOfStrings[0];
		if (((String) ArrayOfStrings[1]).length() > ((String) max).length()) {
			max = ArrayOfStrings[1];
		}
		if (((String) ArrayOfStrings[2]).length() > ((String) max).length()) {
			max = ArrayOfStrings[2];
		}
		return max;
	}

	int calculateMaximum(int[] ArrayOfInputs) {
		int max = ArrayOfInputs[0];
		if (ArrayOfInputs[1] > max) {
			max = ArrayOfInputs[1];
		}
		if (ArrayOfInputs[2] > max) {
			max = ArrayOfInputs[2];
		}
		return max;
	}
	float calculateMaximumFloat(float[] ArrayOfInputs) {
		float max = ArrayOfInputs[0];
		if (ArrayOfInputs[1] > max) {
			max = ArrayOfInputs[1];
		}
		if (ArrayOfInputs[2] > max) {
			max = ArrayOfInputs[2];
		}
		return max;
	}

	static <T> void checkMaxAt2ndPos(T val, T max) {
		if (val == (max)) {
			logger.info("Max is at Position 2 and its value is " + max);
		} else {
			logger.info("Max is not present at Position 2 and its value is " + max);
		}
	}

	public int calculateMaximumInteger(int[] arrayOfInputs) {
		return 0;
	}

	public float calculateMaximum(float[] arrayOfInputs2) {
		return 0;
	}
	
}
