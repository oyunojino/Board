package com.board.pra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// # 어노테이션 = 기능있는 주석
// # lombok의 getter, setter 어노테이션을 통해 set,get등의 메서드를 궅이 작성하지 않아도
// 사용할 수 있도록 처리해주고 있음
// # RequiredArgsConstructor : 해당 속성을 필요로 하는 생성자가 롬복을 통해 자동 생성.
// 		--> 의존성 주입에도 사용한다.(자바코드로도 가능) 
@Getter
//@Setter
@RequiredArgsConstructor
public class LombokTest {

	// final : 상수로 변경
	private final String hello;
	private final int lombokInt;
	// 생성자 초기화 오류 : @RequiredArgsConstructor 생성자 초기화도 포함되어있기 때문에
	
	public static void main(String[] args) {
		
		LombokTest lombok = new LombokTest("0 0", 27275);
//		lombok.setHello("o o");
//		lombok.setLombokInt((2727275));
		
		System.out.println(lombok.getHello());
		System.out.println(lombok.getLombokInt());
	}

}
