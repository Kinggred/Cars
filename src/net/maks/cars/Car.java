package net.maks.cars;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Car implements Serializable, Comparable<Car> {
    protected int horse_power;
    protected int door_count;
    protected Date manufacture_time;
    protected String colour;

    public Car(Object... arguments) {
        this.horse_power = (int) arguments[0];
        this.door_count = (int) arguments[1];
        this.manufacture_time = getDatefromString((String) arguments[2]);
        this.colour = (String) arguments[3];
    }

    private Date getDatefromString(String date_to_convert) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate local_date = LocalDate.parse(date_to_convert ,dtf);
        return java.sql.Date.valueOf(local_date);
    }

    public String getHash() {
        return (colour + manufacture_time).toLowerCase();
    }

    @Override
    public String toString() {
        StringBuilder string_builder = new StringBuilder();

        string_builder.append(colour);
        string_builder.append(manufacture_time);

        return string_builder.toString();
    }

    @Override
    public int compareTo(Car car) {
        return this.getHash().compareTo(car.getHash());
    }

    public Date getManufacture_time() {
        return manufacture_time;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float get_PowerInKW() {
        float kw = this.horse_power * 0.745699872F;
        return kw;
    }

    public int getHorse_power() {
        return this.horse_power;
    }
    public int getDoor_count() {
        return door_count;
    }
}
