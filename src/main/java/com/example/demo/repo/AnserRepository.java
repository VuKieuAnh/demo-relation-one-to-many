package com.example.demo.repo;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnserRepository extends JpaRepository<Question, Long> {
}
