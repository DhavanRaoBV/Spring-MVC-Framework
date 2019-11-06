import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
 public class Test 
 {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
     Student student=(Student) factory.getBean("studentbean");  
    student.displayInfo();  
}  }  


//commons.logging.1.1.1.jar
//springframework.beans-3.0.1.Release-A.jar
//springframework.core-3.0.1.Release-A.jar
 
 
 
 
 
 