package com.example.designpattern.creational.factorymethod.videofacrory;

import com.example.designpattern.creational.factorymethod.video.JavaVideo;
import com.example.designpattern.creational.factorymethod.video.Video;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
