package calculation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Calculator {
    public void calculator() {
        String word="Result: ";
        Logger l=Logger.getLogger(Calculator.class.getName());
        Scanner sc=new Scanner(System.in);
        l.info("Welcome to simple Calculation");
        Calculation i=new Calculation();
        double result = 0;
        while(true){
            i.inputs();
            l.info("Enter the operation:"+"Exit-e");
            char ch=sc.next().charAt(0);
            switch (ch) {
                case 'e' -> System.exit(0);
                case '+' -> {
                    result = i.add();
                    double finalResult = result;
                    l.log(Level.INFO, () ->  word + finalResult);
                }
                case '-' -> {
                    result = i.sub();
                    double finalResult1 = result;
                    l.log(Level.INFO, () -> word + finalResult1);
                }
                case '*' -> {
                    result = i.multi();
                    double finalResult2 = result;
                    l.log(Level.INFO, () -> word+ finalResult2);
                }
                case '/' -> {
                    result = i.div();
                    double finalResult3 = result;
                    l.log(Level.INFO, () -> word + finalResult3);
                }
                default -> l.warning("Thanks for coming");
            }
            l.info("If you need to use old answer Y(or)N :");
            char re=sc.next().charAt(0);
            if(re == 'Y' || re=='y'){
                i.a=result;    
            } else if (re=='N'|| re=='n') {
                i.a=0;
            }
        }
    }
}