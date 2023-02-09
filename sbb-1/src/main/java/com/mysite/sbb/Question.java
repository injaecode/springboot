package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
public class Question {
	@Id	//Primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY) //시퀀스 할당
	private Integer id;	//primary Key, 시퀀스 (1,1)
	
	@Column(length=200)	//컬럼 길이 200자까지 
	private String subject;
	
	@Column(columnDefinition = "TEXT") //컬럼의 속성 정의, text=글자수 제한 없이 사용
	private String content;
	
	private LocalDateTime createDate;
//	@Column(length=300)
//	private String addr;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //참조 엔티티의 속성명="question"
	private List<Answer> answerList;
	
}
