import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext
    		("applicationContext.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
   int status=dao.saveEmployee(new Employee(161,"Vinit1",35000));  
    System.out.println(status); 
   
    } 
}  


