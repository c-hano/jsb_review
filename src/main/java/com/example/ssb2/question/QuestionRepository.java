package com.example.ssb2.question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); // findBySubject 추상 메서드 선언

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

}
