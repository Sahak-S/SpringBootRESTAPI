package com.rest.api.service;

import com.rest.api.entity.Comment;
import com.rest.api.entity.dto.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CommentService {

    List<Long> getAll();

    Optional<Comment> findById(Long id);

    Comment save(CommentDTO dto);
}
