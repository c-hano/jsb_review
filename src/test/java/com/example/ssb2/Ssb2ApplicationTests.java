package com.example.ssb2;

import com.example.ssb2.entity.Question;
import com.example.ssb2.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ssb2ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        List<Question> qList = this.questionRepository.findBySubjectLike("ssb%");
        Question q = qList.get(0);
        assertEquals("ssb가 무엇인가요?", q.getSubject());
    }
}


