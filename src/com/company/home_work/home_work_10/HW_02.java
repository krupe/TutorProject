package com.company.home_work.home_work_10;
/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[5];

        int[] num = new int[5];

        for (int i = 0; i < str.length; i++) {

            str[i] = reader.readLine();
        }
        for (int t = 0; t < str.length; t++) {

            num[t] = str[t].length();
            System.out.println(num[t]);
        }
    }
}
