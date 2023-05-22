package net.maks.car_sorter.sorter_instructions;

import net.maks.cars.Car;

import java.util.Comparator;

public class SortByColour implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int value = o1.getColour().compareTo(o2.getColour());
        if (value == 0){
            System.out.println("Colours are the same");
        }
        return value;
    }
}