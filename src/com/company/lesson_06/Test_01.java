package com.company.lesson_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 1) Пользователь вводит число от 1 до 4
 * 2) Если число не входит в диапазон от 1 до 4 - выводим сообщение "Неверное число!"
 * 3) Иначе вызываем соответсвующий метод:
 *  - если пользователь ввел 1, то отрабатывает метод subt, который должен вычесть второе число из первого, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 2, то отрабатывает метод sum, который должен найти сумму двух чисел, которые пользователь должен ввести дополнительно
 *  - если пользователь ввел 3, то отрабатывает метод multy, который должен  умножить первое число на второе, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 4, то отрабатывает метод div, который должен поделить два числа, которые пользователь должен ввести дополнительно
 * 4) После того, как один из методов отработал, выводим пользователю результат
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        sum(2, 3);
        subt(3, 1);
        multy(5, 5);
        div(6, 5);


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bf.readLine());


        if (num1 < 1 || num1 > 4) {
            System.out.println("Неверное число");
        }
        if (num1 == 1) {
            int num2 = Integer.parseInt(bf.readLine());
            System.out.println(subt(num2, num1));
        }
        if (num1 == 2) {

            int num3 = Integer.parseInt(bf.readLine());

            System.out.println(sum(num1, num3));
        }
        if (num1 == 3) {
            int num4 = Integer.parseInt(bf.readLine());
            System.out.println(multy(num1, num4));
        }
        if (num1 == 4) {
            int num5 = Integer.parseInt(bf.readLine());
            System.out.println(div(num5, num1));

        }


    }

    public static int subt(int num2, int num1) {
        return num2 - num1;
    }

    public static int sum(int num1, int num3) {

        return num1 + num3;
    }

    public static int multy(int num1, int num4) {
        return num1 * num4;
    }

    public static int div(int num5, int num1) {
        return num5 / num1;
    }
}

