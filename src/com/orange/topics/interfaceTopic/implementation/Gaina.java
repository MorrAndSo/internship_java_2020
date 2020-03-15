package com.orange.topics.interfaceTopic.implementation;

import com.orange.topics.interfaceTopic.interfaces.Aerian;
import com.orange.topics.interfaceTopic.interfaces.Domestic;
import com.orange.topics.interfaceTopic.interfaces.Terestru;

public class Gaina implements Terestru, Aerian, Domestic {
    @Override
    public String getInaltime() {
        return "maxim 5 m";
    }

    @Override
    public String getMers() {
        return "in 2 picioare";
    }

    @Override
    public String getSunet() {
        return "cotcodac";
    }

    @Override
    public String getManancare() {
        return "erbivor";
    }

    @Override
    public String getUtilitate() {
        return "oua si carne";
    }
}
