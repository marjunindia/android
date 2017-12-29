package com.example.arjun_mu.a6adapterpattern;

/**
 * Created by arjun_mu on 12/27/2017.
 */

public class CustomerLocation implements OldLocation {

    String building;
    int floor;
    String office;
    int desk;

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
    public String getOffice() {
        return office;
    }

    @Override
    public void setOffice(String office) {
        this.office=office;


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
