package com.company.lesson_09;
// Заполнение массива из 10 чисел, числами от 10 до 1
public class Test_02 {
    public static void main(String[] args) {


        int[] array = new int[10];

        for (int i = array.length - 1; i >= 0; i--) { // i = 9; 9 >= 0; i--
            array[i] = 10-i;    // [9] = 9+1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}