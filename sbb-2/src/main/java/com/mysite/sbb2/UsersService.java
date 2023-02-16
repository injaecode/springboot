package com.mysite.sbb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersRepository usersrepository;
	
//	public List<Users> getList() {
//		// TODO Auto-generated method stub
//		return this.usersrepository.findAll();
//	}

	   public Page<Users> getList(int page) {
		      List<Sort.Order> sorts = new ArrayList<>();
		        sorts.add(Sort.Order.desc("regdate"));
	        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
	        return this.usersrepository.findAll(pageable);
	    }
	
	public Users getUser(Integer id) {
		Optional<Users> op = this.usersrepository.findById(id);
		if(op.isPresent()) {
			return op.get();
		}else {
		throw new DataNotFoundException("파일 없음.");
		}
	}

	public void insertData(String name, String pass, String email) {
		Users users = new Users();
		users.setName(name);
		users.setPass(pass);
		users.setEmail(email);
		
		this.usersrepository.save(users);
		
	}


	
}
