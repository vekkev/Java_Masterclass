package at.fhj.swd;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("1234", 0.00, "Bob Brown",
                "myemail@bob.com", 8131);

        System.out.println(bobsAccount.getNumber());


        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.00);
    }
}
