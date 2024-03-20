package com.rishabh;

import com.rishabh.model.Comment;
import com.rishabh.proxies.EmailCommentNotificationProxy;
import com.rishabh.repositories.DBCommentRepository;
import com.rishabh.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Rishabh");
        comment.setText("Demo Comment");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}