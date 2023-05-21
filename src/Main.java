import net.maks.car_factory.Factory;
import net.maks.cars.personal.Fiat.Fiat;
import net.maks.cars.personal.Fiat.FiatInstruction;
import net.maks.cars.personal.Personal;
import net.maks.cars.personal.Volvo.Volvo;
import net.maks.cars.personal.Volvo.VolvoInstruction;
import net.maks.serializer.Serializer;
import net.maks.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Factory factory = new Factory();

        List<Car> cars = new ArrayList<>();

        factory.addInstruction(new FiatInstruction());
        factory.addInstruction(new VolvoInstruction());

        cars.add(factory.getCarByName("Volvo", 95, 5, true));
        cars.add(factory.getCarByName("Fiat", 70, 3, false));



        for (Car car: cars) {
            try {
                System.out.println(car.getHorse_power() + " " + car.getDoor_count());
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

        serializer.serialize("cars.dat", cars);
    }
}