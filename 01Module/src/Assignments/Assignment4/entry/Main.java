/*
 * 用 ArrayList 来存放这些房间。
 *
 * */


package Assignments.Assignment4.entry;

import Assignments.Assignment4.roomService.RoomServiceImp;
import Assignments.Assignment4.domin.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomServiceImp roomService = new RoomServiceImp();
        Room currentRoom = roomService.getCurrentRoom();
        String currentRoomName = currentRoom.getName();
        ArrayList<Room> enteredRooms = roomService.getEnteredRooms();
        while (true) {
            System.out.println("You are in the " + currentRoomName);
            System.out.println("What do you want to do?");
            int inputToDoOptionNumber = roomService.printTodoOptions();
            int choice = sc.nextInt();
            if (validInputNumber(choice, inputToDoOptionNumber)) {
                switch (choice) {
                    case 1:
                        currentRoom.switchLight();
                        boolean lightStatus = roomService.getCurrentRoom().getLighting();
                        System.out.println("light in " + currentRoomName + " is " + (lightStatus ? "ON\n\n" : "OFF\n\n"));
                        break;
                    case 2:
                        // leave room refresh
                        currentRoom = roomService.leaveApartment();
                        currentRoomName = currentRoom.getName();
                        break;
                    case 3:
                        int optionAmount = roomService.printEnterRoomOptions();
                        int input = sc.nextInt();
                        if (validInputNumber(input, optionAmount)) {
                            String selectedRoomName = inputNumberToRoom(input, currentRoomName);
                            // refresh the currentRoom.
                            currentRoom = roomService.enterARoom(selectedRoomName);
                            currentRoomName = currentRoom.getName();
                        }
                        break;
                    case 4:
                        roomService.switchStoveOrShower();
                    default:
                        break;
                }
            }
        }
    }

    public static boolean validInputNumber(int input, int limit) {
        if (input >= 1 && input <= limit) {
            return true;
        } else {
            System.out.println("#####input not valid####");
            return false;
        }
    }

    // get the room name after providing the input option.
    public static String inputNumberToRoom(int inputNumber, String currentRoomName) {
        if (currentRoomName.equals("hallway")) {
            switch (inputNumber) {
                case 1:
                    return "kitchen";
                case 2:
                    return "bathroom";
                case 3:
                    return "bedroom";
                case 4:
                    return "workroom";
                default:
                    return null;
            }
        } else if (currentRoomName.equals("workroom")) {
            switch (inputNumber) {
                case 1:
                    return "hallway";
                case 2:
                    return "bedroom";
                default:
                    return null;

            }
        } else if (currentRoomName.equals("bedroom")) {
            switch (inputNumber) {
                case 1:
                    return "hallway";
                case 2:
                    return "workroom";
                default:
                    return null;
            }
        } else if (currentRoomName.equals("bathroom")) {
            switch (inputNumber) {
                case 1:
                    return "hallway";
                case 2:
                    return "kitchen";
                default:
                    return null;
            }
        } else {
            switch (inputNumber) {
                case 1:
                    return "hallway";
                case 2:
                    return "bathroom";
                default:
                    return null;
            }
        }
    }
}
