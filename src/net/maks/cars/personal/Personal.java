package net.maks.cars.personal;

import net.maks.cars.Car;

public abstract class Personal extends Car {

    protected boolean has_isofix;

    public Personal(int horse_power, int door_count, boolean has_isofix) {
        super(horse_power, door_count);
        this.has_isofix = has_isofix;
    }

    public boolean getHasIsoFix() {
        return has_isofix;
    }

    public void setHasIsoFix(boolean has_isofix) {
        this.has_isofix = has_isofix;
    }
}
