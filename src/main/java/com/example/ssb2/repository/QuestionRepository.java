package com.example.ssb2.repository;

import com.example.ssb2.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); // findBySubject 추상 메서드 선언
}
