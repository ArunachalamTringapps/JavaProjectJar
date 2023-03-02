package org.example;

import java.util.Queue;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Frequency {
    private static void count(String word){
        Logger l=Logger.getLogger(Frequency.class.getName());
        Map<String,Integer>hm=new HashMap<>();
        String []arr=word.split("[ .,]+");
        for (String s : arr) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }
        Queue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a, b)-> b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        while(!pq.isEmpty())
        {

            l.log(Level.INFO,()-> ""+pq.poll());
        }

}
    public static void frequencymain() {
        Scanner sc=new Scanner(System.in);
        Logger l= Logger.getLogger(Frequency.class.getName());
        l.info("Enter the String");
        String word=sc.nextLine();
        count(word);

    }
}