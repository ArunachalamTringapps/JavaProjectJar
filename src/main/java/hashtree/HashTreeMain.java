package hashtree;

import java.util.Scanner;
import java.util.logging.Logger;

public class HashTreeMain {
    public void hashtree() {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(HashTreeMain.class.getName());
        int ch;
        do {
            l.info("Welcome Guys");
            l.info("Enter Your choice:");
            l.info("1.Hashmap\n2.Hashset\n3.TreeSet");
            ch=sc.nextInt();
            switch (ch){
                case 1-> {Hashmap hmap=new Hashmap();hmap.firstname();}
                case 2-> {Hashset hset=new Hashset();hset.firstname();}
                case 3-> {TreeSet tset=new TreeSet();tset.firstname();}
                default -> l.info("Thank You Guys:)");
            }
        }while (ch<4);
    }
}
