package net.maks.cars.personal.Volvo;

import net.maks.cars.Car;
import net.maks.cars.CarInstruction;

public class VolvoInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Volvo";
    }

    @Override
    public Car getNewInstance() {
        return new Volvo(90,5,false);
    }
}
