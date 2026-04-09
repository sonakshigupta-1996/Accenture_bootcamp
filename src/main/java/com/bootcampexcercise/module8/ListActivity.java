package com.bootcampexcercise.module8;
import java.util.*;
public class ListActivity {
    public static void main(String[] args) {

        // TODO 1: Create a list of names using ArrayList
        List<String> names = new ArrayList<>();

        // Add elements to list
        names.add("Sonakshi");
        names.add("Micky");
        names.add("Lucy");
        names.add("Stacy");

        // TODO 2: Call print method
        print(names);
    }

    static void print(List list) {

        // TODO 3: Print list elements

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

/* Output is:
Sonakshi
Micky
Lucy
Stacy
*/
