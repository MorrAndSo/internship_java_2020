package com.orange.topics.abstractTopic;

public class Apple extends Fruits {

    @Override
    public void color() {
        System.out.println("green Apple" );
    }

    @Override
    public void shape() {
        System.out.println("round Apple");
    }

    @Override
    public void size() {
        System.out.println("small Apple");
    }

    public void country() {
        System.out.println("Polonia");
    }


}
