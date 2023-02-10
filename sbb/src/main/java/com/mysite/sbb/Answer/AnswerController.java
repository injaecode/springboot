package com.mysite.sbb.Answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.Question.Question;
import com.mysite.sbb.Question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
	
	private final QuestionService questionService;
	private final AnswerService answerService;
	
	//localhost:9090/answer/create/1 요청에 대한 답변글 등록 처리
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id,
			@RequestParam String content) {
		
		Question question = this.questionService.getQuestion(id);
		//답변 내용을 저장하는 메소드 호출 (service에서 호출)
			this.answerService.create(question, content);
			return String.format("redirect:/question/detail/%s", id);
	}
}
