package com.orange.topics.collectionsTopic;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static HashSet getMyHashSet() {
        HashSet hashSet = new HashSet();
        hashSet.add("logan");
        hashSet.add("duster");
        hashSet.add("sandero");
        hashSet.add("logan");
        return hashSet;
    }


    public static TreeSet getMyTreeSet() {
        TreeSet treeSet = new TreeSet();
        treeSet.add("talisman");
        treeSet.add("clio");
        treeSet.add("capture");
        treeSet.add("megane");
        treeSet.add("clio");
        return treeSet;
    }
}
