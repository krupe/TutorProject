package com.company.home_work.home_work_09;
// Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
// Посчитать сумму элементов массива и вывести её на экран.
public class HW_02 {
    public static void main(String[] args) {
        int[]array={3,5,7,9,1};
        int sum=0;

        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];


        }
        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
        }
        System.out.println(sum);

    }
}
