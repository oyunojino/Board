package com.board.pra;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.ui.Model;

@RequiredArgsConstructor	// repository를 가져오려면 해야하는것
@Controller
public class MainController {
	
	private final QuestionRepository questionrepository;
	
	@RequestMapping("/question/list")
	//@ResponseBody
	// 위에꺼 주석처리해야지 프론트랑 연결됨
	//public Model list() {
	//public ModelAndView list() {
	public String list(Model model) {
		List<Question> questionList = this.questionrepository.findAll();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}
	
	@RequestMapping("/main")
	@ResponseBody 		// ajax 활용할 때 사용		
	public String index() {
		// Q: 실행이 될까요??
		// A: 컨트롤러가 선언되어있지 않기 때문에 안됨 
		//System.out.println("인덱스입니다.");
		return "인덱스에요!";
	}

}
