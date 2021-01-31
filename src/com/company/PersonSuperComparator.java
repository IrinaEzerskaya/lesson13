package com.company;

public class PersonSuperComparator extends Person implements Comparable<Person> {

    // Конструктор класса
    public PersonSuperComparator(String name, int age) {
        super(name, age);
    }

    // Индивидуальный метод сортировки
    @Override
    public int compareTo(Person nextPerson) {

        int result = getName().compareTo(nextPerson.getName());
        if (result != 0)
            return result;

        result = getAge() - nextPerson.getAge();
        if (result != 0)
            return (int) result / Math.abs( result );

        return 0;
    }

    @Override
    // Переопределяем метод таким образом, чтобы он возвращаем информацию о персоне в читабельном виде
    public String toString() {
        return "[name=" + this.getName() + ", age=" + this.getAge() + "]";
    }

}
