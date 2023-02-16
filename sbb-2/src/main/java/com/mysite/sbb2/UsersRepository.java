package com.mysite.sbb2;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Integer> {

	List<Users> findAllByOrderByRegdateDesc();

	Page<Users> findAll(Pageable pageable);
	

}
