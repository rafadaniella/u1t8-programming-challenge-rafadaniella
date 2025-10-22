package com.example.project;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student("Ella", "Gabinete", 2025);
        s.addTestScore(80);
        s.addTestScore(90);
        s.addTestScore(70);
        s.printStudentInfo();
    }
}