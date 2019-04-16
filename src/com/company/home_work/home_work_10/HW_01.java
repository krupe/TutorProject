package com.company.home_work.home_work_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class HW_01 {
    public static void main(String[] args) throws IOException {
        String[] arr=new String[10];
        initializeArray(arr);
        int st=printArray(arr);
        System.out.println(st);
    }
    public static void  initializeArray(String[] arr) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <8 ; i++) {
            String st = bf.readLine();
            arr[i]=st;
        }

    }
    public static  int printArray(String[] arr)  {
       String s=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            s=arr[i];
            arr[i]=10-i;

        }
        return ;
    }
}
