package org.example;

import java.awt.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Points {
    public static void points()  {
        Scanner sc=new Scanner(System.in);
        Logger l = Logger.getLogger(Points.class.getName());
        l.info("Welcome guys");
        l.info("Enter the co-ordinates X: ");
        try {
            int x1 = sc.nextInt();
            l.info("Enter the co-ordinates Y: ");
            int y1 = sc.nextInt();
            PointsCoordi c1 = new PointsCoordi(x1, y1);
            l.info("Enter the co-ordinate X to check:");
            int x2 = sc.nextInt();
            l.info("Enter the co-ordinates Y to check: ");
            int y2 = sc.nextInt();
            PointsCoordi c2 = c1.cloneexample();
            l.log(Level.INFO, () -> "The result is: " + c2.equalling(x2, y2));
        }catch (Exception ex){
            l.log(Level.INFO, () -> "Error occur: " + ex);

        }
    }
}