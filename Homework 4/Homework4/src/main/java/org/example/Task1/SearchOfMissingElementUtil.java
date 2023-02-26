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

//Your second array is [10, 11, 21, 17, 19, 5, 15, 13, 4, 9, 14, 18, 16, 20, 7, 2, 8, 3, 6, 12]
//The missing number is 0