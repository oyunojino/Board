package com.board.pra.question;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository를 생성하기 위해서는 JpaRepository 인터페이스를 상속받아야한다.
// JpaRepository를 상속할때는 제네릭으로 받아와야하며
// 엔티티타입(클래스명)과 해당 엔티티의 PK의 속성을 지정해야한다.

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	// 인터페이스도 상속 가능
}
