package org.example.Task1;



public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        Print.printArray("Your first array is ", array1);
        Print.printResult("The missing number is ",SearchOfMissingElementUtil.findMissingElement(array1));
        Print.printArray("Your second array is ", array2);
        Print.printResult("The missing number is ",SearchOfMissingElementUtil.findMissingElement(array2));

    }


}
