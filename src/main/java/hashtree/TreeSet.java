package hashtree;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreeSet {

    public void firstname() {
        Logger l =  Logger.getLogger(TreeSet.class.getName());
        java.util.TreeSet<String> ts1 = new java.util.TreeSet<>();//->Elements are added using add() method
        ts1.add("arun");
        ts1.add("bala");
        ts1.add("loki");
        ts1.add("loki");//->Duplicates will not get insert
        l.log(Level.INFO,()->"Set "+(ts1));//->sorting Order(Ascending)
        Iterator<String> it=ts1.iterator();//->iteration
        while(it.hasNext()) {

            l.log(Level.INFO,()->" " +it.next());
        }
        l.log(Level.INFO,()->" "+(ts1.size()));//->size of the Hashtree
        ts1.remove("BC");

    }

}