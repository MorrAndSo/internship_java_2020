package com.orange.topics.collectionsTopic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static ArrayList getMyArrayList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dacia");
        arrayList.add("aro");
        arrayList.add("olcit");
        return arrayList;
    }

    public static LinkedList getMyLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("audi");
        linkedList.add("volvo");
        linkedList.add("citroen");
        return linkedList;
    }

}
