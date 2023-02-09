package com.mysite.sbb;

import java.sql.Date;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class HelloLombok2 {
	
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloLombok2 lombok2 = new HelloLombok2();
		
		lombok2.setSeq(5);
		lombok2.setTitle("인사하는 오리");
		lombok2.setWriter("킹세종");
		lombok2.setContent("안녕하세요");
		//lombok2.setRegdate(23/02/06);
		lombok2.setCnt(0);
		
		System.out.println(lombok2.getSeq());
		System.out.println(lombok2.getTitle());
		System.out.println(lombok2.getWriter());
		System.out.println(lombok2.getContent());
		System.out.println(lombok2.getCnt());
		
		System.out.println(lombok2.toString());
	}

}
