import java.util.*;

public class LawnAndGardenApp {
    //Array Lists to store/keep track of customers
    ArrayList<String> hedgeCutting = new ArrayList<>();
    ArrayList<String> mowing = new ArrayList<>();
    ArrayList<String> planting = new ArrayList<>();
    ArrayList<String> weedKilling = new ArrayList<>();
    ArrayList<ServiceSignUp> allSignUps = new ArrayList<>();


    LawnAndGardenApp(){
    }

    public void application() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //Retrieving data from user
        boolean keepGoing = true;
        boolean addCustomer = true;

        int serviceChoice;

        String name;
        String phone;
        String email;

        //Creating objects to be used
        Customer customer = new Customer("", "", "");

        while (addCustomer) {
            ServiceSignUp signUp = new ServiceSignUp(customer);

            keepGoing = true;
            //Welcome user and prompt for data
            System.out.println("Welcome to Lawn & Garden App!");
            System.out.println("Enter '0' as your name to exit");
            System.out.println("Please enter your name, email, and phone number for service(s):");
            System.out.println("Name: ");
            name = input2.nextLine();

            if(name.equals("0")){
                addCustomer = false;
                break;
            }
            customer.setName(name);

            System.out.println("Phone: ");
            phone = input2.nextLine();
            customer.setPhone(phone);

            System.out.println("Email: ");
            email = input2.nextLine();
            customer.setEmail(email);


            while (keepGoing) {
                //Display Menu to User
                System.out.println("Enter in a choice number service to sign up");
                System.out.println("(1) Sign up for Hedge Cutting ($20)");
                System.out.println("(2) Sign up for Mowing ($30)");
                System.out.println("(3) Sign up for Planting ($25)");
                System.out.println("(4) Sign up for Weed Killing ($40)");
                System.out.println("(5) View all sign ups");
                System.out.println("(6) Exit");
                System.out.println("Choose a service: ");
                serviceChoice = input.nextInt();

                //Handling user choice from menu
                if (serviceChoice == 1) { // Hedge Cutting
                    signUp.addService(new Service("Hedge Cutting", "Cutting and trimming bushes/trees to maintain space.",20));
                    hedgeCutting.add(name);
                } else if (serviceChoice == 2) { // Mowing
                    signUp.addService(new Service("Mowing", "Trimming and maintaining lawn.",30));
                    mowing.add(name);
                } else if (serviceChoice == 3) { // Planting
                    signUp.addService(new Service("Planting", "Growing plants in your yard.",25));
                    planting.add(name);
                } else if (serviceChoice == 4) { // Weed Killing
                    signUp.addService(new Service("Weed Killing", "Making sure to kill weed and have it never grow again.",40));
                    weedKilling.add(name);
                } else if (serviceChoice == 5) { // View all sign ups
                    viewAllSignUps("(1) Hedge Cutting", hedgeCutting);
                    viewAllSignUps("(2) Mowing", mowing);
                    viewAllSignUps("(3) Planting", planting);
                    viewAllSignUps("(4) Weed Killing", weedKilling);
                } else if (serviceChoice == 6) {
                    keepGoing = false;
                }
            }
            allSignUps.add(signUp);
        }
        System.out.println("----- All Sign Ups -----");
        for(ServiceSignUp s : allSignUps){
            s.displaySignUp();
        }
    }

    public void viewAllSignUps(String nameOfList, ArrayList<String> listName){

        System.out.println(nameOfList);
        if(listName.size() == 0){
            System.out.println("No one signed up");
        }
        for(int i = 0; i <listName.size(); i++){
            System.out.println((i+1) + ". " + listName.get(i).toString());
        }
        System.out.println("____________________________________________________\n");
    }
}
