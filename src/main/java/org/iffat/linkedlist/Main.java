package org.iffat.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);

        // removeElements(placeToVisit);
        // System.out.println(placeToVisit);

        // gettingElements(placeToVisit);

        printItinerary3(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue Method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Method
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // remove first element
        System.out.println(s1 + " Was removed");

        String s2 = list.removeFirst(); // remove first element
        System.out.println(s2 + " Was removed");

        String s3 = list.removeLast(); // remove last element
        System.out.println(s3 + " Was removed");
        // Queue/Deque poll methods
        String p1 = list.poll(); // remove first element
        System.out.println(p1 + " Was removed");

        String p2 = list.pollFirst(); // remove first element
        System.out.println(p2 + " Was removed");

        String p3 = list.pollLast(); // remove last element
        System.out.println(p3 + " Was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // remove first element
        System.out.println(p4 + " Was removed");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval method
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip end at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip end at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip end at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator);
            if(iterator.next().equals("Brisbane")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
