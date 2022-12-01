package com.example.designpattern.creational.simplefactory;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        videoFactory.getVideo(JavaVideo.class).produce();
        videoFactory.getVideo(PythonVideo.class).produce();

       /* VideoFactory videoFactory = new VideoFactory();
        videoFactory.getVideo("python").produce();
        videoFactory.getVideo("java").produce();*/
    }
}
