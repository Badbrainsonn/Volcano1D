package org.example.oop;


public class User {

    String name;
    protected String email;
    public int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    User() {

    }

    public int calculateYearOfBirth() {
        int year = 2026;
        return year - this.age;

    }

    public boolean isOlderThan(User otherUser) {
        return this.age > otherUser.age;
    }


}

