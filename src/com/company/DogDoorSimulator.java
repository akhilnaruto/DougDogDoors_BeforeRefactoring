package com.company;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor naruto = new DogDoor();
        Remote remote = new Remote(naruto);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        remote.pressButton();

        System.out.println("\nFido's all done...");
        remote.pressButton();

        System.out.println("\nFido's back inside...");
        remote.pressButton();
    }
}
