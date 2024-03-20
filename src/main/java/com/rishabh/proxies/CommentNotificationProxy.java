package com.rishabh.proxies;

import com.rishabh.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
