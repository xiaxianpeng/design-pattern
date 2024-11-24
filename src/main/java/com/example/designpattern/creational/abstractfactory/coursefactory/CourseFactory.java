package com.example.designpattern.creational.abstractfactory.coursefactory;

import com.example.designpattern.creational.abstractfactory.article.Article;
import com.example.designpattern.creational.abstractfactory.video.Video;

public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
