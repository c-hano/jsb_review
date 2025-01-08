package com.example.ssb2;

import com.example.ssb2.answer.Answer;
import com.example.ssb2.question.Question;
import com.example.ssb2.answer.AnswerRepository;
import com.example.ssb2.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Ssb2ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;
    //@Autowired는 생성자가 선언이 필요없다

    @Test
    void testJpa() {

    }
}


