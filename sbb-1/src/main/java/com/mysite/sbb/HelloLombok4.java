package com.mysite.sbb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@NoArgsConstructor
@RequiredArgsConstructor //생성자 생성 시 필드 이름 앞에 final이 들어있는 필드만 argument 생성
//@AllArgsConstructor
public class HelloLombok4 {

	private final String hello;
	private int lombok;
	
	/* 		@RequiredArgsConstructor : 이름 앞에 final 키가 할당된 필드만 argument 등록
	 * 		public HelloLombok4(String hello){
	 * 			this.hello=hello
	 * }
	 * 
	 * */
	
	public static void main(String[] args) {
		
		HelloLombok4 lombok4=new HelloLombok4("안녕");
		
		System.out.println(lombok4);
	}

}
