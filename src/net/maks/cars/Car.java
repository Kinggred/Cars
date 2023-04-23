package net.maks.cars;

import java.io.Serializable;

public abstract class Car implements Serializable {
    protected int horse_power;
    protected int door_count;

    public Car(int horse_power, int door_count) {
        this.horse_power = horse_power;
        this.door_count = door_count;
    }

    public float get_PowerInKW() {
        float kw = this.horse_power * 0.745699872F;
        return kw;
    }

    public int getHorse_power() {
        return this.horse_power;
    }
    public int getDoor_count() {
        return door_count;
    }
}
