package com.example.ssb2;

import com.example.ssb2.entity.Question;
import com.example.ssb2.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ssb2ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {

		Question q = this.questionRepository.findBySubject("ssb가 무엇인가요?");
		assertEquals(1, q.getId());
		}
	}


