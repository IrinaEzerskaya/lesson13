package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> myPersonArrayList = new TreeSet<Person>();

        PersonSuperComparator person1 = new PersonSuperComparator("Иван Петрович", 32);
        PersonSuperComparator person2 = new PersonSuperComparator("Петр Иванович", 30);
        PersonSuperComparator person3 = new PersonSuperComparator("Евгений Семенович", 35);
        PersonSuperComparator person4 = new PersonSuperComparator("Иван Петрович", 28);

        myPersonArrayList.add(person1);
        myPersonArrayList.add(person2);
        myPersonArrayList.add(person3);
        myPersonArrayList.add(person4);

        for (Person p: myPersonArrayList) {
            System.out.println(p);
        }
    }
}
