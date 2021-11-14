package Assignments.Assignment4.domin;

public class Bathroom extends Room {
    private boolean shower;


    public Bathroom(String name, boolean lighting, boolean shower) {
        super(name, lighting);
        this.shower = shower;
    }

    /*
    *
    * own method
    * */
    public boolean getShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }

    public void switchStove() {
        shower = shower ? false : true;
    }
}
