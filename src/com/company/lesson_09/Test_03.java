package com.company.lesson_09;
// Заполнение массива из 10 чисел, числами от 10 до 19
public class Test_03 {
    public static void main(String[] args) {
        int[]array=new int[10];

        for (int i = 0; i<array.length ; i++) {//i=0;0>=0;array[0]=10+0=10;
            array[i]=10+i;   //
        }
        for (int i =0; i<array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
