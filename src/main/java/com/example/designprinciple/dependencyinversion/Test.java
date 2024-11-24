package com.example.designprinciple.dependencyinversion;

public class Test {
    /*public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyChinese();
        geely.studyMath();
        geely.studyEnglish();
    }*/

    /*public static void main(String[] args) {
        Geely geely = new Geely();
        geely.study(new ChineseCourse());
        geely.study(new MathCourse());
    }*/

    public static void main(String[] args) {
        Student student = new Student();
        student.setCourse(new ChineseCourse());
        student.study();
        student.setCourse(new MathCourse());
        student.study();
    }
}
