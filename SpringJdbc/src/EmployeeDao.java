import org.springframework.jdbc.core.JdbcTemplate;  
  
public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
{  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e){  
    String query="insert into empl values" +
    		"(' "+e.getId()+" ','"+e.getName()+"','"+e.getSalary()+"')";  
    return jdbcTemplate.update(query);  
}
  
}  