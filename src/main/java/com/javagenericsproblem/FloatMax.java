package com.javagenericsproblem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FloatMax {
	private static final Logger logger = LogManager.getLogger(App.class);

	float calculateMaximum(float[] ArrayOfFloat) {
		float max = ArrayOfFloat[0];
		if (ArrayOfFloat[1] > max) {
			max = ArrayOfFloat[1];
		}
		if (ArrayOfFloat[2] > max) {
			max = ArrayOfFloat[2];
		}
		return max;
	}

	<T>void checkMaxAt2ndPos(T val, T max) {
		if (val.equals(max)) {
			logger.info("Max Float is at Position 2 and its value is " + max);
		} else {
			logger.info("Max Float is not present at Position 2 and its value is " + max);
		}
	}
}
