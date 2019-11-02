import java.util.Scanner;

public class SavingsAccount {
    private static double annualInterestRate;
    private  double savingsBalance;


    public SavingsAccount (double amount){
        this.savingsBalance = amount;
    }

    public void calculateMonthlyInterest(){
        double monthInt;
        monthInt = (savingsBalance * (annualInterestRate/100))/12;
        savingsBalance += monthInt;

    }

    public void printBalance(){
        System.out.printf("$%.2f", savingsBalance);
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

}


