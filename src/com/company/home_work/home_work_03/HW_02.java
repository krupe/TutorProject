package com.company.home_work.home_work_03;
/*
1) Создать метод convert, который должен конвертировать гривны в доллары. В метод должен приходить один аргумент (к-во гривен). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter grivna:");
        int num1 = Integer.parseInt(bf.readLine());

        System.out.println("Enter:");
        int num2 = Integer.parseInt(bf.readLine());

        System.out.println("Enter some word:");
        String s = bf.readLine();

        System.out.println("Convert is: " + convert(num1) + "$");

        System.out.println("Percent is: " + percent(num2) + "%");

        print(s);
        print(s);
        print(s);
        print(s);
    }

     static double convert(double grivna) {
        return grivna / 27.2;
    }

    static double percent(double per) {

        return per * 0.1 + per;
    }

    static void print(String s) {
        System.out.println(s);

    }

}
