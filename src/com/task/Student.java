package com.task;

public class Student extends Person {
    protected int course;
    protected String faculty;

    public Student(String name, String surname, int age, String sex, int course, String faculty) {
        super(name, surname, age, sex);
        this.course = course;
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFistSurnameLetter() {
        return this.surname.substring(0, 1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course= " + course +
                ", faculty= '" + faculty + '\'' +
                ", name= '" + name + '\'' +
                ", surname= '" + surname + '\'' +
                ", age= " + age +
                ", sex= " + sex +
                "}\n";
    }
}