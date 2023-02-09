package com.mysite.sbb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor    //기본 생성자 대체
@ToString
@AllArgsConstructor   //객체 생성 시 모든 필드의 값을 입력받아 필드의 초기값을 할당
public class HelloLombok3 {

	private String hello;
	private int lombok;
	
	/*
	 * public HelloLombok3(){}  <- 기본생성자: NoArgsConstructor 어노테이션 적용 시 자동 생성
	
		public HelloLombok3(String hello, int lombok{ <-@AllArgsConstructor 어노테이션 적용 시 자동 생성 
		this.hello = hello;
		this.lombok = lombok;
	} */
 	
	public static void main(String[] args) {
			
		
		//@AllArgsConstructor 테스트
		HelloLombok3 lombok3 = new HelloLombok3("안녕", 55);
		
		//필드 내용 출력
		System.out.println(lombok3.getHello());
		System.out.println(lombok3.getLombok());
		
		//toString 메소드 호출
		System.out.println(lombok3.toString());
	}

}
