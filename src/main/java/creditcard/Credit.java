package creditcard;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Credit {
    public void card() {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(Credit.class.getName());
        l.info("welcome guys");
        try {
            l.info("Enter the cardholders name: ");
            String name = sc.nextLine();
            l.info("Enter the card number:");
            int no1 = sc.nextInt();
            sc.nextLine();
            l.info("Enter the card Expiration date:");
            String date = sc.nextLine();
            CreditCard c1 = new CreditCard(name, no1, date);
            l.info("Enter the card number to check given card number is available:");
            int no2 = sc.nextInt();
            CreditCard c2 = c1.cloneexample();
            l.log(Level.INFO, () -> "The result is: " + c2.equalling(no2));
        }catch (Exception ex){
            l.log(Level.INFO, () -> "Error occur: " + ex);

        }
    }
}