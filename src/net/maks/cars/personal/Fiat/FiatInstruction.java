package net.maks.cars.personal.Fiat;

import net.maks.cars.Car;
import net.maks.cars.CarInstruction;

public class FiatInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Fiat";
    }

    @Override
    public Car getNewInstance() {
        return new Fiat(85,3,true);
    }
}
