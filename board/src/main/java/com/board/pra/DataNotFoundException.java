package com.board.pra;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 데이터를 찾을 수 없더라도 404로 출력

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException {
	
	public DataNotFoundException(String message) {
		super(message);
	}
}
