package carrentalsystem;

public class Car {
private String carnumber;
private String carmodel;
private boolean isAvailable;
private  double priceperhour;
public Car(String carnumber,String carmodel,boolean isAvailable, double priceperhour) {
	this.carnumber=carnumber;
	this.carmodel=carmodel;
	this.isAvailable=true;
	this.priceperhour=priceperhour;
}
public String getCarnumber() {
	return carnumber;
}


public String getCarmodel() {
	return carmodel;
}
public  double getpriceperhour() {
	return priceperhour;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean available) {
	this.isAvailable=isAvailable;
}
public String toString() {
	return "Car[number: "+carnumber+", model: "+carmodel+ ", price/hour: "+priceperhour+"' Available: "+isAvailable+"]";
}

}
