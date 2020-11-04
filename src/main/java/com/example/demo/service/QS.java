package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.repo.AnserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QS implements IQuestionService {
    @Autowired
    private AnserRepository repository;

    @Override
    public Iterable<Question> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Question> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Question save(Question question) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
