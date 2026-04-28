package org.example.oop;

public class DemoClass {
    public static void main(String[] args) {
        // file
        String s = "Alex";
        User user = new User("Aliaksandr", 33);
        user.age = 33;
        user.name = "Aliaksandr";
        user.email = "147@gmail.com";
        User user2 = new User("Max", 56);
        int result = user.calculateYearOfBirth();

        User[] arr;

        System.out.println(user.age);
        System.out.println(user.name);
        System.out.println(result);
        System.out.println(user2.isOlderThan(user));
        System.out.println(user.isOlderThan(user2));


        Vehicle car = new Sedan();
        Vehicle truck = new Truck();
        truck.model = "Kamaz";

        car.bookTestDrive();
        truck.bookTestDrive();

        Vehicle vehicle = new Sedan();
        vehicle.bookTestDrive();
    }


}





