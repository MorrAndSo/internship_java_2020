package com.orange.topics.collectionsTopic;


import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static HashMap getNyHashMap() {
        HashMap map = new HashMap();
        map.put(1, "dacia");
        map.put(2, "renault");
        map.put(3, "skoda");
        return map;
    }

    public static TreeMap getMyTreeMap() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "logan");
        treeMap.put(5, "octavia");
        treeMap.put(3, "duster");
        treeMap.put(2, "sandero");
        treeMap.put(4, "fabia");
        return treeMap;

    }


}
