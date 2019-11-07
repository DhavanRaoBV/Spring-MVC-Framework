public class Customer {  
private int custId;  
private String name;
private String address;
private Bank1 bank1;
private Bank2 bank2;

 public Customer()
 {
	 System.out.println("default cons");
 }  
 
 


public Customer(int custId, String name, String address, Bank1 bank1, Bank2 bank2) {
	super();
	this.custId = custId;
	this.name = name;
	this.address = address;
	this.bank1 = bank1;
	this.bank2 = bank2;
}



void show(){  
    System.out.println("Customer Id:"+custId+"\n"+"Name:"+name+"\n"+"Address:"+address);  
    
    System.out.println(bank1.toString());  
    System.out.println(bank2.toString());
}   






}  



