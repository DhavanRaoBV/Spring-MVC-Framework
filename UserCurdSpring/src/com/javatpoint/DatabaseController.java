package com.javatpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.sql.DriverManager;
import java.sql.*;

@Controller
public class DatabaseController 
{

	@RequestMapping("/db")  
    public  ModelAndView addUser(HttpServletRequest request,HttpServletResponse res)
    {  
		String a=request.getParameter("t1");
		String b=request.getParameter("t2");
		String c=request.getParameter("t3");
		
		String button=request.getParameter("b1");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
			
			
			if(button.equals("Insert")) {
		
			PreparedStatement st=con.prepareStatement("insert into emp values(?,?,?)");
			st.setString(1, a);
			st.setString(2, b);
			st.setString(3, c);

			st.execute();
			String msg="Rows Inserted";
			return new ModelAndView("resultpage","message",msg);
			}
			
			
				if(button.equals("Update")) {
				
				
				PreparedStatement st=con.prepareStatement("update emp set name=?,address=? where id=?");
				
				st.setString(1, b);
				st.setString(2, c);
				st.setString(3, a);
				
				st.execute();
				String msg="Rows Updated";
				return new ModelAndView("resultpage","message",msg);
				
			}
			
			if(button.equals("Delete")) {
				
				PreparedStatement st=con.prepareStatement("delete from emp where id=?");
				st.setString(1, a);
				st.execute();
				String msg="Row Deleted";
				return new ModelAndView("resultpage","message",msg);
				
				
			}
			
			if(button.equals("Select")) {
				PreparedStatement st=con.prepareStatement("select * from emp");
				ResultSet rs=st.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
			
			
			}
		
		catch(Exception ae) {
			
			ae.printStackTrace();
			}
		
			
		return null;
    }
}




