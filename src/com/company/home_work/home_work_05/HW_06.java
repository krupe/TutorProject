package com.company.home_work.home_work_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class HW_06 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int a=0;
        sum(0,2);



        do {
             num = Integer.parseInt(bf.readLine());

        } while (num != -1);
//        System.out.println(sum(a,num));
        int s=num+a;
        System.out.println(s);
    }
    public static int sum(int num,int a){

        return a=+num;


    }
}