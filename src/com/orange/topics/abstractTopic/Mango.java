package com.orange.topics.abstractTopic;

public class Mango extends TropicalFruits{

    @Override
    public void shape() {
        System.out.println("Mango shape");
    }

    @Override
    public void size() {
        System.out.println("Mango size");
    }

    @Override
    public void isPoisonous() {
        System.out.println("Mango isPoisonous");
    }

    @Override
    public String toString(){
        return "Salut din Mango";
    }
}
