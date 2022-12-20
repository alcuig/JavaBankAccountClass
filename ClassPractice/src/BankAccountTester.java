import java.sql.SQLOutput;

public class BankAccountTester {
    public static void main (String[] args)
    {
        //create a bank account
        BankAccount account1 = new BankAccount("99786754", "Gayle Forcewind");
        // create another bank account
        BankAccount account2 = new BankAccount("99887776", "Stan Dandy-Liver");
        // make a deposit into the first account
        account1.deposit(1000);
        // make a deposit into the second account
        account2.deposit(2000);
        // set the interest rate, this change is effective for all objects of this class
        BankAccount.setInterestRate(10);

        // add interest to accounts
        account1.addInterest();
        account2.addInterest();
        // display account details
        System.out.println("Account number: "  + account1.getAccountNumber());
        System.out.println("Account name: "  + account1.getAccountName());
        System.out.println("Interest rate: " + BankAccount.getInterestRate());
        System.out.println("Current balance "  + account1.getBalance());
        System.out.println(); //prints blank line

        System.out.println("Account number: "  + account2.getAccountNumber());
        System.out.println("Account name: "  + account2.getAccountName());
        System.out.println("Interest rate: " + BankAccount.getInterestRate());
        System.out.println("Current balance "  + account2.getBalance());

    }
}
