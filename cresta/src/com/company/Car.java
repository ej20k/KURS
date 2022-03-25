package com.company;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private ColorEnum color;
    private final ModelEnum model;
    private final int year;
    private WheelSizeEnum wheelSize;
    private final EngineModelEnum engineModel;
    private Set<OptionsEnum> options;

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setWheelSize(WheelSizeEnum wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(Set<OptionsEnum> options) {
        this.options = options;
    }

    public void addOptions(OptionsEnum options) {
        this.options.add(options);
    }

    public void deleteOptions(OptionsEnum options) {
        this.options.add(options);

        }


    public Car(ColorEnum color, ModelEnum model, int year, WheelSizeEnum wheelSize, EngineModelEnum engineModel, Set<OptionsEnum> options) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineModel = engineModel;

        if (this.options == null) {
            this.options = new HashSet<>();
        } else {
            this.options = this.options;

        }

    }

    @Override
    public String toString(){
        return "Car{"
                +"color" + color
                +", model=" + model
                +",year=" + year
                +",wheelSize=" + wheelSize
                +",engineModel=" + engineModel
                +",options=" + options;
    }

    public ColorEnum getColor() {
        return color;
    }
}


