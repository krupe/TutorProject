package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        int[]array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            array[i]=Integer.parseInt(bf.readLine());
        }
        int[]array1=new int[5];
        int[]array2=new int[5];
        for (int i = array1.length; i <array.length ; i++) {
            for (int j = array2.length; j <array.length ; j++) {


                System.out.println(array[j]);
            }

        }

    }
}
