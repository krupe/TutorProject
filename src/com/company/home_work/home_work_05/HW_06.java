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
        System.out.println("Enter number1:");
        int num1 = Integer.parseInt(bf.readLine());
        System.out.println("Enter number2:");
        int num2 = Integer.parseInt(bf.readLine());


        if (num1 >= -100) {
            System.out.println(sum(num1, num2));
        }
    }

     private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
