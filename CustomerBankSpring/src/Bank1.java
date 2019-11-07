public class Bank1 
{  
private String accno;  
private String bankName;  
private String balance;

public Bank1() {
	
}

public Bank1(String accno, String bankName, String balance) {
	super();
	this.accno = accno;
	this.bankName = bankName;
	this.balance = balance;
}

@Override
public String toString() {
	return "Bank1 [accno=" + accno + ", bankName=" + bankName + ", balance=" + balance + "]";
}

}
