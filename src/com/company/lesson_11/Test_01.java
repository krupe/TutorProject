package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        int[] array=new int[5];
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <array.length ; i++) {
            array[i]=Integer.parseInt(bf.readLine());
            array[i]=4-i;
            for (int j = 4; j <array.length ; j++) {

            }
            System.out.println(array[i]);
        }
    }
}
