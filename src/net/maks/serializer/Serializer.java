package net.maks.serializer;

import net.maks.cars.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializer {
    public List<Car> deserialize(String filename) {
        List<Car> deserialized_data = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserialized_data = (ArrayList<Car>) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Given file doesn't exist!");
            return null;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }
       return deserialized_data;
    }

    public void serialize(String output_file, List<Car> serialized_objects) {
        try {
            FileOutputStream fileOut = new FileOutputStream(output_file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(serialized_objects);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in " + output_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
