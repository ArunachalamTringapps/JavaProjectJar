package org.example;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap
{
    public static void firstname()
    {
        Logger l =  Logger.getLogger(Hashmap.class.getName());
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        l.log(Level.INFO,()->"HashMap: " + languages);
        l.log(Level.INFO,()->"Keys: " + languages.keySet());//->return keys only
        l.log(Level.INFO,()->"Values: " + languages.values());//->return values only
        l.log(Level.INFO,()->"Key/Value mappings: " + languages.entrySet());//->return keys and values
        String value = languages.remove(2);
        l.log(Level.INFO,()->"Removed value: " + value);
        l.log(Level.INFO,()->"Updated HashMap: " + languages);//->updated hashmap
        for (Integer key : languages.keySet()) {//->iteration with keys
            l.log(Level.INFO,()->"The key:"+key);
        }
        for (String values : languages.values()) {//->iteration with values only
            l.info(values);
        }
        for (Entry<Integer, String> entry : languages.entrySet()) {//->iteration with keys and values pari
            l.log(Level.INFO,()->"key/value"+entry);
        }
    }
}