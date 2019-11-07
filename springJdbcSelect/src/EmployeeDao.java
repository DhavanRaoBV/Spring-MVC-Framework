/*RowMapper Interface
----------------------------------------
 It iterates the ResultSet internally and adds it into the collection.
 -------------------------------------------------------------- 
Advantage of RowMapper 
RowMapper saves a lot of code because it internally adds the data of ResultSet 
into the collection.
Method of RowMapper interface
---------------------------------------------------
It defines only one method mapRow that accepts ResultSet instance and int as 
the parameter list. Syntax of the method is given below:
----------------------------------------------------------
public T mapRow(ResultSet rs, int rowNumber)throws SQLException */

import java.sql.*;  
import java.util.List;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
public class EmployeeDao {  
private JdbcTemplate template;  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public List<Employee> getAllEmployeesRowMapper()
{  
 return template.query("select * from emp",new RowMapper<Employee>()
		 {  
    @Override  
  public Employee mapRow(ResultSet rs, int rownumber) throws SQLException 
    {  
        Employee e=new Employee();  
        e.setId(rs.getInt(1));  
        e.setName(rs.getString(2));  
        e.setSalary(rs.getString(3));  
       System.out.println(rownumber);
        return e;  
    }    });  }  }  