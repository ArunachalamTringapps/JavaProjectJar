package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class SimpleBankException {

    private final String name;
    private final int accno;
    private double bal;
    static Scanner sc = new Scanner(System.in);
    static Logger l=Logger.getLogger(SimpleBankException.class.getName());

    SimpleBankException() {
        l.info("Enter the customer name:");

        this.name = sc.nextLine();
        l.info("Enter customer account number:");
        this.accno = sc.nextInt();
        l.info("Enter the current balance");
        this.bal = sc.nextDouble();

    }

    public void deposite() {
        double d;
        l.info("Enter the deposite amount");
        d = sc.nextDouble();
        this.bal += d;
        l.info("Your amount is deposited successfully");

    }

    public void withdraw() {
        double w;
        l.info("Enter the withdraw amount:");
        w = sc.nextDouble();
        if (w <= this.bal) {
            this.bal = this.bal - w;
            l.info("your amount is withdraw successfully");
        } else {
            l.info("Sorry you have insufficient amount in your account");
        }
    }

    public double balance() {
        l.log(Level.INFO, () -> "Name:" +this.name);
        l.log(Level.INFO, () -> "Account number:" +this.accno);
        return this.bal;

    }

    public static void firstname(){
        try {
            l.info("Welcome to TMB bank");
            l.info("What we want to do");
            SimpleBankException s = new SimpleBankException();

            int n;
            do {
                l.info("Enter your choice:");
                l.info("1.deposite\n2.withdraw\n3.balance\n4.exit");
                n = sc.nextInt();
                switch (n) {
                    case 1 -> s.deposite();
                    case 2 -> s.withdraw();
                    case 3 -> {
                        double te = s.balance();
                        l.log(Level.INFO, () -> "Your Account balance:" + te);
                    }
                    default -> l.info("Thanks for the coming");

                }

            } while (n > 4);
        }catch (Exception ex){
            l.log(Level.INFO,()->"Error Occur:"+ex);
        }finally {
            sc.close();
        }
    }
}