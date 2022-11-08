package com.javagenericsproblem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringMax {
	private static final Logger logger = LogManager.getLogger(App.class);
	
	// find the largest of three Comparable String objects
    String calculateMaximum(String[] ArrayOfStrings) {
        String max = ArrayOfStrings[0];   // initially assign String present 0th position to max variable
        if (ArrayOfStrings[1].length() > max.length()) {
            max = ArrayOfStrings[1];
        }
        if (ArrayOfStrings[2].length() > max.length()) {
            max = ArrayOfStrings[2];
        }
        return max;
    }

 // check that maximum(largest) String is present at second position
    void checkMaxAt2ndPos(String val, String max) {
        if (val.equals(max)) {
            logger.info("Max String is at Position 2! " + max);
        } else {
            logger.info("Max String is not present at Position 2! " + max);
        }
    }
}
