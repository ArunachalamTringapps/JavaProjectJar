package org.example;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCPollException {
    public static void firstname() {
        Logger l=Logger.getLogger(JDBCPollException.class.getName());
        Scanner sc=new Scanner(System.in);
        try {
            l.info("Welcome to jdbc Connection Pool Demo Program");
            l.info("Enter the url:");
            String url = sc.nextLine();
            l.info("Enter the username:");
            String user = sc.nextLine();
            l.info("Enter the password:");
            String pass = sc.nextLine();
            int n = 0;
            while (n < 4) {
                l.info("Enter your choice:");
                l.info("""
                        1.New connection
                        2.New connection with different url or username
                        3.Close all connection
                        Enter some other numbers to Exit""");
                n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1 -> {
                        DataBaseConnectionException d1 = DataBaseConnectionException.getDataBaseConnection();
                        d1.newConnection(url, user, pass);
                    }
                    case 2 -> {
                        l.info("Enter the url:");
                        String url2 = sc.nextLine();
                        l.info("Enter the username:");
                        String user2 = sc.nextLine();
                        l.info("Enter the password:");
                        String pass2 = sc.nextLine();
                        DataBaseConnectionException d2 = DataBaseConnectionException.getDataBaseConnection();
                        d2.newConnection(url2, user2, pass2);
                    }
                    case 3 -> {
                        DataBaseConnectionException d3 = DataBaseConnectionException.getDataBaseConnection();
                        d3.closeConnection();
                    }
                    default -> l.info("Thanks for coming");

                }
            }
        }catch (Exception ex){
            l.log(Level.INFO, () -> "Error occur: " + ex);
        }
    }
}
