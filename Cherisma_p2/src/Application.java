public class Application {
   public static void main(String[] args){

       SavingsAccount saver1,saver2;
       //initialize variables!
              saver1 = new SavingsAccount(2000.00);
              saver2 = new SavingsAccount(3000.00);
        //set interest rate
       SavingsAccount.modifyInterestRate(4.0);
       System.out.println("            " + " Saver1" + "     Saver2");
       //for loop that does calculation
       for(int i=1; i<=12; ++i){
           saver1.calculateMonthlyInterest();
           saver2.calculateMonthlyInterest();
           System.out.print("Month " + i + ": \t");
           saver1.printBalance();
           System.out.print("\t");
           saver2.printBalance();
           System.out.println();
       }
       System.out.print("\n");

       System.out.println("New Interest Rate to 5.0%");
       System.out.println();
       SavingsAccount.modifyInterestRate(5.0); // Changing the interest rate to 5.0%

// new Savings Balance
       saver1.calculateMonthlyInterest();
       saver2.calculateMonthlyInterest();

// data for month 13
       System.out.print("Month 13: \t");
       saver1.printBalance();
       System.out.print("\t");
       saver2.printBalance();
       System.out.println();
   }
}
