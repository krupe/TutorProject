package com.company.home_work.home_work_02;
/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
Пример:
Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name:");
        String str = bf.readLine();
        System.out.println("Ваше число");
        String str2=bf.readLine();
        int number=Integer.parseInt(str2);
        System.out.println("Enter:");
        int number2=Integer.parseInt(bf.readLine());
        System.out.println(str+" получает "+number+" через "+number2+" лет.");

    }


}
