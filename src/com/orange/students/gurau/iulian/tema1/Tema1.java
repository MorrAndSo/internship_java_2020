package Exercitii1;

public class Tema1 {

    //Variables

    byte Number1 = 122;
    int Number3 = 504005;
    float Number5 = 3.44f;
    double Number6 = 5.4;
    boolean isNumber = true;
    short Number4 = 3333;

    //Boxing

    Byte byteObj = Byte.valueOf(Number1);
    Integer intObj = Integer.valueOf(Number3);
    Float floatObj = Float.valueOf(Number5);
    Double doubleObj= Double.valueOf(Number6);
    Boolean booleanObj = Boolean.valueOf(isNumber);

    //VariabileCasting:

    int byteToInt = Number1; //Widening
    byte intToByte = (byte) Number3; //Narrowing
    float floatTodouble = (float) Number6;
    double doubleToFloat = Number5;
    long shortToLong = Number4;

    //MathExercises :

    double operator1 = Number5 * Number3;
    int operator2 = Number1 / Number4;
    float operator3 = Number5 % 2;

    //LoopsAndIfElseExercices:

    String[] tv = {"Samsung","LG","Philips","Sony","Vortex"};
    int i = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    boolean tooMuchCoding = true;
}
