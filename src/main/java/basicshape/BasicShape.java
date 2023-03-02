package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class BasicShape {
    static Logger l = Logger.getLogger(BasicShape.class.getName());
    static Scanner sc = new Scanner(System.in);
    int type;
    private double ar;
    private double per;
    private final double length;
    private final double breadth;
    private final double s1;
    private final double s2;
    private final double radius;
    private final double pi = 3.14;

    public BasicShape(int type, double length, double breadth, double side1, double side2, double radius) {
        this.type=type;
        this.length = length;
        this.breadth = breadth;
        this.s1 = side1;
        this.s2 = side2;
        this.radius = radius;
    }

    double perimeter() {
        if (type == 1) {
            per = 2 * (length + breadth);
        }
        if (type == 2) {
            per = breadth + s1 + s2;
        }
        if (type == 3) {
            per = 2 * pi * radius;
        }
        return per;
    }

    double area() {
        if (type == 1) {
            ar = length * breadth;
        }
        if (type == 2) {
            ar = (breadth * length) / 2;
        }
        if (type == 3) {
            ar = pi * radius * radius;
        }
        return ar;
    }

    public static void shape() {
        int type;
        do {
            l.info("Welcome guys");
            l.info("Enter your choice");
            l.info("1.Rectangle\n2.Triangle\n3.Circle");
            l.info("Enter the shape type:");
            type= sc.nextInt();
            double radius = 0;
            double length = 0;
            double breadth = 0;
            double side1 = 0;
            double side2 = 0;
            if (type == 3) {
                l.info("Enter the radius:");
                radius = sc.nextFloat();
            } else if (type == 1 || type == 2) {
                l.info("Enter the length:");
                length = sc.nextFloat();
                l.info("Enter the breadth:");
                breadth = sc.nextFloat();
                l.info("Enter the side1:");
                side1 = sc.nextFloat();
                l.info("Enter the side2:");
                side2 = sc.nextFloat();
            }
            BasicShape bs = new BasicShape(type, length, breadth, side1, side2, radius);
            if(bs.perimeter()==0.0){
                l.info("Enter the correct choice");
            }
            else {
                l.log(Level.INFO, () -> "The perimeter of the given shape is:" + bs.perimeter());
                l.log(Level.INFO, () -> "The area of the given shape is:" + bs.area());
            }


        }while(type<4);


    }

}