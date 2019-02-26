package com.projekt.zpi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@GetMapping("/")
	public HttpStatus getHttpstatus() {
		return HttpStatus.OK;
	}
}
