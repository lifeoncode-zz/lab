package me.lifeoncode;

public class LivingRoom {
    private String couch;
    private String carpet;
    private Tv tv;
    private Door door;
    private Lights lights;

    public LivingRoom(String couch, String carpet, Tv tv, Door door, Lights lights) {
        this.couch = couch;
        this.carpet = carpet;
        this.tv = tv;
        this.door = door;
        this.lights = lights;
    }

    public void turnOnLights() {
        lights.on();
    }

    public void turnOnTv() {
        tv.on();
    }

    public void openDoor() {
        door.open();
    }

    public void turnOffLights() {
        lights.off();
    }

    public void turnOffTv() {
        tv.off();
    }

    public void closeDoor() {
        door.close();
    }
}
