import net.maks.car_factory.Factory;
import net.maks.car_sorter.CarSorter;
import net.maks.cars.personal.Fiat.Fiat;
import net.maks.cars.personal.Fiat.FiatInstruction;
import net.maks.cars.personal.Personal;
import net.maks.cars.personal.Volvo.Volvo;
import net.maks.cars.personal.Volvo.VolvoInstruction;
import net.maks.serializer.Serializer;
import net.maks.cars.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Factory factory = new Factory();
        List<Car> cars = new ArrayList<>();

        cars = Return10Cars(factory, cars);

        CarSorter sorter = new CarSorter(cars);

        PrintCars(cars);
        PrintCars(sorter.getCarsSortedByDoM());

        PrintCars(sorter.getCarsSortedByColour());
        PrintCars(sorter.getCarsSortedByColourReversed());


        serializer.serialize("cars.dat", cars);
    }

    public static List<Car> Return10Cars(Factory factory, List<Car> cars){
        factory.addInstruction(new FiatInstruction());
        factory.addInstruction(new VolvoInstruction());

        cars.add(factory.getCarByName("Volvo", 95, 5, "12/05/2002", "red", true));
        cars.add(factory.getCarByName("Fiat", 70, 3, "12/09/2003", "blue", false));
        cars.add(factory.getCarByName("Volvo", 95, 5, "12/05/2002", "green", true));
        cars.add(factory.getCarByName("Fiat", 70, 3, "12/02/2008", "blue", false));
        cars.add(factory.getCarByName("Volvo", 95, 5, "12/05/2012", "purple", true));
        cars.add(factory.getCarByName("Fiat", 70, 3, "12/07/2006", "orange", false));
        cars.add(factory.getCarByName("Volvo", 95, 5, "12/05/2015", "red", true));
        cars.add(factory.getCarByName("Fiat", 70, 3, "12/05/2007", "green", false));
        cars.add(factory.getCarByName("Volvo", 95, 5, "12/04/2001", "black", true));
        cars.add(factory.getCarByName("Fiat", 70, 3, "12/06/1999", "blue", false));

        return cars;
    }

    public static void PrintCars(List<Car> cars) {
        for (Car car: cars) {
            try {
                System.out.println(car.getHorse_power() + " " + car.getDoor_count());
                System.out.println(car.getColour());
                System.out.println(car.getManufacture_time());
                if(car instanceof Personal) {
                    Personal personal = ((Personal) car);
                    System.out.println(personal.getHasIsoFix());
                    if(personal instanceof Volvo) {
                        Volvo volvo = ((Volvo) personal);
                        System.out.println(volvo.getHeatedSeats());
                    } else if (personal instanceof Fiat) {
                        Fiat fiat = ((Fiat) personal);
                        System.out.println(fiat.getIsStolen());
                    }
                }
            } catch (NullPointerException error) {
                System.out.println("Instance of " + car + " in not an car");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}