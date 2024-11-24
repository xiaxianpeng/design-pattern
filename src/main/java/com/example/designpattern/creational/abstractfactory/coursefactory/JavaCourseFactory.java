package com.example.designpattern.creational.abstractfactory.coursefactory;

import com.example.designpattern.creational.abstractfactory.article.Article;
import com.example.designpattern.creational.abstractfactory.article.JavaArticle;
import com.example.designpattern.creational.abstractfactory.video.JavaVideo;
import com.example.designpattern.creational.abstractfactory.video.Video;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
