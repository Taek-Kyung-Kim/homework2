package com.pen.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pen.web.service.AddtionService;
@Controller
public class AddtionServlet01 {
	@Autowired AddtionService addtionservice;
	@RequestMapping("/addtionServlet01")
	public ModelAndView main(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView("showMessage");
		//int num1 = 30, num2 = 20;
		//int result = num1 + num2;
		int result = addtionservice.AddSum(30,20);
		mav.addObject("message", result);
		return mav;
	}

}
