package at.fhj.swd;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;


    public VipCustomer() {
        this("Default name", 5000.00, "default@email.com");
    }


    public VipCustomer(String name, double creditLimit) {
       this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
