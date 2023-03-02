package listofcontact;


import java.util.logging.Level;

public class Contact extends ListContact {
    public void contactmain() {
        try {


            ListContact li = new ListContact();
            int ch;
            do {
                l.info("Enter your choice: ");
                l.info("\n1.Adding\n2.Delete\n3.display\n4.Search");
                ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1 -> li.add();
                    case 2 -> li.delete();
                    case 3 -> li.display();
                    case 4 -> li.search();
                    default -> l.warning("Wrong inputs !");
                }
            } while (ch<5);

        }catch (MyException ex){
            l.log(Level.WARNING,()->"Error: "+ex);
        }
    }
}