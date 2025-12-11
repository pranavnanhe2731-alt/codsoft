import java.util.*;
class BankAccount {
    private Account account;

    public BankAccount(Account account){
        this.account=account;
    }

    public void depositMoney(double amount){
        account.deposit(amount);
        System.out.println("The amount "+amount+" Rupees Deposited");
    }

    public void withdrawMoney(double amount){
        boolean success=account.withdraw(amount);
        if(success){
            System.out.println("The Amount "+amount+" is withdraw successfuly");
        }
        else {
            System.out.println("Withdraw fail");
        }
    }
    public void checkBalance(){
        System.out.println("Your Current Balance is : "+account.getBalance());
    }

    public void menu(){
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your Choice: ");
    }

}
public class ATM{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
       
        Account account=new Account(5000.0);
        BankAccount atm = new BankAccount(account);
        int Choice;
        do{
            atm.menu();
            Choice=sc.nextInt();
                switch (Choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    atm.withdrawMoney(wAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();
                    atm.depositMoney(dAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (Choice != 4);
        sc.close();

        
    }
}

