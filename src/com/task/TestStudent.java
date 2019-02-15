package com.task;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first surname letter: ");
            String firstLetter = sc.next();
            Group group = new Group();
            group.findStudentBySurname(firstLetter);
        }
    }
}