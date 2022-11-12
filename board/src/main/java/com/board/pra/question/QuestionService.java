package com.board.pra.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.board.pra.DataNotFoundException;

import lombok.RequiredArgsConstructor;

//@Repository : 이전에 작성했기 때문에 필요 x
@RequiredArgsConstructor
@Service
public class QuestionService {
	private final QuestionRepository questionrepository;
	
	public List<Question> getList() {
		return this.questionrepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		// Optional 객체란 nullpointerexception(NTE) 방지하려고 쓰는 클래스
		Optional<Question> question = this.questionrepository.findById(id);
		
		//.isPresent() : 해당 데이터가 있는지 없는지 검사
		if(question.isPresent()) {
			return question.get();
		}
		else {
			// 예외처리 직접 생성!!
			throw new DataNotFoundException("question not found");
		}
	}
}
