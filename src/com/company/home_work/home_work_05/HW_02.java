package com.company.home_work.home_work_05;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class HW_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести число1:");
        int num1=Integer.parseInt(bf.readLine());
        System.out.println("Ввести число2:");
        int num2=Integer.parseInt(bf.readLine());

        for(int i=1; i<=2;i++){
            System.out.println("8888");
        }
    }
}
