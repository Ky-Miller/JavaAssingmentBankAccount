public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount testAccount = new BankAccount(900, 0);
        BankAccount testAccount1 = new BankAccount(150, 400);
        BankAccount testAccount2 = new BankAccount(50, 1000);


        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        testAccount.checkingDeposit(500);
        testAccount.savingsDeposit(500);
        testAccount1.checkingDeposit(1600);
        testAccount1.savingsDeposit(400);
        testAccount2.checkingDeposit(700);
        testAccount2.savingsDeposit(300);
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        testAccount.checkingWithdrawal(1500);
        testAccount.savingsWithdrawal(99.99);
        testAccount1.checkingWithdrawal(421);
        testAccount1.savingsWithdrawal(800.1);
        testAccount2.checkingWithdrawal(53.25);
        testAccount2.savingsWithdrawal(350);
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts() + "\n");

        testAccount.getBalance();
        testAccount1.getBalance();
        testAccount2.getBalance();
    }
}