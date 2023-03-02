package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionMain {
    public void exceptionmain() {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(ExceptionMain.class.getName());
        l.info("Welcome to Exception Handling");
        int ch;
        do {
            l.info("Enter your choice:");
            l.info("1.BasicSchool\n2.BasicShape\n3.Credit\n4.JDBCPoll\n5.Points\n6.SimpleBank");
            ch=sc.nextInt();
            switch (ch) {
                case 1 -> BasicSchoolException.firstname();
                case 2 -> BasicShapeException.firstname();
                case 3 -> {CreditException cre=new CreditException();cre.firstname();}
                case 4 -> {JDBCPollException dataexp=new JDBCPollException();dataexp.firstname();}
                case 5 -> {PointsException pexp=new PointsException();pexp.firstname();}
                case 6 -> SimpleBankException.firstname();
                default -> l.info("Thanks You Guys:)");
            }
        }while (ch<7);

    }
}
