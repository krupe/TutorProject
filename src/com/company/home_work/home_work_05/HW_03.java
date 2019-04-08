package com.company.home_work.home_work_05;
/*
Вывести на экран квадрат 10х10 из букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class HW_03 {
    public static void main(String[] args) {

        int r = 0;
        int t;
        while (r <= 9) {
            r++;
            System.out.println();
            for (t = r; t <= 100; t += 10) {
                System.out.print("s");

            }
        }
    }
}