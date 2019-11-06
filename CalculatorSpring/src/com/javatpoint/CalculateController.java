package com.javatpoint;
import javax.servlet.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class CalculateController 
{  
    @RequestMapping("/hello")  
    public  ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res)
    {  
        String n1=request.getParameter("n1");  
        String n2=request.getParameter("n2");  
        int x=Integer.parseInt(n1);
        int y=Integer.parseInt(n2);
        String btn=request.getParameter("b1");
        
      if(btn.equals("add")){
    	  int result=x+y;
    	  String message="Result:"+result;
        return new ModelAndView("resultpage", "message", message);  
        }  
      else if(btn.equals("sub")){
    	  int result=x-y;
    	  String message="Result:"+result;
        return new ModelAndView("resultpage", "message", message);  
        }  
      if(btn.equals("mul")){
    	  int result=x*y;
    	  String message="Result:"+result;
        return new ModelAndView("resultpage", "message", message);  
        } 
      if(btn.equals("div")){
    	  int result=x/y;
    	  String message="Result:"+result;
        return new ModelAndView("resultpage", "message", message);  
        }
	return null; 
      }    
    }  


