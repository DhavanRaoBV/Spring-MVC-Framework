

public class Student
{  
	
	
	private int rollno;  
   private String name;
   private String address;
   private String grade;
   private String email;
   
 public Student() {
	 
 }
   

   
   
public Student(int rollno, String name, String address, String grade, String email) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
	this.grade = grade;
	this.email = email;
}



public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getGrade() {
	return grade;
}


public void setGrade(String grade) {
	this.grade = grade;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public void show() {
	
	System.out.println("Roll Number: "+rollno+"\n"+"Name: "+name+"\n"+"Address: "+address+"\n"+"Grade: "+grade+"\n"+"Email: "+email+"\n");
	
}

}




