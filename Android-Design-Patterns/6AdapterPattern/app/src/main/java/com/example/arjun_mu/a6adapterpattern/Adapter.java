package com.example.arjun_mu.a6adapterpattern;

/**
 * Created by arjun_mu on 12/27/2017.
 */

public class Adapter implements NewLocation {
    //that the adapter class implements the new interface and wraps the old one.
    String building;
    int floor;
    int desk;
    final OldLocation mOldLocation;

    public Adapter(OldLocation oldLocation) {
        mOldLocation = oldLocation;
        setBuilding(this.mOldLocation.getBuilding());
        setFloor(this.mOldLocation.getFloor());
        setDesk(this.mOldLocation.getDesk());
    }

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building=building;

    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor=floor;

    }

    @Override
    public int getDesk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
    this.desk=desk;
    }
}
