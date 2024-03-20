package com.rishabh;

import com.rishabh.model.Comment;
import com.rishabh.proxies.EmailCommentNotificationProxy;
import com.rishabh.repositories.DBCommentRepository;
import com.rishabh.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Rishabh");
        comment.setText("Demo Comment");
        commentService.publishComment(comment);
    }
}