package com.board.pra.answer;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.board.pra.question.Question;

import lombok.Getter;
import lombok.Setter;



// 엔티티 클래스
@Getter
@Setter
@Entity
public class Answer {
	@Id		
	// @Id : 기본키(PK) 지정(중복을 방지하기 위해서 지정)
	// 	   : 어노테이션이 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@Column(length = 200)
	// @Column : 컬럼의 세부설정 필요시 사용. 
	//private String subject;
	// 삭제 이유 --> 댓글에는 제목이 필요없기 때문에
	
	@Column(columnDefinition = "TEXT")
	// columnDefinition : 글자 수 제한 X
	private String content;
	
	// 컬럼 어노테이션이 없어도 컬럼으로 인식
	// 만약 컬럼으로 인식하고 싶지 않은 필드에는 @Transient
	private LocalDateTime createDate;
	
	@ManyToOne
	private Question question;
}
