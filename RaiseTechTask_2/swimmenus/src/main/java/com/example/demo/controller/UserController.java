package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Users;
import com.example.demo.mapper.UsersMapper;

@Controller
public class UserController {

	@Autowired
	UsersMapper usersMapper;

	@GetMapping("/users/login_form")
	public String login_form() {
		return "/users/login_form";
	}

	@RequestMapping(value = "/users/login_form" , method = RequestMethod.POST)
	public ModelAndView form_result(@ModelAttribute("formModel")Users users,
			ModelAndView mav) {
			usersMapper.save(users);
			mav.addObject("msg","登録しました");
			mav.setViewName("index");//indexに飛ぶ
		return mav;
	}



	@RequestMapping("/users/login")
	public String login() {
		return "/users/login";
	}


	@GetMapping("/users/usersList")
	public ArrayList<Users> usersList() {
		ArrayList<Users> list = usersMapper.findAll();
		return list;
	}


}


/*
@RequestMapping("/users/usersList")
public ModelAndView usersList(ModelAndView mav) {
	mav.setViewName("/users/usersList");
	ArrayList<Users> list = usersMapper.findAll();
	mav.addObject("usersList" , list);
	return mav;
}
*/
