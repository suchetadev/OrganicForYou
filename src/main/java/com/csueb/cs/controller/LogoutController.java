package com.csueb.cs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		
		request.getSession().setAttribute("authenticated", "disabled");
		request.getSession().setAttribute("admin", "disabled");
		request.removeAttribute("mycart");
		return "home";
		
	}
	
}
