package org.example.Task3;

import java.util.Arrays;

public class ArrayWithFunction {

    public static void main(String[] args) {
        functionForSequence1();
        functionForSequence2();
        functionForSequence3();
        functionForSequence4();
        functionForSequence5();
        functionForSequence6();
        functionForSequence7();
        functionForSequence8();
        functionForSequence9();
        functionForSequence10();

    }

    public static void functionForSequence1() {
        int[] array = new int[10];
        array[0] = 2;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1]+2;
        }
        System.out.println("1 sequence: "+Arrays.toString(array));
    }

    public static void functionForSequence2() {
        int[] array = new int[10];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1]+2;
        }
        System.out.println("2 sequence: "+Arrays.toString(array));
    }

    public static void functionForSequence3() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow((i+1),2);
        }
        System.out.println("3 sequence: "+Arrays.toString(array));
    }

    public static void functionForSequence4() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow((i+1),3);
        }
        System.out.println("4 sequence: "+Arrays.toString(array));
    }
    public static void functionForSequence5() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
        System.out.println("5 sequence: "+Arrays.toString(array));
    }
    public static void functionForSequence6() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i+1;
            } else {
                array[i] = (i+1)*(-1);
            }
        }
        System.out.println("6 sequence: "+Arrays.toString(array));
    }

    public static void functionForSequence7() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if(i%2==0){
            array[i] = (int)Math.pow((i+1),2);
        }else{
                array[i] = -(int)Math.pow((i+1),2);
            }
        }
        System.out.println("7 sequence: "+Arrays.toString(array));
    }
    public static void functionForSequence8() {
        int[] array = new int[10];
        array[0]=1;
        for (int i = 1; i < array.length; i++) {
            if ( i % 2 == 0 ) {
                array[i] = array[i-2]+1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("8 sequence: "+Arrays.toString(array));
    }
    public static void functionForSequence9() {
        int[] array = new int[10];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1]*(i+1);
        }
        System.out.println("9 sequence: "+Arrays.toString(array));
    }

    public static void functionForSequence10() {
        int[] array = new int[10];
        array[0]=1;
        array[1]=1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-2]+array[i-1];
        }
        System.out.println("10 sequence: "+Arrays.toString(array));
    }
}
