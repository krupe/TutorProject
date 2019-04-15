package com.company.home_work.home_work_09;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
public class HW_03 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1};
       int min=arr[4];

       for (int i = 0; i < arr.length; i++) {
           if(arr[i]<min){
               arr[i]=min;
           }
        }
        System.out.println(min);
    }
}
