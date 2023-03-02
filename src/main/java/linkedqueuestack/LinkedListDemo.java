package org.example;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class LLNode{

    int data;
    LLNode next;

    LLNode(int data)
    {
        this.data=data;
        this.next=null;

    }
}


class LinkedListDemo {

    LLNode head;


    LLNode insertInBeg(int key,LLNode head)
    {
        LLNode ttmp=new LLNode(key);

        if(head!=null) {
            ttmp.next=head;
        }

        head=ttmp;
        return head;
    }


    LLNode insertInEnd(int key,LLNode head)
    {
        LLNode ttmp=new LLNode(key);
        LLNode ttmp1=head;

        if(ttmp1==null)
            head=ttmp;
        else
        {
            while(ttmp1.next!=null)
                ttmp1=ttmp1.next;
            ttmp1.next=ttmp;

        }

        return head;

    }


    LLNode insertAtPos(int key,int pos,LLNode head)
    {
        LLNode ttmp=new LLNode(key);

        if(pos==1)
        {
            ttmp.next=head;
            head=ttmp;
        }
        else
        {
            LLNode ttmp1=head;
            for(int i=1;ttmp1!=null && i<pos;i++)
                ttmp1=ttmp1.next;
            if (ttmp1 != null) {
                ttmp.next=ttmp1.next;
                ttmp1.next=ttmp;
            }
        }

        return head;
    }


    LLNode delete(int pos,LLNode head)
    {
        LLNode ttmp=head;
        if(pos==1)
            head=ttmp.next;
        else
        {
            for(int i=1;ttmp!=null && i<pos-1;i++)
                ttmp=ttmp.next;
            if (ttmp != null) {
                ttmp.next=ttmp.next.next;
            }
        }
        return head;
    }

    int length(LLNode head)
    {
        LLNode ttmp=head;
        int c=0;
        if(ttmp==null)
            return 0;
        else
        {
            while(ttmp!=null)
            {	ttmp=ttmp.next;
                c++;
            }
        }
        return c;
    }



    void display(LLNode head)
    {
        Logger li=Logger.getLogger(LinkedListDemo.class.getName());
        LLNode ttmp=head;
        while(ttmp!=null)
        {
            LLNode finalTtmp = ttmp;
            li.log(Level.INFO,() -> finalTtmp.data + "");
            ttmp=ttmp.next;
        }
    }

    public static void firstname()
    {
        Logger log=Logger.getLogger(LinkedListDemo.class.getName());
        LinkedListDemo l=new LinkedListDemo();
        l.head=null;
        Scanner in=new Scanner(System.in);
        do
        {
            log.info("\n********* MENU *********");
            log.info("\n1.Insert In End");
            log.info("\n2.Insert In Beg");
            log.info("\n3.Insert At A  Particular Pos");
            log.info("\n4.Delete At a Pos");
            log.info("\n5.Length");
            log.info("\n6.Display");
            log.info("\n7.EXIT");
            log.info("\nenter ur choice : ");
            int n=in.nextInt();
            switch (n) {
                case 1 -> {
                    log.info("\nenter the value ");
                    l.head = l.insertInEnd(in.nextInt(), l.head);
                }
                case 2 -> {
                    log.info("\nenter the value");
                    l.head = l.insertInBeg(in.nextInt(), l.head);
                }
                case 3 -> {
                    log.info("\nenter the value");
                    l.head = l.insertAtPos(in.nextInt(), in.nextInt(), l.head);
                }
                case 4 -> l.head = l.delete(in.nextInt(), l.head);
                case 5 -> log.log(Level.INFO,()->""+l.length(l.head));
                case 6 -> l.display(l.head);
                case 7 -> System.exit(0);
                default -> log.info("\n Wrong Choice!");
            }
            log.info("\n do u want to cont...  Press 1" );
        }while(in.nextInt()==1);

    }
}
