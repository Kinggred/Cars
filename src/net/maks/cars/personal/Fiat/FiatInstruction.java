package net.maks.cars.personal.Fiat;

import net.maks.cars.Car;
import net.maks.cars.CarInterface;
import net.maks.exceptions.ArgumentListTooShortException;

public class FiatInstruction implements CarInterface {
    @Override
    public String getCarName() {
        return "Fiat";
    }

    @Override
    public Car getNewInstance(Object... arguments) throws ArgumentListTooShortException {
        int given_length = arguments.length;
        int expected_length = 5;
        if (given_length == expected_length) {
            return new Fiat(arguments);
        }
        throw new ArgumentListTooShortException(expected_length, given_length);
    }
}
