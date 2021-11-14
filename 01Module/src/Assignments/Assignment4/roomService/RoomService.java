package Assignments.Assignment4.roomService;

import Assignments.Assignment4.domin.Room;

import java.util.ArrayList;
import java.util.Scanner;

public interface RoomService {
    Room leaveApartment();
    ArrayList checkAllEles();
    void switchStoveOrShower();
    Room enterARoom(String name);
    Room leaveARoom();
    int printTodoOptions();
    int printEnterRoomOptions();
}
