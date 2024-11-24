package com.example.designpattern.creational.factorymethod.videofacrory;

import com.example.designpattern.creational.factorymethod.video.PythonVideo;
import com.example.designpattern.creational.factorymethod.video.Video;

public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
