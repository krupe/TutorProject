package com.company;

// public protected default private
// [20]4 byte

public class Main {
    public static int a = 30; // [35]
    public int age = 20;           // [] [] [] [] [] [] []

    public static void main(String[] args) {
        byte b = 127; // 1 byte = 8 bit = 2^8  Byte
        short s = 32000; // 2 byte = 16 bit = 2^16 Short
        char c = 'a'; // 2 byte = 16 bit    Character
        int i = 536435236; // 4 byte = 32 bit   Integer
        boolean bool = true; // 4 byte = 32 bit Boolean
        float fl = 32.4f;     // 4 byte          Float
        long l = 7216356343434345L; // 8 byte = 64 bit = 2^64 Long
        double d = 34.6;     // 8 byte  Double
        i = 20;
        String str = "30";
        str = "50";
        Integer num = new Integer(435);

        int nm = Integer.parseInt(str);
        System.out.println("Sum = " + (nm + 2) + ", " + str);
        System.out.format("Sum = %d, %s, %f", nm+2, str, fl);
        System.out.println();
        System.out.println(sum(i, 30));
        System.out.println(sum(34657, 654));

        System.out.println("--------------------------");
        Main m1 = new Main();
        Main m2 = new Main();
        System.out.println(m1.age); // 20
        System.out.println(m2.age); // 20
        System.out.println(m1.a); // 30
        System.out.println(m2.a); // 30
        m1.age = 50;
        m1.a = 70;
        System.out.println(m1.age); // 50
        System.out.println(m2.age); // 20
        System.out.println(m1.a); // 70
        System.out.println(m2.a); // 70

        System.out.println("--------------------------");


    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
