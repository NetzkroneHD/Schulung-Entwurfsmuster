package de.schulung.entwurfsmuster.prototype;

public class PrototypePattern {

    public static void run() {

        final Car car = new Car(1, new Engine(10));
        final Car car2 = (Car) car.clone();

        car2.setColor(2);
        car2.getEngine().setPs(5);

        System.out.println("Car: "+car);
        System.out.println("Car2: "+car2);


    }

}
