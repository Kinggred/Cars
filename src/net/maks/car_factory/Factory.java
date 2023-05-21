package net.maks.car_factory;

import net.maks.cars.Car;
import net.maks.cars.CarInterface;
import net.maks.exceptions.ArgumentListTooShortException;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, CarInterface> instructions;

    public Factory() {
        this.instructions = new HashMap<>();
    }

    public void addInstruction(CarInterface instruction) {
        this.instructions.put(instruction.getCarName(), instruction);
    }

    public Car getCarByName(String name, Object... arguments) {
        try {
            CarInterface instruction = this.instructions.get(name);
            return instruction.getNewInstance(arguments);
        } catch (NullPointerException error) {
            System.out.println("No such car");
        } catch (ArgumentListTooShortException error) {
            System.out.println(error);
        }
        return null;
    }

}