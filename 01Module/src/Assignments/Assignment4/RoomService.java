package Assignments.Assignment4;

import Assignments.Assignment4.domin.Apartment;
import Assignments.Assignment4.domin.Kitchen;
import Assignments.Assignment4.domin.Room;

import java.util.ArrayList;

public class RoomService {
    private ArrayList<Room> enteredRooms = new ArrayList<>();
    private Room currentRoom = new Room("unknown", false);
    private Apartment apartment = new Apartment();

    public RoomService() {
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

    // if switch on light, it must be the currentRoom

    public void switchOnLight() {
        currentRoom.switchLight(true);
    }

    public Room enterARoom(String roomName) {
        /*
        * TODO: add to enteredRooms and refresh the current room
        * */
        currentRoom = getRoombyRoomName(roomName);
        enteredRooms.add(currentRoom);
        return currentRoom;
    }
    // 1. check the room left is hallway or not, if it is hallway, chacke all the light
    // stuff to see if are switched off
    // 2: remove the room name in enteredRoom;
    // 3: set the currentRoom as the previous room
    public String LeaveARoom() {
        if(currentRoom.getName().equals("hallway")) {
            enteredRooms.clear();
            return "hallway";
        } else {
            currentRoom = enteredRooms.get(enteredRoomSize() - 2);
            enteredRooms.remove(enteredRoomSize() - 1);
            return currentRoom.getName();
        }
        // 01 假如是 Hallway， 返回一个 hallway
        // 01 在保证 enteredRoom 最后一个不是 Hallyway
    }

    public void printTodoOptions() {
        String currentRoomName = currentRoom.getName();
        if(currentRoomName.equals("hallway") || currentRoomName.equals("workroom") || currentRoomName.equals("bedroom")){
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room");
        } else if(currentRoomName.equals("kitchen")) {
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room\n4) Switch stove");
        } else {
            System.out.println("1) Switch light\n2) Leave room\n3) Enter neighbouring room\n4) Switch shower");
        }

    }

    public int printEnterRoomOptions() {
        String currentRoomName = currentRoom.getName();
        System.out.println("which room?");
        if(currentRoomName.equals("hallway")) {
            System.out.println("1) Kitchen\n2) Bathroom\n3) Bedroom\n4) Workroom");
            return 4;
        } else if(currentRoomName.equals("workroom")) {
            System.out.println("1) Hallway\n2) Bedroom");
            return 2;
        } else if(currentRoomName.equals("bedroom")) {
            System.out.println("1) Hallway\n2) Workroom");
            return 2;
        } else if(currentRoomName.equals("bathroom")) {
            System.out.println("1) Hallway\n2) Kitchen");
            return 2;
        } else {
            System.out.println("1) Hallway\n2) bathroom");
            return 2;
        }
    }

    public Room getRoombyRoomName(String roomName) {
        for(Room room : apartment.getRoomArr()) {
            if(room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }

    public int enteredRoomSize() {
        return enteredRooms.size();
    }



}
