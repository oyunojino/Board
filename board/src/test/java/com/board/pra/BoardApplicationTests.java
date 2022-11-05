package com.board.pra;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	// @Autowired : 객체 자동생성 
	private QuestionRepository questionrepository;
	
	@Test
	// @Test : junit으로 테스트하라는 말
	void contextLoads() {
		
		Question q = new Question();
		q.setSubject("테스트중입니다.");
		q.setContent("고된 하루를 마치고 테스트중");
		q.setCreateDate(LocalDateTime.now());
		this.questionrepository.save(q);
		
		Question q2 = new Question();
		q2.setSubject("오늘은 사고가 참 많았네요ㅋㅋㅋ");
		q2.setContent("힘듬ㅠㅠ");
		q2.setCreateDate(LocalDateTime.now());
		this.questionrepository.save(q2);
	}

}

