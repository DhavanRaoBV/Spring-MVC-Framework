public class Employee {  
private int id;  
private String name;  
private String salary;

public Employee(int id, String name, String salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}  

public String toString(){  
    return id+" "+name+" "+salary;  
}  

}  