package com.example.designpattern.creational.simplefactory;

import com.example.designpattern.creational.simplefactory.video.Video;

public class VideoFactory {

    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            // 通过反射机制，根据传入的Class对象动态创建对应的实例
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;
    }

    /**
     public Video getVideo(String type) {
     // 硬编码方式创建对象
     if ("java".equalsIgnoreCase(type)) {
     return new JavaVideo();
     }
     if ("python".equalsIgnoreCase(type)) {
     return new PythonVideo();
     }
     throw new IllegalArgumentException();
     }*/

}
