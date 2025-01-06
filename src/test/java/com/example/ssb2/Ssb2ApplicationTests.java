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
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Ssb2ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        assertEquals(2, this.questionRepository.count());
        Optional<Question> q = this.questionRepository.findById(1);
        assertTrue(q.isPresent());
        Question q1 = q.get();
        this.questionRepository.delete(q1);
        assertEquals(1, this.questionRepository.count());
    }
}


