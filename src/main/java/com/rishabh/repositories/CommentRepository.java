package com.rishabh.repositories;

import com.rishabh.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
