/*
*
Timur Plavnik 108020258018
Aiyana Erbe   108020267357
Shipan Liu    108019201553
*
* */

package Assignments.Assignment4.domin;

import java.util.ArrayList;

public class Apartment {
    /*
    * shoud have a room list(stable)
    * already contained a hallway while creating.
    * */
    // 成员属性。
    private ArrayList<Room> roomArr = new ArrayList<>();
    private Room hallway = new Room("hallway", false);
    private Kitchen kitchen = new Kitchen("kitchen", false, false);
    private Bathroom bathroom = new Bathroom("bathroom", false, false);
    private Room workroom= new Room("workroom", false);
    private Room bedroom = new Room("bedroom", false);

    public Apartment() {
        roomArr.add(hallway);
        roomArr.add(kitchen);
        roomArr.add(bathroom);
        roomArr.add(workroom);
        roomArr.add(bedroom);
    }

    public ArrayList<Room> getRoomArr() {
        return roomArr;
    }

    public Room getHallway() {
        return hallway;
    }

    // enter the apartment
    public void enter() {
        //
        System.out.println("I am entering...");
    }

    public void extension(Room newRoom) {
        roomArr.add(newRoom);
    }
}
