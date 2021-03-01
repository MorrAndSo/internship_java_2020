package com.orange.topics.collectionsTopic;

import java.util.*;

public class SimpleCollectionsExample {

    public static void main(String args []){
        Map<String, List<String>> mapExample = new HashMap<>();
        List<String> luniPrimavara = new ArrayList<>();
        luniPrimavara.add("Martie");
        luniPrimavara.add("Aprilie");
        luniPrimavara.add("Mai");

        List<String> luniVara = new ArrayList<>();
        luniVara.add("Iunie");
        luniVara.add("Iulie");
        luniVara.add("August");

        luniVara.get(2);
        luniVara.add(2, "Test");

        for (String lunaVara : luniVara) {
            System.out.println(lunaVara);
        }

        Iterator<String> luniIterator = luniVara.iterator();
        while (luniIterator.hasNext()) {
            System.out.println(luniIterator.next());
        }


        mapExample.put("Primavara ", luniPrimavara);
        mapExample.put("Vara ", luniVara);

        Set<String> mapKeys = new HashSet<>();
        mapKeys = mapExample.keySet();

        for (String key : mapKeys) {
            System.out.println(key);
            mapExample.get(key);
        }

        Map<String,String > simpleMap = new HashMap<>();
        simpleMap.put("a","b");
        Iterator mapIterator = simpleMap.keySet().iterator();
    }
}
