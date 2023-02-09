package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		//Springboot Framework에 HelloController 빈 등록
public class HelloController {
	
		@GetMapping("/hello")
		@ResponseBody
		public String hello() {	//retrun: string
			 return "Hello World -My website";
			 
		}
}
