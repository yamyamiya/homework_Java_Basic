package org.example.Task1;

public class Task1WithCreationOfArray {
    public static void main(String[] args) {
        CreationOfArrayOfWholeNumbersUtil workingArray = new CreationOfArrayOfWholeNumbersUtil();
        int[] array1 = workingArray.creationOfArray();
        Print.printArray("Your first array is ", array1);
        Print.printResult("The missing number is ",SearchOfMissingElementUtil.findMissingElement(array1));
        int[] array2 = workingArray.shuffleArray(workingArray.creationOfArray());
        Print.printArray("Your second array is ", array2);
        Print.printResult("The missing number is ",SearchOfMissingElementUtil.findMissingElement(array2));

    }

}
