package org.iffat.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        removeElements(placeToVisit);
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
}
