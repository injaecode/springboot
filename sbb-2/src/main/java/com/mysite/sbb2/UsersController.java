package com.mysite.sbb2;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class UsersController {

	
		
		private final UsersRepository usersrepository;
		private final UsersService usersservice;
		
		@GetMapping("/users/list")
		@PostMapping("/users/list")
		public String list(Model model, @RequestParam(value="page", defaultValue="0") int page) {
			
//			List<Users> usersList= this.usersrepository.findAll();
//			List<Users> usersList= this.usersservice.getList();
			
			 Page<Users> paging = this.usersservice.getList(page);
		        model.addAttribute("paging", paging);
			
//			model.addAttribute("usersList", usersList);
			
			return "Users_list";
		}
		
		
		@GetMapping(value="/users_detail/{id}")
		public String detail(Model model, @PathVariable("id") Integer id) {
			Users u1= this.usersservice.getUser(id);
			
			model.addAttribute("users", u1);
			
			return "users_detail";
		}
		
		@GetMapping("/user_insert")
		public String userInsert(UsersForm usersForm) {
			return "user_insert";
		}
		
		@PostMapping("/insert_data")
		public String insertData(
				//@RequestParam String name,@RequestParam String pass,@RequestParam String email
				@Valid UsersForm usersForm, BindingResult bindingResult) {
			if(bindingResult.hasErrors()) {
				return "user_insert";
			}
			this.usersservice.insertData(usersForm.getName(), usersForm.getPass(), usersForm.getEmail());
			return "redirect:/users/list";
			
		}
}
