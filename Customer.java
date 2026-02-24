import java.util.*;

public class Customer {
    private String name;
    private String phone;
    private String email;
    private ArrayList<ServiceSignUp> signups;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Cuustomer Methods
    /*public void serviceSignUp(Service service){
        ServiceSignUp signup = new ServiceSignUp(this, service);
        signups.add(signup);
        service.addSignUp(signup);
    }*/
}
