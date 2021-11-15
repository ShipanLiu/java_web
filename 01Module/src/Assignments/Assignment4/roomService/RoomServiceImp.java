/*
*
Timur Plavnik 108020258018
Aiyana Erbe   108020267357
Shipan Liu    108019201553
*
* */

package Assignments.Assignment4.roomService;

import Assignments.Assignment4.domin.Apartment;
import Assignments.Assignment4.domin.Bathroom;
import Assignments.Assignment4.domin.Kitchen;
import Assignments.Assignment4.domin.Room;
import Assignments.Assignment4.roomService.RoomService;

import java.util.ArrayList;

public class RoomServiceImp implements RoomService {

        private ArrayList<Room> enteredRooms = new ArrayList<>();
        private Room currentRoom = new Room("unknown", false);
        private Apartment apartment = new Apartment();

    public RoomServiceImp() {
        // if created, then initialize entering the Hallway already at the beginning.
        enteredRooms.add(apartment.getRoomArr().get(0));
        currentRoom = apartment.getRoomArr().get(0);
    }

        public ArrayList<Room> getEnteredRooms() {
        return enteredRooms;
    }

        public Room getCurrentRoom() {
        return currentRoom;
    }

        public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /*
     *
     * function method area
     *
     * */

    // check if some eles is on, and give a number is list.
    public ArrayList checkAllEles() {
        ArrayList<String> problemMessageArr = new ArrayList<>();
        // iterate hallway, bedroom and workroom
        for (int i = 0; i < 5; i++) {
            Room room = apartment.getRoomArr().get(i);
            String roomName = room.getName();
            if (room.getLighting()) {
                problemMessageArr.add("WARNING!!!  " + room.getName() + ": light is on");
            }
            if (roomName == "kitchen") {
                Kitchen kitchen = (Kitchen) room;
                if (kitchen.getStove()) {
                    problemMessageArr.add("WARNING!!!  " + kitchen.getName() + ": stove is on");
                }
            }
            if (roomName == "bathroom") {
                Bathroom bathroom = (Bathroom) room;
                if (bathroom.getShower()) {
                    problemMessageArr.add("WARNING!!!  " + bathroom.getName() + ": shower is on");
                }
            }
        }
        if (problemMessageArr.isEmpty()) {
            return null;
        } else {
            return problemMessageArr;
        }
    }

    // switch stove or switch shower
    public void switchStoveOrShower() {
        if (currentRoom.getName().equals("kitchen")) {
            Kitchen kitchen = (Kitchen) currentRoom;
            String kitchenName = kitchen.getName();
            kitchen.switchStove();
            boolean stoveStatus = kitchen.getStove();
            System.out.println("stove in " + kitchenName + " is " + (stoveStatus ? "ON\n\n" : "OFF\n\n"));
        } else {
            Bathroom bathroom = (Bathroom) currentRoom;
            String bathroomName = bathroom.getName();
            bathroom.switchStove();
            boolean stoveStatus = bathroom.getShower();
            System.out.println("shower in " + bathroomName + " is " + (stoveStatus ? "ON\n\n" : "OFF\n\n"));
        }
    }

    // leave apartent and check if all are turned off
    public Room leaveApartment() {
        // leave the room
        // refresh the currentRoom.
        // if currentRoom is null now, then leave the
        leaveARoom();
        if (currentRoom == null) {
            //check the current before leaving
            ArrayList<String> problemArr = checkAllEles();
            if (problemArr != null) {
                for (String str : problemArr) {
                    System.out.println(str);
                }
            }
            System.out.println("You you are leaving the apartment");
            System.exit(0);
        }
        System.out.println("Returning to previous room\n");
        return currentRoom;
    }

    // method for entering a room
    public Room enterARoom(String roomName) {
        /*
         * TODO: add to enteredRooms and refresh the current room
         * */
        currentRoom = getRoombyRoomName(roomName);
        enteredRooms.add(currentRoom);
        return currentRoom;
    }

    // // method for leaving a room
    // 1. check the room left is hallway or not, if it is hallway, checkAllEles()
    // 2: remove the room name in enteredRoom/Stack;
    // 3: set the currentRoom as the previous room
    public Room leaveARoom() {
        if (currentRoom.getName().equals("hallway")) {
            enteredRooms.clear();
            currentRoom = null;
            return null;
        } else {
            enteredRooms.remove(enteredRoomSize() - 1);
            currentRoom = enteredRooms.get(enteredRoomSize() - 1);
            return currentRoom;
        }
    }

    // print the options
    public int printTodoOptions() {
        String currentRoomName = currentRoom.getName();
        if (currentRoomName.equals("hallway") || currentRoomName.equals("workroom") || currentRoomName.equals("bedroom")) {
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room");
            return 3;
        } else if (currentRoomName.equals("kitchen")) {
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room\n4) Switch stove");
            return 4;
        } else {
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room\n4) Switch shower");
            return 4;
        }

    }

    // print the options of entering a room
    public int printEnterRoomOptions() {
        String currentRoomName = currentRoom.getName();
        System.out.println("which room?");
        if (currentRoomName.equals("hallway")) {
            System.out.println("1) Kitchen\n2) Bathroom\n3) Bedroom\n4) Workroom");
            return 4;
        } else if (currentRoomName.equals("workroom")) {
            System.out.println("1) Hallway\n2) Bedroom");
            return 2;
        } else if (currentRoomName.equals("bedroom")) {
            System.out.println("1) Hallway\n2) Workroom");
            return 2;
        } else if (currentRoomName.equals("bathroom")) {
            System.out.println("1) Hallway\n2) Kitchen");
            return 2;
        } else {
            System.out.println("1) Hallway\n2) bathroom");
            return 2;
        }
    }

    // return a Room if the room name is provided
    public Room getRoombyRoomName(String roomName) {
        for (Room room : apartment.getRoomArr()) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }

    public int enteredRoomSize() {
        return enteredRooms.size();
    }
}
