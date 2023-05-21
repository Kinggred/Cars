package net.maks.cars;

import net.maks.exceptions.ArgumentListTooShortException;

public interface CarInterface {

    public String getCarName();

    public Car getNewInstance(Object... arguments) throws ArgumentListTooShortException;
}
