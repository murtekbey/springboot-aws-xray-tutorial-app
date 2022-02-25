package com.murtekbey.aws.xraytutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@RestController
@XRayEnabled
@RequestMapping("/api")
@Slf4j
public class TestController {

	@RequestMapping("index")
	public String index() {
		log.info("Test log.");
		return "HERE";
	}
	
}