import net.maks.serializer.Serializer;
import net.maks.cars.Car;
import net.maks.cars.personal.Fiat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();

        List<Car> cars = new ArrayList<>();

        Car auto = new Fiat(90, 5, true);
        cars.add(auto);
        Car auto1 = new Fiat(60, 3, false);
        cars.add(auto1);

        for (Car car: cars) {
            System.out.println(car.getHorse_power() + " " + car.getDoor_count());
        }

        serializer.serialize("cars.dat", cars);
    }
}