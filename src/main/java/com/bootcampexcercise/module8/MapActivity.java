package com.bootcampexcercise.module8;
import java.util.*;
public class MapActivity {
    public static void main(String[] args) {

        //  Create HashMap
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "Sonakshi");
        map.put("2", "Micky");
        map.put("3", "Tommy");
        map.put("4", "Stacie");

        //  Call print method
        MapActivity obj = new MapActivity();   // object needed (non-static method)
        obj.print(map);
    }

    void print(Map map) {

        //  Print map using iteration

        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }
}
/* Output is:
Key: 1 Value: Sonakshi
Key: 2 Value: Micky
Key: 3 Value: Tommy
Key: 4 Value: Stacie
 */
