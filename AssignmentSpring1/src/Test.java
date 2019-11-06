
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

 
public class Test {  
    public static void main(String[] args) {  
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Student s=(Student)factory.getBean("s");  
        s.show();  
   
        
   
        Student s1=(Student)factory.getBean("s1");  
        s1.show(); 
    }  
}  