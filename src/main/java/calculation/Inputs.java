package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Inputs{
    protected double a;
    protected double b;
    Logger l=Logger.getLogger(Inputs.class.getName());
    Scanner sc=new Scanner(System.in);
    public void inputs(){
        if(a==0) {
            l.info("Enter the first no");
            a = sc.nextDouble();
            l.info("Enter the second no");
        }
        else {
            l.info("Enter the second no:");
        }
        b = sc.nextDouble();
    }
}