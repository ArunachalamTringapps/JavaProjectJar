package org.example;

import basicschool.BasicSchoolException;
import basicshape.BasicShapeException;
import calculation.Calculator;
import creditcard.CreditException;
import database.JDBCPollException;
import frequency.Frequency;
import hashtree.HashTreeMain;
import linkedqueuestack.LinkedQueueStackMain;
import listofcontact.Contact;
import points.PointsException;
import simplebank.SimpleBankException;
import studentsgpa.Student;
import tictactoe.TicTacToe;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
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
                    7.StudentGPA
                    8.LinkedQueueStack
                    9.HashMap\tHashSet\tTreeSet
                    10.SimpleCalculator
                    11.ListOfContact
                    12.FrequencyWord
                    13.TicTacToe""");
            ch= sc.nextInt();
            switch (ch){
                case 1 -> SimpleBankException.bank();
                case 2 -> BasicShapeException.shape();
                case 3 -> BasicSchoolException.schoolgrade();
                case 4 -> {
                    JDBCPollException data=new JDBCPollException();data.database();}
                case 5 -> {
                    PointsException poi=new PointsException();poi.pointsxy();}
                case 6 -> {
                    CreditException cr=new CreditException();cr.card();}
                case 7 -> {Student stgpa=new Student();stgpa.studentgpa();}
                case 8 -> {LinkedQueueStackMain lqs=new LinkedQueueStackMain();lqs.list();}
                case 9 -> {HashTreeMain htm=new HashTreeMain();htm.hashtree();}
                case 10 -> {Calculator cl=new Calculator();cl.calculator();}
                case 11 -> {Contact cn=new Contact();cn.contactmain();}
                case 12 -> {Frequency fr=new Frequency();fr.frequencymain();}
                case 13 -> {TicTacToe tic=new TicTacToe();tic.tictactoemain();}
                default -> l.info("Thanks for Coming");
            }
        }while (ch<14);
    }
}