package org.iffat.list;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCES", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCES", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        System.out.println("---".repeat(30));
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milks"));
        groceryList.add(new GroceryItem("oranges", "PRODUCES", 6));
        groceryList.set(0, new GroceryItem("apples", "PRODUCES", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
