public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts = 0;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(double checking, double savings){
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        System.out.println("Checking Balance:" + checkingBalance);
        return checkingBalance;
    }

    public double getSavingsBalance(){
        System.out.println("Savings Balance:" + savingsBalance);
        return savingsBalance;
    }

    public static int getAccounts(){
        System.out.println("number of accounts:" + accounts);
        return accounts;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public double checkingDeposit(double balance){
        checkingBalance = checkingBalance + balance;
        System.out.println("Checking Balance:" + checkingBalance + "\n");
        return checkingBalance;
    }

    public double savingsDeposit(double balance){
        savingsBalance = savingsBalance + balance;
        System.out.println("Savings Balance:" + savingsBalance + "\n");
        return savingsBalance;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    public double checkingWithdrawal(double balance){
        if(checkingBalance < balance){
            System.out.println("Insuficient Funds \n");
            return checkingBalance;
        }
        else{
            checkingBalance = checkingBalance - balance;
            System.out.println("Checking Balance after withdrawl:" + checkingBalance);
            return checkingBalance;
        }
    }

    public double savingsWithdrawal(double balance){
        if(savingsBalance < balance){
            System.out.println("Insuficient Funds \n");
            return savingsBalance;
        }
        else{
            savingsBalance = savingsBalance - balance;
            System.out.println("Savings Balance after withdrawl:" + savingsBalance);
            return savingsBalance;
        }
    }

    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void getBalance(){
        totalMoney = checkingBalance + savingsBalance;
        System.out.println("Total Funds:" + totalMoney);
    }

}