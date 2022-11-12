package com.board.pra.question;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

//@Repository : 이전에 작성했기 때문에 필요 x
@RequiredArgsConstructor
@Service
public class QuestionService {
	private final QuestionRepository questionrepository;
	
	public List<Question> getList() {
		return this.questionrepository.findAll();
	}
}
