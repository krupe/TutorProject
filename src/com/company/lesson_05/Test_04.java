package com.company.lesson_05;
/*
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Test_04 {
    public static void main(String[] args) {
        for (int v = 2; v <= 100; v += 2) {
            System.out.println(v);
        }

        int a = 0;
        for (int i = 0; i < 50; i++) {
            a = a + 2;
            System.out.println(a);
        }
    }
}
