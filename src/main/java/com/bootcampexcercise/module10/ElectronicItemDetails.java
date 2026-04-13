package com.bootcampexcercise.module10;
import java.util.*;

public class ElectronicItemDetails {
  //Create a method to return the price
    public double returnPriceOfItem(HashMap<String, Double> itemMap,String name){
        if(itemMap.containsKey(name)){
            return itemMap.get(name);
        } else{
            System.out.println("Item not found!");
            return 0;
        }
    }

    public static void main(String[] args) {
        //Create itemHashMap with string name and double price
        HashMap<String,Double> itemHashMap= new HashMap<>();
        ElectronicItemDetails details = new ElectronicItemDetails();

        //Add 4 items in hashmap
        itemHashMap.put("TV",250.78);
        itemHashMap.put("Refrigirator",800.64);
        itemHashMap.put("Washing Machine",540.75);
        itemHashMap.put("Laptop", 1200.49);

        //Print the price of TV
        double tvPrice= details.returnPriceOfItem(itemHashMap, "TV");
        System.out.println("Price of TV is "+tvPrice);
    }
}
/* Output is:
Price of TV is 250.78
*/
