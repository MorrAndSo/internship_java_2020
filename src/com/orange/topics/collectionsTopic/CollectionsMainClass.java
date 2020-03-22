package com.orange.topics.collectionsTopic;

import java.util.*;


public class CollectionsMainClass {
    public static void main(String args[]) {
        System.out.println("--------ArrayList-------");
        ArrayList myArrayList = Lists.getMyArrayList();
        iterateWithIterator(myArrayList);
        iterateWithForLoop(myArrayList);
        System.out.println();

        System.out.println("--------LinkedList-------");
        LinkedList myLinkedList = Lists.getMyLinkedList();
        iterateWithIterator(myLinkedList);
        iterateWithForLoop(myLinkedList);
        System.out.println();

        System.out.println("--------HashSet-------");
        HashSet myHashSet = Sets.getMyHashSet();
        iterateWithIterator(myHashSet);
        iterateWithForLoop(myHashSet);
        System.out.println();

        System.out.println("--------TreeSet-------");
        TreeSet myTreeSet = Sets.getMyTreeSet();
        iterateWithIterator(myTreeSet);
        iterateWithForLoop(myTreeSet);
        System.out.println();

        System.out.println("--------HashMap -------");
        HashMap myHashMap = Maps.getNyHashMap();
        iterateEntrySetWithIterator(myHashMap);
        iterateWithIterator(myHashMap);
        iterateEntrySetWithForLoop(myHashMap);
        iterateWithForLoop(myHashMap);
        System.out.println();

        System.out.println("--------TreeMap-------");
        TreeMap myTreeMap = Maps.getMyTreeMap();
        iterateEntrySetWithIterator(myTreeMap);
        iterateWithIterator(myTreeMap);
        iterateEntrySetWithForLoop(myTreeMap);
        iterateWithForLoop(myTreeMap);
        System.out.println();

    }

    private static void iterateWithIterator(Iterable iterable) {
        System.out.println("--------iterator-------");
        Iterator itr = iterable.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " , ");
        }
        System.out.println();
    }

    private static void iterateWithForLoop(Iterable iterable) {
        System.out.println("--------for-each-------");
        for (Object object : iterable) {
            System.out.print(object + " , ");
        }
        System.out.println();
    }

    private static void iterateWithIterator(Map map) {
        System.out.println("--------Map  - for-each-------");
        for (Object key : map.keySet()) {
            System.out.print(key + " : " + map.get(key) + " , ");
        }
        System.out.println();
    }

    private static void iterateWithForLoop(Map map) {
        System.out.println("--------Map - for-each-------");
        for (Object key : map.keySet()) {
            System.out.print(key + " : " + map.get(key) + " , ");
        }
        System.out.println();
    }

    /*
**Map.Entry Interface
Entry is the subinterface of Map. So we will be accessed it by Map.Entry name.
It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value.
 */
    private static void iterateEntrySetWithForLoop(Map map) {
        System.out.println("--------Map - EntrySet - for-each-------");
        for (Object entrySet : map.entrySet()) {
            Map.Entry entry = (Map.Entry) entrySet;
            System.out.print(entry.getKey() + " : " + entry.getValue() + " , ");
        }
        System.out.println();
    }

    private static void iterateEntrySetWithIterator(Map map) {
        System.out.println("--------Map - EntrySet - iterator-------");
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.print(entry.getKey() + " : " + entry.getValue() + " , ");
        }
        System.out.println();
    }
}
