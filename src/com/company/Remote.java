package com.company;

/**
 * Created by Naruto on 06-12-2015.
 */
public class Remote {

    private DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()){
            door.close();
        }else{
            door.open();
        }

    }

}
