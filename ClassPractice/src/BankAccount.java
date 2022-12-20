public class BankAccount {

    // declare the attributes of the Class
    private String accountNumber;
    private String accountName;
    private double balance;
    private static double interestRate; /* this is a class attribute. this means that :
    1. the same value will be replicated across all objects of this class
    2. if this attribute is modified, it will be modified across all objects of this class.
    */

    /* The word "static", just like "public" or "private", is a MODIFIER.
    Modifiers determine the way a particular Class, method or attribute is accessed.
    In order to access this attribute you need to declare CLASS METHODS aka declare methods that access
    the attribute as static.
    A class method is called using the class name instead of the object name.
     */

    // the methods

    // the constructor
    public BankAccount (String numberIn, String nameIn)
    {
        accountNumber = numberIn;
        accountName= nameIn;
        balance = 0;
        // interestRate attriute if not given an initial value, will be given a default value of 0/false/null by the com.
    }
    /* when a new object of the class BankAccount is created, the balance will be assigned the value 0 in all cass,
     while its attributes will be assigned the values of the parameters passed to the method*/

    // methods to read the attributes (which have been declared as private)
    public String getAccountName()
    {
            return accountName;
    }
        ;
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    // methods to deposit and withdraw money
    public void deposit(double amountIn)
    {
        balance = balance + amountIn;
    }

    public boolean withdraw(double amountIn)
    {
        if (amountIn > balance)
        {
            return false; //no withdrawal was made
        }
        else
        {
            balance = balance - amountIn;
            return true; //
        }
    }

    // 2 class methods that allow us to read and write to the class attribute (interestRate)
    public static void setInterestRate(double rateIn)
    {
        interestRate = rateIn;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    // method that adds interest rate to the customer's balance
    public void addInterest()
    {
        balance = balance + (balance * interestRate) /100;
    }
}
