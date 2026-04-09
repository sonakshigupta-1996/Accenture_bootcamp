package com.bootcampexcercise.module8;
import java.util.*;
import java.util.HashSet;
public class HashSetActivity {
    public static void main(String[] args) {

        // Step 1: Create HashSet with 10 names
        HashSet<String> names = new HashSet<>();

        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");
        names.add("Disha");
        names.add("Alex");
        names.add("Sara");
        names.add("Tom");
        names.add("Emma");
        names.add("David");

        // Step 2: Print using iteration
        System.out.println("Initial Set:");
        print(names);

        // Step 3: Add duplicate values
        names.add("John");
        names.add("John");
        names.add("Disha");

        // Step 4: Print again (duplicates won't be added)
        System.out.println("\nAfter adding duplicates:");
        print(names);

        // Step 5: Remove 2 values
        names.remove("Alex");
        names.remove("Tom");

        // Step 6: Print again
        System.out.println("\nAfter removing elements:");
        print(names);

        // Step 7: Find index of "Disha" (manual index)
        System.out.println("\nFinding position of Disha:");

        int index = 0;
        boolean found = false;

        for (String name : names) {
            if (name.equals("Disha")) {
                System.out.println("Disha found at position: " + index);
                found = true;
                break;
            }
            index++;
        }

        if (!found) {
            System.out.println("Disha not found");
        }
    }
    public static void print(HashSet<String> set) {

        for (String name : set) {
            System.out.println(name);
        }
    }
}

/* Output is:
Initial Set:
Alex
Mike
Tom
John
Disha
David
Sara
Stacie
Emma
Shanti

After adding duplicates:
Alex
Mike
Tom
John
Disha
David
Sara
Stacie
Emma
Shanti

After removing elements:
Mike
John
Disha
David
Sara
Stacie
Emma
Shanti

Finding position of Disha:
Disha found at position: 2
 */