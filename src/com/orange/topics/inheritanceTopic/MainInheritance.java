package com.orange.topics.inheritanceTopic;

public class MainInheritance {
    public static void main(String[] args) {

        Vehicle blueCar = new Car();
        Vehicle greenCar = new Car("green");
        Vehicle redVehicle = new Vehicle();

        blueCar.setColor("blue");
        System.out.println(blueCar.getColor());

        System.out.println(greenCar.getColor());
        System.out.println(redVehicle.getColor());

        System.out.println("--------------------------------------------------");

        Vehicle car = new Car();
        Vehicle train = new Train();

        Train trainBlack = new Train();

        System.out.println(car.getBrand());

        System.out.println(train.brand);

        System.out.println(train.getBrand());

        System.out.println(trainBlack.getColor());
        System.out.println(trainBlack.brand);

        train.honk();


        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        myCar.breakSound();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " ---  " + myCar.modelName);

        Train myTrain = new Train();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myTrain.honk();
        myTrain.breakSound();


        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myTrain.brand + " " + myTrain.modelName);
    }


}
