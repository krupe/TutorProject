package com.company.home_work.home_work_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Реализовать метод closeToTen.
//Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
// аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
//Если оба числа на равной длине к 10, то вывести на экран любое из них.
public class HW_04 {
    public static void main(String[] args) throws IOException {
        int a=input();
        int b=input();

    }
    public static int input() throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bf.readLine());

    }
    public static void closeToTen(int a,int b){



    }
}
