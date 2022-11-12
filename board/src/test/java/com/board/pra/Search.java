package com.board.pra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;



@SpringBootTest
public class Search {
	
	@Autowired
	private QuestionRepository questionrepository;
	
	// JPA를 통한 데이터 조회
	@Test
	void testjpa() {
		// questionrepository는 인터페이스
		List<Question> all = this.questionrepository.findAll();
		// # assertEquals(기대값, 실제값)
		// 인스턴스(all)에 들어있는
		// 기대값이 실제값과 동일하지 않으면 테스트는 실패 처리된다.
		assertEquals(6, all.size());
		
		Question q = all.get(0);
		assertEquals("고된 하루를 마치고 테스트중", q.getSubject());
	}
}
