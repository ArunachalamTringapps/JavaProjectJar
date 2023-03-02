package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {

    public static void firstname() {
        Logger l =  Logger.getLogger(Hashset.class.getName());
        HashSet<String> set= new HashSet<>();
        set.add("Hh");
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        set.add("EF");
        Iterator<String> i=set.iterator();//->Traversing elements
        while(i.hasNext())
        {
            l.log(Level.INFO,()->" " +i.next());
        }

        HashSet<String> set1= new HashSet<>();

        set1.add("Z");
        set1.add("Y");
        set.addAll(set1);
        l.log(Level.INFO,()->" " +set);
        set.remove("A");//->Removing specific element from HashSet
        l.log(Level.INFO,()->""+set);
        l.log(Level.INFO,()->"Hashcode: "+set.hashCode());

    }

}
