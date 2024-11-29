package carrentalsystem;


import java.util.Scanner;


import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent r = new Rent();
        
        
        r.addCar(new Car("C001", "Shift", true, 200));
        r.addCar(new Car("C002", "Honda Civic", true, 300));
        r.addCar(new Car("C003", "Ford Focus", true, 250)); 
        r.addCar(new Car("C004", "Volkswagen Golf", true, 350));  

        
        r.addCustomer(new Customer("Prakash", 101, "875443366"));
        r.addCustomer(new Customer("Ranjith", 102, "878654333"));
        r.addCustomer(new Customer("Pavan", 103, "964356544"));
        
        int choice;
        do {
            
            System.out.println(" Car Rental System ");
            System.out.println("1. Show Available Cars");
            System.out.println("2. Add Customer");
            System.out.println("3. Book a Car");
            System.out.println("4. Show All Customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch(choice) {
                case 1:
                    r.showAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter the custid: ");
                    int custid = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the phone number: ");
                    String phonenumber = sc.nextLine();
                    r.addCustomer(new Customer(name, custid, phonenumber));
                    System.out.println("Customer added successfully.");
                    break;
                case 3:
                    System.out.print("Enter car number to book: ");
                    String carnumber = sc.nextLine(); 
                    System.out.print("Enter customer ID: ");
                    custid = sc.nextInt();
                    System.out.print("Enter rental duration in hours: ");
                    int hours = sc.nextInt();
                    r.bookCar(carnumber, custid, hours);
                    break;
                case 4:
                    r.showCustomers();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close(); 
    }
}
