package net.maks.cars.personal.Volvo;

import net.maks.cars.personal.Personal;

public class Volvo extends Personal {
    protected boolean heated_seats;

    public Volvo(Object... arguments) {
        super(arguments);
        this.heated_seats = determine_has_heated_seats();
    }

    private boolean determine_has_heated_seats() {
        return Math.random() < 0.5;
    }

    public boolean getHeatedSeats() {
        return heated_seats;
    }
}
