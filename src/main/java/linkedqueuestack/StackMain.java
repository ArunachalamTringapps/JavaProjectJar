package linkedqueuestack;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class SNode
{
    int data;
    SNode next;
    SNode(int d)
    {
        data=d;
    }

}

class Stack
{
    Logger log=Logger.getLogger(Stack.class.getName());
    SNode push(int d, SNode head){

        SNode tmp1 = new SNode(d);

        if(head!=null) {
            tmp1.next=head;
        }

        head=tmp1;
        return head;
    }


    SNode pop(SNode head){

        if(head==null)
            log.info("underflow");
        else
            head=head.next;
        return head;
    }


    void display(SNode head){

        log.info("\n list is : ");
        if(head==null){

            log.info("no LNodes");

            return;
        }

        SNode tmp=head;

        while(tmp!=null){

            SNode finalTmp = tmp;
            log.log(Level.INFO,()-> finalTmp.data+" ");

            tmp=tmp.next;


        }
    }

    boolean isEmpty(SNode head)
    {
        return head == null;
    }

    int peek(SNode head)
    {
        if(head==null)
            return -1;
        return head.data;
    }

}


class StackMain {
    private StackMain(){

    }

    public static void firstname()
    {
        Logger log=Logger.getLogger(StackMain.class.getName());
        Stack s=new Stack();
        SNode head=null;
        Scanner in=new Scanner(System.in);

        do
        {log.info("\n******** MENU *******");
            log.info("\n1.PUSH");
            log.info("\n2.POP");
            log.info("\n3.PEEK");
            log.info("\n4 IS EMPTY");
            log.info("\n5 DISPLAY");
            log.info("\n6.EXIT");
            log.info("\n enter ur choice : ");


            switch (in.nextInt()) {
                case 1 -> {
                    log.info("\nenter the value ");
                    head = s.push(in.nextInt(), head);
                }
                case 2 -> head = s.pop(head);
                case 3 -> {
                    SNode finalHead = head;
                    log.log(Level.INFO,()->"\n top element : " + s.peek(finalHead));
                }
                case 4 -> {
                    SNode finalHead1 = head;
                    log.log(Level.INFO,()->"\n is empty : " + s.isEmpty(finalHead1));
                }
                case 5 -> s.display(head);
                case 6 -> System.exit(0);
                default -> log.info("\n Wrong Choice!");
            }
            log.info("\n do u want to cont... ");
        }while(in.nextInt()==1);

    }
}

