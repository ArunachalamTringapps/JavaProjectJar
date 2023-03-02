package org.example;

import tictactoe.TicTacToe;
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
import studentsgpa.Student;
import frequency.Frequency;

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
                case 1 -> {SimpleBank sb=new SimpleBank();sb.bank();}
                case 2 -> BasicShape.shape();
                case 3 -> BasicSchool.schoolgrade();
                case 4 -> {JDBCPoll data=new JDBCPoll();data.database();}
                case 5 -> {Points poi=new Points();poi.points();}
                case 6 -> {Credit cr=new Credit();cr.card();}
                case 7 -> {ExceptionMain exp=new ExceptionMain();exp.exceptionmain();}
                case 8 -> {Student stgpa=new Student();stgpa.studentgpa();}
                case 9 -> {LinkedQueueStackMain lqs=new LinkedQueueStackMain();lqs.list();}
                case 10 -> {HashTreeMain htm=new HashTreeMain();htm.hashtree();}
                case 11 -> {Calculator cl=new Calculator();cl.calculator();}
                case 12 -> {Contact cn=new Contact();cn.contactmain();}
                case 13 -> {Frequency fr=new Frequency();fr.frequencymain();}
                case 14 -> {TicTacToe tic=new TicTacToe();tic.tictactoemain();}
                default -> l.info("Thanks for Coming");
            }
        }while (ch<15);
    }
}