package com.khadri.log4j.message;

import org.springframework.http.HttpStatus;

public class OrderResponse {
	private HttpStatus httpStatus;

	public OrderResponse(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
