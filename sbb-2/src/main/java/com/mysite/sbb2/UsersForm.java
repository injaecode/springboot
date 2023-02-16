package com.mysite.sbb2;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersForm {
	
	@NotEmpty(message="이름을 입력하세요.")
	@Size(max=10)
	private String name;
	
	@NotEmpty(message="비밀번호를 입력하세요.")
	@Size(max=10)
	private String pass;

	@NotEmpty(message="이메일을 입력하세요.")
	@Size(max=30)
	private String email;
	
	
}
