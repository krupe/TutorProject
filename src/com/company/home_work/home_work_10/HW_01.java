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

        String[] arr = initializeArray();
        printArray(arr);

    }
    public static  String[] initializeArray() throws IOException {
        String[] arr=new String[10];
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <8 ; i++) {

            arr[i]=bf.readLine();
        }
        return arr;

    }
    public static void printArray(String[] arr1)  {


        for (int i = arr1.length-1; i >=0; i--) {

            System.out.println(arr1[i]);

        }


    }
}
