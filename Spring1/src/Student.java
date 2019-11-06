public class Student 
{  
private int empid;
private String name,address;
public void setEmpid(int empid) {
	this.empid = empid;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
public void displayInfo(){  
    System.out.println("the empid is "+empid+"name is "+name+"the address is "
+address );  
}  
}  



