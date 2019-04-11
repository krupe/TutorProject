package com.company.lesson_09;
// Заполнение массива из 10 чисел, числами от 29 до 20
public class Test_04 {
    public static void main(String[] args) {
        int[]array=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=29-i;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
