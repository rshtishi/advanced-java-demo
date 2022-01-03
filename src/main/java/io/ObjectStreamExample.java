package io;

import inheritance.vmi.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota","Black"));
        carList.add(new Car("Tesla","Red"));
        File destination = new File("src/main/resources/test/test5");
        storeCarsInFile(carList,destination);
        System.out.println(readAnimals(destination));

    }

    public static void storeCarsInFile(List<Car> carList, File dest) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(dest))) {
            for (Car car : carList) {
                objectOutputStream.writeObject(car);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<Car> readAnimals(File source) {
        List<Car> cars = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(source))) {
            while (true) {
                Car car = (Car) objectInputStream.readObject();
                cars.add(car);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }
}
