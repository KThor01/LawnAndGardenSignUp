import java.util.*;

public class Service {
    private String serviceName;
    private String description;
    private double servicePrice;
    private ArrayList<ServiceSignUp> signUps;

    public Service(String serviceName, String description, double servicePrice) {
        this.serviceName = serviceName;
        this.description = description;
        this.servicePrice = servicePrice;
        this.signUps = new ArrayList<>();
    }

    //Getters and Setters
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public ArrayList<ServiceSignUp> getSignUps() {
        return signUps;
    }

    public void setSignUps(ArrayList<ServiceSignUp> signUps) {
        this.signUps = signUps;
    }

    //Service Methods

    public void addSignUp(ServiceSignUp signUp) {
        signUps.add(signUp);
    }
}
