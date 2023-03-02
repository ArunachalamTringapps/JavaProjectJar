package exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class BasicSchoolException {
    private final String name;
    private double credittot;
    private String[] gra;
    private double tot;
    private double gpa;
    static Scanner sc = new Scanner(System.in);
    static Logger l=Logger.getLogger(BasicSchoolException.class.getName());

    BasicSchoolException(String name, Double creditot, String[] gra, double tot, double gpa) {
        this.name = name;
        this.credittot = creditot;
        this.gra = gra;
        this.tot = tot;
        this.gpa = gpa;
    }

    public void update() {
        l.info("Enter the subject grade to add:");
        String temp = sc.nextLine();
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(gra));
        myList.add(temp);
        gra = myList.toArray(gra);
        l.info("Enter the credit points");
        double credit = sc.nextDouble();
        credittot += credit;
        GradeException g = new GradeException(temp);
        double gradetemp = g.gradeing();
        tot = tot + (gradetemp * credit);
        gpa = tot / credittot;

    }

    public String display() {
        return "Student Name " + this.name + " has a " + gpa + " GPA";
    }

    public static void firstname() {
        try {

            String temp;
            l.info("Welcome to RRR School");
            l.info("Enter your name:");
            String name = sc.nextLine();
            l.info("Enter no of Subjects:");
            int n = sc.nextInt();
            String[] gra = new String[n];
            double credit;
            double tot = 0.00;
            double credittot = 0.00;
            sc.nextLine();
            for (int i = 0; i < n; i++) {

                l.info("Enter the Subject grade in Capital letter:");
                temp = sc.nextLine();
                l.info("Enter the credit points");
                credit = sc.nextDouble();
                sc.nextLine();
                credittot += credit;
                gra[i] = temp;
                GradeException g = new GradeException(temp);
                double gradetemp = g.gradeing();
                tot = tot + (gradetemp * credit);

            }


            double gpa = tot / credittot;
            BasicSchoolException sh = new BasicSchoolException(name, credittot, gra, tot, gpa);

            int ch;
            do {
                l.info("1.update your GPA\n2.display your GPA\n3.exit");
                l.info("Enter the choice ");
                ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1 -> sh.update();
                    case 2 -> {
                        String dis = sh.display();
                        l.log(Level.INFO, () -> dis);
                    }
                    default -> l.info("Enter the correct choice:");
                }
            } while (ch != 3);
        } catch (Exception ex) {
            l.log(Level.INFO, () -> "Error Occur:" + ex);
        }
    }
}

