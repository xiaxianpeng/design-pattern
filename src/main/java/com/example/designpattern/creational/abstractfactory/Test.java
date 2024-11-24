package com.example.designpattern.creational.abstractfactory;

import com.example.designpattern.creational.abstractfactory.coursefactory.CourseFactory;
import com.example.designpattern.creational.abstractfactory.coursefactory.JavaCourseFactory;
import com.example.designpattern.creational.abstractfactory.coursefactory.PythonCourseFactory;

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
