package task3;
import java.util.*;

public class ATM_Interface {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your four Digit PIN: ");
        int enteredPin=sc.nextInt();
         BankAccount userAccount =new BankAccount(1000.0);
          ATM atm =new ATM(userAccount);
         atm.run();
    }
}