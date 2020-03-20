package com.orange.topics.conditions;

public class ConditionMainClass {
    public static void main(String[] arg) {
        String[] carsArray = {"Volvo", "BMW", "Ford", "Mazda"};
        ConditionMethods.ifElseCondition(5, 5);
        ConditionMethods.ternaryIfCondition(5, 8);
        ConditionMethods.doWhileCondition(10);
        System.out.println("");
        ConditionMethods.whileCondition(2);
        System.out.println("");
        ConditionMethods.switchCondition(5);
        ConditionMethods.simpleForLoop(carsArray);
        String[] carsArraySecond = {"Dacia", "Oltcit", "ARO", "Lada"};
        System.out.println("");
        ConditionMethods.forEachLoop(carsArraySecond);
    }
}
