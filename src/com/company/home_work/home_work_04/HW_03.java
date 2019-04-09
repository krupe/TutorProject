package com.company.home_work.home_work_04;
//Реализовать метод checkInterval.
//Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить
// результат на экран в следующем виде: "Число а не содержится в интервале." или
// "Число а содержится в интервале.", где а - аргумент метода.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_03 {
    public static void main(String[] args) throws IOException {
        int a = input();
        checkInterval(a);


    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bf.readLine());
    }

    public static void checkInterval(int a) {
        if (a < 50 || a > 100) {
            System.out.println("Число " + a + " не содержится в интервале.");
        } else if (a > 50 && a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");

        }
    }
}





