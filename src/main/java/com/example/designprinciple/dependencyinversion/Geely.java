package com.example.designprinciple.dependencyinversion;

public class Geely {
    private ICourse course;

    public void setiCourse(ICourse course) {
        this.course = course;
    }

   /*void studyChinese(ICourse course) {
        System.out.printf("study chinese");
    }

    void studyMath() {
        System.out.printf("study math");
    }

    void studyEnglish() {
        System.out.printf("study english");
    }*/

    void study() {
        course.studyCourse();
    }
}
