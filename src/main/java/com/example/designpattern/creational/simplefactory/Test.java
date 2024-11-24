package com.example.designpattern.creational.simplefactory;

import com.example.designpattern.creational.simplefactory.video.JavaVideo;
import com.example.designpattern.creational.simplefactory.video.PythonVideo;

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
