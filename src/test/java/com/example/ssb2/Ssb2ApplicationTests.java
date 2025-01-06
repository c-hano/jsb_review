package com.example.ssb2;

import com.example.ssb2.entity.Answer;
import com.example.ssb2.entity.Question;
import com.example.ssb2.repository.AnswerRepository;
import com.example.ssb2.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;
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

        Optional<Question> oq = questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q); //해당 질문에 대한 답변 설정
        a.setCreateTime(LocalDateTime.now());
        this.answerRepository.save(a);

   }
}


