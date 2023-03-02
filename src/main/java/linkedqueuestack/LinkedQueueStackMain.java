package linkedqueuestack;


import java.util.Scanner;
import java.util.logging.Logger;

public class LinkedQueueStackMain {
    public void list() {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(LinkedQueueStackMain.class.getName());
        int ch;
        l.info("Welcome Guys");
        do {
            l.info("\n1.LinkedList\n2.Queue\n3.Stack");
            l.info("Enter your choice: ");
            ch=sc.nextInt();
            switch (ch){
                case 1 -> LinkedListDemo.firstname();
                case 2 -> QueueDemoLL.firstname();
                case  3-> StackMain.firstname();
                default -> l.info("Thank you guys:)");
            }
        }while (ch<4);

    }
}
