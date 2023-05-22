package net.maks.car_sorter;

import net.maks.car_sorter.sorter_instructions.SortByColour;
import net.maks.car_sorter.sorter_instructions.SortByDate;
import net.maks.cars.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSorter {
    List<Car> unordered_cars = new ArrayList<>();

    public CarSorter(List<Car> cars) {
        this.unordered_cars = cars;
    }

    public List<Car> getCarsSortedByDoM() {
        List<Car> sorted_cars = this.unordered_cars;
        Collections.sort(sorted_cars, new SortByDate());
        return sorted_cars;
    }

    public List<Car> getCarsSortedByColour() {
        List<Car> sorted_cars = this.unordered_cars;
        Collections.sort(sorted_cars, new SortByColour());
        return sorted_cars;
    }

    public List<Car> getCarsSortedByColourReversed() {
        List<Car> sorted_cars = this.unordered_cars;
        Collections.sort(sorted_cars, new SortByColour());
        Collections.reverse(sorted_cars);
        return sorted_cars;
    }


    public List<Car> getUnordered_cars() {
        return unordered_cars;
    }
}
