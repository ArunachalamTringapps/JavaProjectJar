package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class ListContact {
    static Logger l=Logger.getLogger(ListContact.class.getName() );
    static Scanner sc=new Scanner(System.in);
    private String name;
    protected final HashMap<String, LinkedList<Object>> ht;
    ListContact(){
        l.info("Welcome to Contact List");
        ht=new HashMap<>();
    }
    protected void add() throws MyException {
        try {
            l.info("Enter the Contact person name:");
            name = sc.nextLine();
            l.info("Enter the phone no: ");
            int phno = sc.nextInt();
            sc.nextLine();
            l.info("Enter the email id: ");
            String email = sc.nextLine();
            LinkedList<Object> l1 = new LinkedList<>();
            l1.addLast(phno);
            l1.addLast(email);
            ht.put(name, l1);
            l.info("Successfully Added ");
        }catch (InputMismatchException ex){
            throw new MyException("Enter the correct inputs");
        }

    }
    protected void delete() throws MyException {
        l.info("If u need to delete all the contact Y(or)N: ");
        char d1=sc.next().charAt(0);
        if(d1=='y'||d1=='Y'){
            ht.clear();
            l.info("Successfully Cleared");
        } else if (d1=='n'||d1=='N') {
            l.info("Enter the name to delete: ");
            name=sc.nextLine();
            ht.remove(name);
            l.info("Successfully Removed ");
        }
        else {
            throw new MyException("You entered the wrong choice ");
        }
    }
    protected void display()throws MyException{
        if(ht.isEmpty()){
            throw new MyException("No contacts");
        }
        else {
            l.info("For security purpose only display the names in contact list: ");
            Set<String> keys=ht.keySet();
            Iterator<String> i= keys.iterator();
            while (i.hasNext()){
                l.log(Level.INFO,()->"Name: "+i.next());
            }
        }
    }
    protected void search() throws MyException{
        l.info("Enter the name to search: ");
        name=sc.nextLine();
        if(ht.containsKey(name)) {
            Object[] st = ht.get(name).toArray(new Object[0]);
            l.log(Level.INFO, () -> "Name: " + name);
            l.log(Level.INFO, () -> "Phone no: " + st[0].toString());
            l.log(Level.INFO, () -> "Email id: " + st[1].toString());
        }
        else {
            throw new MyException("Enter the correct name to search ");
        }
    }
}