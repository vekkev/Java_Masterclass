package at.fhj.swd;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }


    public void withdrawFunds(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed!");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }


    }
}
