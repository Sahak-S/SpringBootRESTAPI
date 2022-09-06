package com.rest.api.controller;

import com.rest.api.entity.Comment;
import com.rest.api.entity.dto.CommentDTO;
import com.rest.api.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/getAll")
    public ResponseEntity <List<Long>> getAllComment(){
        return new ResponseEntity<>(commentService.getAll(),HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity <Comment> createComment(@RequestBody CommentDTO dto){
        return new ResponseEntity<>(commentService.save(dto),HttpStatus.CREATED);
    }
}
