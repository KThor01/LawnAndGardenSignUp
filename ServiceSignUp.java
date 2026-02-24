import java.util.*;

public class ServiceSignUp {
    private Customer customer;
    private ArrayList<Service> services;

    public ServiceSignUp(Customer customer) {
        this.customer = customer;
        this.services = new ArrayList<>();
    }

    //Getter methods
    public Customer getCustomer() {
        return customer;
    }

    public void addService(Service service){
        services.add(service);
    }

    //Functions
    public void displaySignUp(){
        System.out.println("Customer: " + customer.getName());
        System.out.println("Services:");
        for(Service s: services){
            System.out.println("- " + s.getServiceName() + " $" + s.getServicePrice());
        }
        System.out.println("____________________________________________________\n");
    }
}
