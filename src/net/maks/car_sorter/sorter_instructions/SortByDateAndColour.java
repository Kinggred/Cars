package net.maks.car_sorter.sorter_instructions;

import net.maks.cars.Car;

import java.util.Comparator;

public class SortByDateAndColour implements Comparator<Car> {
    SortByDate sortByDate = new SortByDate();
    SortByColour sortByColour = new SortByColour();
    @Override
    public int compare(Car o1, Car o2) {
        int value = this.sortByDate.compare(o1, o2);
        if (value == 0 ) {
            return this.sortByColour.compare(o1, o2);
        }
        return value;
    }
}