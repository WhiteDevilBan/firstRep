package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping("contestRoom")
	public @ResponseBody String hello(HttpServletRequest request){

		String p = request.getParameter("p");


		return null;
	}

	@RequestMapping("discuss/{id}")
	public @ResponseBody String p(HttpServletRequest request){

		String p = request.getParameter("p");


		return null;
	}
}