package com.board.pra.question;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import com.board.pra.answer.Answer;

import lombok.Getter;
import lombok.Setter;

// # 엔티티 클래스
// 아래의 클래스들이 DB테이블을 대신한다.
// (DB 테이블과 매핑된다.)

@Getter
@Setter
@Entity		// 엔티티 클래스임을 명시함
// build.gradle에 JPA를 추가해야 실행가능함
public class Question {
	
	@Id		
	// @Id : 기본키(PK) 지정(중복을 방지하기 위해서 지정)
	// 	   : 어노테이션이 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//mysql 계열 : auto_increment
	private Integer id;
	
	@Column(length = 200)
	// @Column : 컬럼의 세부설정 필요시 사용. 
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	// columnDefinition : 글자 수 제한 X
	private String content;
	
	// 컬럼 어노테이션이 없어도 컬럼으로 인식
	// 만약 컬럼으로 인식하고 싶지 않은 필드에는 @Transient
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
	
}
