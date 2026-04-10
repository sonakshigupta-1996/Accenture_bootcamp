package com.bootcampexcercise.module8;
import java.util.*;
public class CollectionLearn {
    // Collections
    ArrayList<String> list = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    HashMap<Integer, String> map = new HashMap<>();

    //  Add values (no duplicates)
    public void addValues() {

        String[] values = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < values.length; i++) {

            // List - check manually
            if (!list.contains(values[i])) {
                list.add(values[i]);
            }

            // Set - auto prevents duplicates
            set.add(values[i]);

            // Map -  key unique
            if (!map.containsValue(values[i])) {
                map.put(i, values[i]);
            }
        }
    }

    //  Print all collections
    public void printAll() {

        System.out.println("ArrayList:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nHashSet:");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    //  Remove values
    public void removeValues() {

        list.remove("A");
        set.remove("A");

        // remove from map using value
        map.values().remove("A");
    }

    // Replace values (no duplicates allowed)
    public void replaceValue(String oldVal, String newVal) {

        // List
        if (!list.contains(newVal)) {
            int index = list.indexOf(oldVal);
            if (index != -1) {
                list.set(index, newVal);
            }
        }

        // Set
        if (set.contains(oldVal) && !set.contains(newVal)) {
            set.remove(oldVal);
            set.add(newVal);
        }

        // Map
        if (!map.containsValue(newVal)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(oldVal)) {
                    entry.setValue(newVal);
                    break;
                }
            }
        }
    }

    //  Main method
    public static void main(String[] args) {

        CollectionLearn obj = new CollectionLearn();

        // Add values
        obj.addValues();

        // Print all
        System.out.println("Initial Data:");
        obj.printAll();

        // Remove values
        obj.removeValues();
        System.out.println("\nAfter Removing 'A':");
        obj.printAll();

        // Replace values
        obj.replaceValue("B", "Z");
        System.out.println("\nAfter Replacing B with Z:");
        obj.printAll();
    }
}
/* Output is:
Initial Data:
ArrayList:
A
B
C
D
E
F
G
H
I
J

HashSet:
A
B
C
D
E
F
G
H
I
J

HashMap:
0 -> A
1 -> B
2 -> C
3 -> D
4 -> E
5 -> F
6 -> G
7 -> H
8 -> I
9 -> J

After Removing 'A':
ArrayList:
B
C
D
E
F
G
H
I
J

HashSet:
B
C
D
E
F
G
H
I
J

HashMap:
1 -> B
2 -> C
3 -> D
4 -> E
5 -> F
6 -> G
7 -> H
8 -> I
9 -> J

After Replacing B with Z:
ArrayList:
Z
C
D
E
F
G
H
I
J

HashSet:
C
D
E
F
G
H
I
J
Z

HashMap:
1 -> Z
2 -> C
3 -> D
4 -> E
5 -> F
6 -> G
7 -> H
8 -> I
9 -> J

 */