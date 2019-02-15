package com.task;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
    protected void findStudentBySurname(String firstLetter) {
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students, new Student("Natalia", "Petrova", 21, "female", 3, "FEIT"),
                new Student("Misha", "Ponomarev", 21, "male", 3, "FEIT"),
                new Student("Dmitriy", "Senchuk", 21, "male", 3, "FEIT"),
                new Student("Maria", "Temnikova", 21, "female", 3, "FEIT"),
                new Student("Maria", "Steklova", 21, "female", 3, "FEIT"));
        students.stream().filter(student -> student.getFistSurnameLetter().equalsIgnoreCase(firstLetter))
                .forEach(System.out::println);
    }
}