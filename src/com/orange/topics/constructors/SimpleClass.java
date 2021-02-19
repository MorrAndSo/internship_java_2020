package com.orange.topics.constructors;

public class SimpleClass {

    private final int myInt;
    public final Double myDouble;
    private String myStr;
    public Boolean myBool;

    public SimpleClass(int myInt, Double myDouble) {
        this.myInt = myInt;
        this.myDouble = myDouble;
    }

    public SimpleClass(int myInt, Double myDouble, String myStr, Boolean myBool) {
        this.myInt = myInt;
        this.myDouble = myDouble;
        this.myStr = myStr;
        this.myBool = myBool;
    }

    public SimpleClass(Byte myByte, Float myFloat, char myChar, boolean myBool) {
        this.myInt = myByte;
        this.myDouble = myFloat.doubleValue();
        this.myStr = "" + myChar;
        this.myBool = myBool;
    }

    public int getMyInt() {
        return myInt;
    }


    public String getMyStr() {
        return myStr;
    }
}
