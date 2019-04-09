package com.company.lesson_07;
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Test_01 {
    public static void main(String[] args) {

        for (int i=1; i<=10;i++){

            for(int r=0;r<i;r++){
                System.out.print("8");

            }
           System.out.println();
        }

    }

}
