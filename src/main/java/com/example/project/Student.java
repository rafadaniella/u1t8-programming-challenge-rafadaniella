package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    private String firstName;
    private String lastName;
    private int gradYear;
    private double sumTestScores;  // starts at 0.0
    private int testScoreCount;    // starts at 0
    private double highestTestScore; // starts at 0.0

    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.sumTestScores = 0.0;
        this.testScoreCount = 0;
        this.highestTestScore = 0.0;
    }

    // returns firstName
    public String getFirstName() {
        return firstName;
    }

    // returns lastName
    public String getLastName() {
        return lastName;
    }

    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount() {
        return testScoreCount;
    }

    public int getGradYear() {
        return gradYear;
    }

    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    // adds newTestScore to accumulatedTestScores and increments testScoreCount by 1
    // sets new highest test score if applicable
    public void addTestScore(double newTestScore) {
        sumTestScores += newTestScore;
        testScoreCount++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }

    // returns true if the student's average test score is >= 65
    public boolean isPassing() {
        if (testScoreCount == 0) return false;
        return averageTestScore() >= 65.0;
    }

    // returns the Student's average test score
    public double averageTestScore() {
        if (testScoreCount == 0) return 0.0;
        return sumTestScores / testScoreCount;
    }

    // print info (for testing, not graded)
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
}
