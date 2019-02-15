package com.task;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String sex;

    public Person(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String isSex() {
        return sex;
    }
}