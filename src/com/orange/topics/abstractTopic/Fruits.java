package com.orange.topics.abstractTopic;

import java.io.Serializable;

public abstract class Fruits implements IFruit, Serializable {

    public void taste() {
        System.out.println("fruit sweet");
    }

    public void color() {
        System.out.println("fruit red");
    }
}
