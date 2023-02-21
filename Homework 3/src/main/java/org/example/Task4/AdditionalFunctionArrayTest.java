package org.example.Task4;

public class AdditionalFunctionArrayTest {
    public static void main(String[] args) {
        int[] arrayTest = new NewArray(30).createArray();
        //        --------Test 1--------
        String message1 = "Result of Test 1 - creation array - ";
        int expectedArrayLength = 30;
        int actualArrayLength = arrayTest.length;
        printResult(message1, expectedArrayLength, actualArrayLength);

        int[] arrayTest2 = {66, 62, 36, 65, 87, 27, 66, 55, 53, 21, 68, 28, 40, 39, 63, 99, 36, 71, 53, 80, 33, 71, 72, 90, 45, 57, 62, 16, 49, 27};
        //        --------Test 2--------
        String message2 = "Result of Test 2 - find maximum - ";
        int actualMaxResult = AdditionalFunctionArray.findMaxMethod(arrayTest2,false);
        int expectedMaxResult = 99;
        printResult(message2, expectedMaxResult, actualMaxResult);
        //        --------Test 3--------
        String message3 = "Result of Test 3 - find minimum - ";
        int actualMinResult = AdditionalFunctionArray.findMinMethod(arrayTest2, false);
        int expectedMinResult = 16;
        printResult(message3, expectedMinResult, actualMinResult);
        //        --------Test 4--------
        String message4 = "Result of Test 4 - find arithmetic mean - ";
        int actualArithmeticMeanResult = AdditionalFunctionArray.findArithmeticMeanMethod(arrayTest2, false);
        int expectedArithmeticMeanResult = 54;
        printResult(message4, expectedArithmeticMeanResult, actualArithmeticMeanResult);
        //        --------Test 5--------
        String message5 = "Result of Test 5 - find difference between indexes of max and min numbers - ";
        int actualDifferenceResult = AdditionalFunctionArray.findDifferenceBetweenIndexesOfMaxAndMinNumbersMethod(arrayTest2, false);
        int expectedDifferenceResult = 12;
        printResult(message5, expectedDifferenceResult, actualDifferenceResult);
        //        --------Test 6--------
        String message6 = "Result of Test 6 - find first prime number - ";
        int actualFirstPrimeNumberResult = AdditionalFunctionArray.findFirstPrimeNumbersMethod(arrayTest2, false);
        int expectedFirstPrimeNumberResult = 53;
        printResult(message6, expectedFirstPrimeNumberResult, actualFirstPrimeNumberResult);
        //        --------Test 7--------
        String message7 = "Result of Test 7 - find last prime number - ";
        int actualLastPrimeNumberResult = AdditionalFunctionArray.findLastPrimeNumbersMethod(arrayTest2, false);
        int expectedLastPrimeNumberResult = 71;
        printResult(message7, expectedLastPrimeNumberResult, actualLastPrimeNumberResult);
        //        --------Test 8--------
        String message8 = "Result of Test 8 - find number of prime numbers - ";
        int actualNumberOfPrimeNumberResult = AdditionalFunctionArray.primeNumbersCountMethod(arrayTest2, false);
        int expectedNumberOfPrimeNumberResult = 4;
        printResult(message8, actualNumberOfPrimeNumberResult, expectedNumberOfPrimeNumberResult);

    }


    public static void printResult(String message, int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }
    }

}
