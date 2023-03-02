package org.example;

import TicTacToe.TicTacToe;
import basicschool.BasicSchool;
import basicshape.BasicShape;
import calculation.Calculator;
import creditcard.Credit;
import database.JDBCPoll;
import exceptionhandling.ExceptionMain;
import hashtree.HashTreeMain;
import linkedqueuestack.LinkedQueueStackMain;
import listofcontact.Contact;
import points.Points;
import simplebank.SimpleBank;
import studentsGPA.Student;
import Frequency.Frequency;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(Main.class.getName());
        l.info("Welcome Guys");
        int ch;
        do {
            l.info("""
                    1.SimpleBank
                    2.BasicShape
                    3.BasicSchool
                    4.DataBase
                    5.BasicPoints
                    6.CreditCard
                    7.ExceptionHandling
                    8.StudentGPA
                    9.LinkedQueueStack
                    10.HashMap\tHashSet\tTreeSet
                    11.SimpleCalculator
                    12.ListOfContact
                    13.FrequencyWord
                    14.TicTacToe""");
            ch= sc.nextInt();
            switch (ch){
                case 1 -> SimpleBank.bank();
                case 2 -> BasicShape.shape();
                case 3 -> BasicSchool.schoolgrade();
                case 4 -> JDBCPoll.datebase();
                case 5 -> Points.points();
                case 6 -> Credit.card();
                case 7 -> ExceptionMain.exceptionmain();
                case 8 -> Student.studentgpa();
                case 9 -> LinkedQueueStackMain.list();
                case 10 -> HashTreeMain.hashtree();
                case 11 -> Calculator.calculator();
                case 12 -> Contact.contactmain();
                case 13 -> Frequency.frequencymain();
                case 14 -> TicTacToe.tictactoemain();
                default -> l.info("Thanks for Coming");
            }
        }while (ch<15);
    }
}