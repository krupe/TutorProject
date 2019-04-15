package com.company.home_work.home_work_04;
/*Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу. Вывести результат на экран. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        int num=Integer.parseInt(bf.readLine());
        if(num>0){
            num=num*2;
            System.out.println(num);
        }else if(num<0){
            num=num+1;
            System.out.println(num);
        }

    }
}
