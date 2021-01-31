package com.company;

public class Person {

    // Имя пользователя
    private String name;

    // Возраст пользователя
    private int age;

    // Конструктор класса
    public Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    // Получить имя
    public String getName() {
        return this.name;
    }

    // Получить возраст
    public int getAge() {
        return this.age;
    }
}
