package com.company.lesson_05;
/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Test_06 {
    public static void main(String[] args) {

        int r = 8;
        for (int i = 0; i < 8; i += 4) {
            System.out.println(r);
        }
            for (int k = 0; k < 4; k += 2) {
                System.out.println(k);
            }


        }
    }
