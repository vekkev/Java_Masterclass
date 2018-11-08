package at.fhj.swd;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer() {
        this("Felix Mustermann", 100.00, "email@felix-mustermann.at");
    }


    public VipCustomer(String name, String emailAddress) {
        this(name, 100.00, emailAddress);

    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
