package org.example.Task1;

import java.util.Arrays;

public class SearchOfMissingElementUtil {
    public static int findMissingElement(int[] workingArray) {
        int missingElement = 1;
        Arrays.sort(workingArray);
        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] != workingArray[i - 1] + 1) {
                missingElement = workingArray[i - 1] + 1;
            }
        }
        return missingElement;

    }

}

