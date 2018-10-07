package at.fhj.swd;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerphoneNumber;

    public Account (){
        this("56789", 2.50, "Default name", "Default adress", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account (String number, double balance, String customerName,
                    String customerEmail, String customerphoneNumber){
        System.out.println("Account constructor with paramters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerphoneNumber = customerphoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerphoneNumber) {
        this("99999", 100.55  ,customerName, customerEmail, customerphoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New blanace is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

        public String getNumber () {
            return number;
        }

        public void setNumber (String number){
            this.number = number;
        }

        public double getBalance () {
            return balance;
        }

        public void setBalance ( double balance){
            this.balance = balance;
        }

        public String getCustomerName () {
            return customerName;
        }

        public void setCustomerName (String customerName){
            this.customerName = customerName;
        }

        public String getCustomerEmail () {
            return customerEmail;
        }

        public void setCustomerEmail (String customerEmail){
            this.customerEmail = customerEmail;
        }

        public String getCustomerphoneNumber () {
            return customerphoneNumber;
        }

        public void setCustomerphoneNumber (String customerphoneNumber){
            this.customerphoneNumber = customerphoneNumber;
        }
    }



