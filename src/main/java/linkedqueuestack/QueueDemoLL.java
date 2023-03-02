package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

class LNode{

    int data;
    LNode next;

    LNode(int d)
    {
        data=d;
    }
}


class Queue{
    static Logger log=Logger.getLogger(Queue.class.getName());
    LNode enqueue(LNode head, int a)
    {
        LNode tmp=new LNode(a);
        if(head==null)
            head=tmp;
        else
        {
            LNode tmp1=head;
            while(tmp1.next!=null)
                tmp1=tmp1.next;

            tmp1.next=tmp;
        }
        return head;
    }


    LNode dequeue(LNode head)
    {
        if(head==null)
            log.info("underflow");
        else
            head=head.next;
        return head;
    }

    void display(LNode head)
    {

        log.info("\n list is : ");
        if(head==null){

            log.info("no LNodes");

            return;
        }

        LNode tmp=head;

        while(tmp!=null){

            LNode finalTmp = tmp;
            log.log(Level.INFO,()->""+ finalTmp.data);

            tmp=tmp.next;


        }
    }

}

class QueueDemoLL{
    private QueueDemoLL() {

    }

    public static void firstname()
    {
        Queue ob=new Queue();
        LNode head=null;

        head=ob.enqueue(head,1);
        head=ob.enqueue(head,2);
        head=ob.enqueue(head,3);
        head=ob.enqueue(head,4);
        head=ob.enqueue(head,5);
        ob.display(head);
        head=ob.dequeue(head);
        ob.display(head);
    }
}


