package io;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private String manufacturer;
    private String color;

    public Car(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
