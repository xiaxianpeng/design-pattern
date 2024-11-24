package com.example.designpattern.creational.abstractfactory.coursefactory;

import com.example.designpattern.creational.abstractfactory.article.Article;
import com.example.designpattern.creational.abstractfactory.article.PythonArticle;
import com.example.designpattern.creational.abstractfactory.video.PythonVideo;
import com.example.designpattern.creational.abstractfactory.video.Video;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
