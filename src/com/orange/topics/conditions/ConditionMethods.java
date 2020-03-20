package com.orange.topics.conditions;

public class ConditionMethods {
    //when the if condition is met, the code block is executed
    //you can add as many if else layers,
    //  and the last else is not needed for the code to run,
    //  the last else can be seen as a default behaviour in case no condition is met
    public static void ifElseCondition(int valInt1, int valInt2) {
        if (valInt1 > valInt2) {
            System.out.println(valInt1 + " is bigger");
        } else if (valInt2 > valInt1) {
            System.out.println(valInt2 + " is bigger");
        } else {
            System.out.println(valInt1 + " and " + valInt2 + " are equal");
        }
    }

    //the ternary if is used to check only one condition and is used to give value to a variable
    //  you can see the ternary condition as a simple question
    //  variable = (condition) ? true : false ; /// if the question si true, give the first value, if not, the second.
    public static void ternaryIfCondition(int valInt1, int valInt2) {
        String result = valInt1 > valInt2 ? (valInt1 + " is bigger") :
                (valInt2 + " is bigger");
        System.out.println(result);

    }

    //checks the value given to switch, if the value has any case corresponding to it, will execute the case,
    //if the case lack the break; keyword, it will continue and execute the next case
    //if no case is met, the default case will be executed.
    public static void switchCondition(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error : no valid day");
        }
    }

    //execute as long the condition is met
    public static void whileCondition(int noToUseLessThan5) {
        while (noToUseLessThan5 <= 5) {
            System.out.print(noToUseLessThan5 + " ,");
            ++noToUseLessThan5;
        }
    }

    //executes at least once, even if the condition is not met
    public static void doWhileCondition(int noToUseGreaterThan5) {
        do {
            System.out.print(noToUseGreaterThan5 + " ,");
            ++noToUseGreaterThan5;
        }
        while (noToUseGreaterThan5 <= 5);
    }

    //for (statement 1; statement 2; statement 3)
    //Statement 1 is executed (one time) before the execution of the code block.
    //Statement 2 defines the condition for executing the code block.
    //Statement 3 is executed (every time) after the code block has been executed.
    public static void simpleForLoop(String[] arrayToUse) {
        for (int i = 0; i < arrayToUse.length; i++) {
            System.out.print(arrayToUse[i] + " , ");
        }
    }

    //for (type variableName : arrayName)
    // type = the type of the values that are stored in the array.. if the array is : int [] arrayName , in for whe use int
    // variableName = the name of the variable used inside the block of code
    //the for-each loop is used mainly when we have to iterate all the array
    //also it's easier to use
    public static void forEachLoop(String[] arrayToUse) {
        for (String stringValue : arrayToUse) {
            System.out.print(stringValue + " , ");
        }
    }
}
