/*
*
Timur Plavnik 108020258018
Aiyana Erbe   108020267357
Shipan Liu    108019201553
*
* */

package Assignments.Assignment4.domin;

public class Room {
    private String name;
    private boolean lighting;

    public Room() {
    }

    public Room(String name, boolean lighting) {
        this.name = name;
        this.lighting = lighting;
    }

    public String getName() {
        return name;
    }

    public boolean getLighting() {
        return lighting;
    }

    public void switchLight() {
        lighting = lighting ? false : true;
    }
    public void enter() {
        System.out.println("room" + name + "entered");
    }

}
