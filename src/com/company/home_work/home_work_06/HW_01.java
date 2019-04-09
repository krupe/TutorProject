package com.company.home_work.home_work_06;

import static com.company.Main.a;

/* 1) Создать класс Dog с параметрами: name, age, tailLength. Подумай, какого типа должна быть каждая переменная.
 2) В выполняющем методе создать два объекта класса Dog и инициализировать их поля
 3) Вывести в консоль данные о каждой собаке в виде - "Name: [dog.name], age: [dog.age], tail length: [dog.tailLength]." */
public class HW_01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bim", 3, 15);
        Dog dog2 = new Dog("Bom", 4, 20);
        System.out.format("Name is %s, age = %d, power = %d\n", dog1.getName(), dog1.getAge(), dog1.getTailLength());
        System.out.println(dog2);
    }
}

class Dog {
    private String name;
    private int age;
    private int tailLength;


    public Dog(String name, int a, int tailLength) {

        this.name = name;
        this.age = a;
        this.tailLength = tailLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public String toString() {
        return String.format("Name is %s, age = %d, power = %d", this.name, age, tailLength);
    }

}