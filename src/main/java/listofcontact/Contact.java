package org.example;

import java.util.logging.Level;

class Contact extends ListContact {
    public static void contactmain() {
        try {


            ListContact li = new ListContact();
            int ch;
            do {
                l.info("Enter your choice: ");
                l.info("\n1.Adding\n2.Delete\n3.display\n4.Search\nExit-0");
                ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1 -> li.add();
                    case 2 -> li.delete();
                    case 3 -> li.display();
                    case 4 -> li.search();
                    case 0 -> System.exit(0);
                    default -> l.warning("Wrong inputs !");
                }
            } while (true);

        }catch (MyException ex){
            l.log(Level.WARNING,()->"Error: "+ex);
        }
    }
}