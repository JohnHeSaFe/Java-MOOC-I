
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account johnAccount = new Account("john", 100.0);

        johnAccount.deposit(20.0);

        System.out.println(johnAccount);
    }
}
