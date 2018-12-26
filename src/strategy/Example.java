package strategy;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        var vehicles = List.of(new Car(), new Airplane(), new Boat());
        for (var v : vehicles) {
            v.driving();
        }
    }

}

interface Driveable {

    void driving();

}

class Car implements Driveable {

    @Override
    public void driving() {
        System.out.println("Driving a car");
    }

}

class Airplane implements Driveable {

    @Override
    public void driving() {
        System.out.println("Driving an airplane");
    }

}

class Boat implements Driveable {

    @Override
    public void driving() {
        System.out.println("Driving a boat");
    }

}