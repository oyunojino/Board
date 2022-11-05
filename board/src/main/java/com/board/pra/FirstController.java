package com.board.pra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayhi() {
		// 리턴문자를 수정했지만 페이지상의 내용은 변경되지 않았음
		// 로컬 WAS가 변경된 클래스를 리로딩 하지 않았음.
		return "토요일 아침부터ㅠㅠ";
	}
	// # Lombok
	// vo, dto => getter, setter
	// 자바 클래스에 getter, setter, 생성자 등을 자동을 만들어주는 도구.
	// 깔끔한 소스코드를 만들 수 있다.
	
	// # lombok cmd 창에
	//1. cd 경로
	//2. java –jar lombok.jar
	
	//프로젝트명 + Application 파일
	// 스프링부터의 시자을 담당하는 파일
	// @SpringBootApplication : 스프링부트의 설정을 관리하는 어노테이션
	
	// h2 경량 데이터베이스
	// # 데이터베이스를 이용하려면?
	// 쿼리를 통해 원하는 데이터들을 조회하거나 삭제할 수 있었음.
	// ORM을 통해 자바 문법으로 데이터베이스를 다룰 수 있다.
	// (자바문법으로 쿼리를 대신한다._)
	// # JPA(Java Persisence API) / 인터페이스
	//	-> 자바 ORM 기술 표준
	
	// Q : 제목 컬럼명이 subject 내용 컬럼이 content라 가정했을 때 쿼리를 이용해서
	// 	   데이터를 추가하려면?
	// insert into question(subject, content) values('1', '2')
	
	// Question q1 = new Question()
	// q1.setSubject("1");
	// this.questionRepository.save(q1)
	
	// # 엔티티(Entity)
	// 데이터베이스 테이블과 매핑되는 자바 클래스
	// 질문/답변
}
