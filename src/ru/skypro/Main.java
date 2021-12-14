package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("car 1");
        Car car2 = new Car("car 2");
        Bicycle bicycle = new Bicycle("1", 2);
        Bicycle bicycle2 = new Bicycle("2", 4);

        ServiceStation station = new ServiceStation();

        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
    }
}
