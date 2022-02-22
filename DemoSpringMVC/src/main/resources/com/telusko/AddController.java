package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class AddController
{
	@RequestMapping("/welcome")
	public ModelAndView helloworld()
	{
		ModelAndView model = new ModelAndView("display");
		model.addObject("msg","Hello Sagar!");
		return model;
	}
}
