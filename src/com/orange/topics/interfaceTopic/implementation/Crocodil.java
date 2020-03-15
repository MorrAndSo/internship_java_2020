package com.orange.topics.interfaceTopic.implementation;

import com.orange.topics.interfaceTopic.interfaces.Acvatic;
import com.orange.topics.interfaceTopic.interfaces.Salbatic;
import com.orange.topics.interfaceTopic.interfaces.Terestru;

public class Crocodil implements Terestru, Acvatic, Salbatic {
    @Override
    public String getInot() {
        return "foloseste picioare";
    }

    @Override
    public String getMers() {
        return "foloseste picioare";
    }

    @Override
    public String getSunet() {
        return "sssssssss";
    }

    @Override
    public String getManancare() {
        return "carnivor";
    }

    @Override
    public String getMediuViata() {
        return "mlastina si savana";
    }
}
