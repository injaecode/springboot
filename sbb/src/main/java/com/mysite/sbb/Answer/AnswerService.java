package com.mysite.sbb.Answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.mysite.sbb.Question.Question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //생성자를 통해 객체 주입 : DI
@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	
	//답변 글을 저장하는 메소드, controller에서 question 생성해서 arg로 인풋
	public void create(Question question, String content) {
		//Answer 객체를 생성후 arg로 넘어오는 값을 setter주입
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		
		this.answerRepository.save(answer);
	}
}
