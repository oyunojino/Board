package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	@ResponseBody 		// ajax 활용할 때 사용		
	public void index() {
		// Q: 실행이 될까요??
		// A: 컨트롤러가 선언되어있지 않기 때문에 안됨 
		//System.out.println("인덱스입니다.");
	}
}
