package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.repo.AnserRepository;
import com.example.demo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;

    @GetMapping("")
    public ResponseEntity<Iterable<Question>> findAll(){
        return new ResponseEntity<>(questionService.findAll(), HttpStatus.OK);
    }
}
