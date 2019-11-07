public class Bank2 
{  
private String accno;  
private String bankName;  
private String balance;

public Bank2() {
	
}


public Bank2(String accno, String bankName, String balance) {
	super();
	this.accno = accno;
	this.bankName = bankName;
	this.balance = balance;
}


@Override
public String toString() {
	return "Bank2 [accno=" + accno + ", bankName=" + bankName + ", balance=" + balance + "]";
}

}
