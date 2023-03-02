package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student implements Comparator<StudentTest>{
    public int compare(StudentTest a,StudentTest b){
        return b.getgpa().compareTo(a.getgpa());
    }
    public static void studentgpa(){
        Logger l= Logger.getLogger(Student.class.getName());
        StudentTest s1 = new StudentTest("arun", 20, 4.0);
        StudentTest s2 = new StudentTest("vino", 20, 3.5);
        StudentTest s3 = new StudentTest("bala", 20, 4.5);
        ArrayList<StudentTest> lst = new ArrayList<>();
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        l.info("Students List");
        for (StudentTest st : lst) {
            l.log(Level.INFO,() ->st.getname() + " " + st.getage() + " " + st.getgpa());

        }
        lst.sort(new Student());
        l.info("Students List ordered by Grade from highest to lowest");
        for (StudentTest st : lst) {
            l.log(Level.INFO ,() ->st.getname()+ "\t" +st.getgpa());


        }
    }
}
