package com.orange.topics.abstractTopic;

public class Banana extends TropicalFruits{
    @Override
    public void size() {
        System.out.println("small banana");
    }

    @Override
    public void shape() {
        System.out.println("banana shape");
    }

    @Override
    public void isPoisonous() {
        System.out.println("banana is not poisonous");
    }
}
