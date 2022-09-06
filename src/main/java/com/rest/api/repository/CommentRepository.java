package com.rest.api.repository;

import com.rest.api.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Long, Comment> {
    Optional<Comment> findById(Long id);

}
