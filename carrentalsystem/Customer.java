package carrentalsystem;

public class Customer {
private int custid;
private String name;
private String phonenumber;

public Customer (String name,int custid,String phonenumber) {
	this.custid=custid;
	this.name=name;
	this.phonenumber=phonenumber;
  }
 
public int getCustid() {
	return custid;
}

public String getName() {
	return name;
}
public String getPhonenumber() {
	return phonenumber;
}

public String toString() {
	return "Customer [ID: "+custid+", name: "+name+",phonenumber: "+phonenumber+"]";
}
}
