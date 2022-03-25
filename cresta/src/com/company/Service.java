package com.company;

public class Service {
    public Service() {
    }

    public void changeColor(Car car, ColorEnum color) {
        car.setColor(color);

    }

    public void changeWheel(Car car, WheelSizeEnum wheelSize) {
        car.setWheelSize(wheelSize);
    }

    public void addOption(Car car, OptionsEnum options) {
        car.addOptions(options);
    }

    public void deleteOption(Car car, OptionsEnum options) {
        car.deleteOptions(options);
    }
}
