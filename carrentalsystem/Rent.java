package carrentalsystem;

import java.util.ArrayList;
import java.util.List;
public class Rent {
    private List<Car> cars;
    private List<Customer> customers;

    public Rent() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showAvailableCars() {
        System.out.println("Available cars: ");
        boolean foundAvailableCar = false;
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
                foundAvailableCar = true;
            }
        }
        if (!foundAvailableCar) {
            System.out.println("No cars are currently available.");
        }
    }

    
    public boolean bookCar(String carnumber, int custid, int hours) {
        Car selectedCar = null;
        for (Car car : cars) {
            if (car.getCarnumber().equals(carnumber) && car.isAvailable()) {
                selectedCar = car;
                break;
            }
        }

        if (selectedCar == null) {
            System.out.println("Car not available or invalid car number.");
            return false;
        }

       
        Customer customer = getCustomerById(custid);
        if (customer == null) {
            System.out.println("Invalid customer ID.");
            return false;
        }

        
        double totalRent = selectedCar.getpriceperhour() * hours;
        System.out.println("Total rent for " + hours + " hours: " + totalRent);

        
        selectedCar.setAvailable(false);
        System.out.println("Car " + carnumber + " booked successfully for customer ID " + custid);
        return true;
    }

    private Customer getCustomerById(int custid) {
        for (Customer customer : customers) {
            if (customer.getCustid() == custid) {
                return customer;
            }
        }
        return null;
    }

    public void showCustomers() {
        System.out.println("Customers: ");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }
}
