package com.mysite.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/Hello")
	@ResponseBody
	public String Hello() {
		return "Hello World 수정 확인 / 추가수정 / 추추가";
	}
}
