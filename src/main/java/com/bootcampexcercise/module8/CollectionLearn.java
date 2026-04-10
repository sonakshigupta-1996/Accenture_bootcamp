package com.bootcampexcercise.module8;
import java.util.*;
public class CollectionLearn {
    // Step 1: Create collections
    ArrayList<String> list = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    HashMap<Integer, String> map = new HashMap<>();

    //  Add initial 10 values
    public void addInitialValues() {

        String[] values = {"A","B","C","D","E","F","G","H","I","J"};

        for (int i = 0; i < values.length; i++) {
            addValue(values[i]); // reuse method
        }
    }

    //  Add method (no duplicates)
    public void addValue(String value) {

        // List
        if (!list.contains(value)) {
            list.add(value);
        }

        // Set
        set.add(value); // already prevents duplicates

        // Map (avoid duplicate values)
        if (!map.containsValue(value)) {
            map.put(map.size() + 1, value);
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
    public void removeValue(String value) {

        list.remove(value);
        set.remove(value);
        map.values().remove(value);
    }

    //  Replace values (no duplicates)
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

    //  MAIN METHOD
    public static void main(String[] args) {

        CollectionLearn obj = new CollectionLearn();

        // Step 2: Add 10 values
        obj.addInitialValues();

        // Step 3: Print all
        System.out.println("Initial Data:");
        obj.printAll();

        // Step 4: Add new value (duplicate test)
        obj.addValue("A"); // duplicate
        obj.addValue("K"); // new

        System.out.println("\nAfter Adding Values:");
        obj.printAll();

        // Step 5: Remove value
        obj.removeValue("B");

        System.out.println("\nAfter Removing B:");
        obj.printAll();

        // Step 6: Replace value
        obj.replaceValue("C", "Z");

        System.out.println("\nAfter Replacing C with Z:");
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
1 -> A
2 -> B
3 -> C
4 -> D
5 -> E
6 -> F
7 -> G
8 -> H
9 -> I
10 -> J

After Adding Values:
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
K

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
K

HashMap:
1 -> A
2 -> B
3 -> C
4 -> D
5 -> E
6 -> F
7 -> G
8 -> H
9 -> I
10 -> J
11 -> K

After Removing B:
ArrayList:
A
C
D
E
F
G
H
I
J
K

HashSet:
A
C
D
E
F
G
H
I
J
K

HashMap:
1 -> A
3 -> C
4 -> D
5 -> E
6 -> F
7 -> G
8 -> H
9 -> I
10 -> J
11 -> K

After Replacing C with Z:
ArrayList:
A
Z
D
E
F
G
H
I
J
K

HashSet:
A
D
E
F
G
H
I
J
Z
K

HashMap:
1 -> A
3 -> Z
4 -> D
5 -> E
6 -> F
7 -> G
8 -> H
9 -> I
10 -> J
11 -> K

 */