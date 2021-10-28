package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// linked list demo

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "California");
        addInOrder(placesToVisit, "Utah");
        addInOrder(placesToVisit, "Arizona");
        addInOrder(placesToVisit, "Oregon");
        addInOrder(placesToVisit, "Washington");
        addInOrder(placesToVisit, "Connecticut");
        addInOrder(placesToVisit, "Idaho");
//        placesToVisit.add("California");
//        placesToVisit.add("Utah");
//        placesToVisit.add("Arizona");
//        placesToVisit.add("Oregon");
//        placesToVisit.add("Washington");
//        placesToVisit.add("Connecticut");
//        placesToVisit.add("Idaho");
        printList(placesToVisit);
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "California");
//        placesToVisit.add(1, "New York");
        printList(placesToVisit);
//        placesToVisit.remove(placesToVisit.size() - 1);
//        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("------------------------------");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newPlace){
        ListIterator<String> stringListIterator = linkedList.listIterator(); // this just sets up the iterator, it doesn't point to the first item
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newPlace);
            if(comparison == 0){
                // equal, do not add (duplicate)
                System.out.println(newPlace + " is already included in the destinations.");
                return false;
            }
            else if (comparison > 0){
                // the new item should appear before this one (at the iterator)
                stringListIterator.previous(); // have to go back because of calling next() above
                stringListIterator.add(newPlace); // insert it before the current item
                return true;
            }
            else if (comparison < 0){
                // move on to the next item in the list
                continue;
            }
        }
        stringListIterator.add(newPlace);
        return true;
    }

    private static void visit(LinkedList places){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = places.listIterator();
        if(places.isEmpty()){
            System.out.println("No places in the destination list");
            return;
        }
        else {
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of your destinations for the vacation");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else {
                        System.out.println("You are at the start of your destination list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n press ");
        System.out.println("0 to quit");
        System.out.println("1 - go to next place");
        System.out.println("2 - go to previous place");
        System.out.println("3 - print menu options");
    }
}
