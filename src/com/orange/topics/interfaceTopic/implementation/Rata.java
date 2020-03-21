package com.orange.topics.interfaceTopic.implementation;

import com.orange.topics.interfaceTopic.interfaces.Aerian;
import com.orange.topics.interfaceTopic.interfaces.Domestic;
import com.orange.topics.interfaceTopic.interfaces.Terestru;

public class Rata implements Aerian, Domestic, Terestru {
    @Override
    public String getInaltime() {
        return "81 – 98 cm";
    }

    @Override
    public String getMers() {
        return "in 2 picioare";
    }

    @Override
    public String getSunet() {
        return "mac! mac!";
    }

    @Override
    public String getManancare() {
        return "ierburi, plante acvatice, pești, insecte";
    }

    @Override
    public String getUtilitate() {
        return "carne,oua,penaj";
    }
}
