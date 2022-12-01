package com.example.designpattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getVideo().produce();
        javaCourseFactory.getArticle().produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.getVideo().produce();
        pythonCourseFactory.getArticle().produce();
    }
}
