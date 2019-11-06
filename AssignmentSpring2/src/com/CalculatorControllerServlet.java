package com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalculatorControllerServlet
{
	@RequestMapping("/com.calculator")  
	public ModelAndView calculate(HttpServletRequest request,HttpServletResponse response) {
		
		String num1=request.getParameter("n1");
		String num2=request.getParameter("n2");
		
		int x=Integer.parseInt(num1);
		int y=Integer.parseInt(num2);
		
      String button=request.getParameter("bt");
		
      if(button.equals("ADD")) {
			 int res=x+y;
			 String msg=" " +res;
			 return new ModelAndView("resultPage", "message", msg);
		}
		
		if(button.equals("SUB")) {
			int res=x-y;
			String msg=" " +res;
			return new ModelAndView("resultpage", "message", msg);
		}
		
		if(button.equals("MUL")) {
			  int res=x*y;
			  String msg=" " +res;
			  return new ModelAndView("resultpage", "message", msg);
		}
		
		if(button.equals("DIV")) {
			 int res=x/y;
			 String msg=" " +res;
			 return new ModelAndView("resultpage", "message", msg);
		}
		
		else
		{
			String msg="Cannot Display output";
			return new ModelAndView("resultpage", "message", msg);
		}
		}
	}



