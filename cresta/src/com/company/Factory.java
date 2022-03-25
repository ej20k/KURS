package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Factory {
    private static final int YEAR = 1997;
    private final Service service;
    private final ModelEnum[] models = ModelEnum.values();
    private final EngineModelEnum[] engine = EngineModelEnum.values();
    private final ColorEnum[] color = ColorEnum.values();
    private final WheelSizeEnum[] wheels = WheelSizeEnum.values();
    public static Car[] storage = new Car[6];


    public Factory(Service service) {

        this.service = service;
        Set<OptionsEnum> options = null;
        storage[0] = new Car(
                ColorEnum.WITHE,
                ModelEnum.MODEL_CHAISER,
                YEAR,
                WheelSizeEnum.r16,
                EngineModelEnum.TURBO1, options);

        options = new HashSet<>();
        options.add(OptionsEnum.ANALOG_DASHBOARD);
        options.add(OptionsEnum.AUTOMATIC_TRANSMITION);
        options.add(OptionsEnum.THE_HATCH);
        options.add(OptionsEnum.SPOILER);
        options.add(OptionsEnum.DIGITAL_DASHBOARD);
        options.add(OptionsEnum.AUTOMATIC_TRANSMITION);

        storage[1] = new Car(
                ColorEnum.BLACK,
                ModelEnum.MODEL_MARK2,
                YEAR,
                WheelSizeEnum.r16,
                EngineModelEnum.TURBO1,
                options);


        storage[2] = new Car(
                ColorEnum.CHAMELION,
                ModelEnum.MODEL_ARISTO,
                YEAR,
                WheelSizeEnum.r17,
                EngineModelEnum.TURBO2, options);
        storage[3] = new Car(
                ColorEnum.METALLIC,
                ModelEnum.MODEL_CRESTA,
                YEAR,
                WheelSizeEnum.r16,
                EngineModelEnum.TURBO1, options);
        storage[4] = new Car(
                ColorEnum.WITHE,
                ModelEnum.MODEL_SOARER,
                YEAR,
                WheelSizeEnum.r17,
                EngineModelEnum.TURBO1, options);
        storage[5] = new Car(
                ColorEnum.METALLIC,
                ModelEnum.MODEL_SUPRA,
                YEAR,
                WheelSizeEnum.r17,
                EngineModelEnum.TURBO2, options);
    }

    public static void getFromStorage() {
    }

    public void print() {
        System.out.println(
                Arrays.toString(models) +
                        Arrays.toString(color) +
                        Arrays.toString(wheels) +
                        Arrays.toString(engine)
        );


    }

    public Car createCar(ColorEnum color,
                         ModelEnum model,
                         EngineModelEnum engineModel,
                         WheelSizeEnum wheelSize,
                         Set<OptionsEnum> options) {

        Car car = getFromStorage(color, model, wheelSize, engineModel, options);
        if (car == null) {
            return new Car(color, model, YEAR, wheelSize, engineModel, options);
        }
        return car;


    }

    public static Car getFromStorage(ColorEnum color,
                                     ModelEnum model,
                                     WheelSizeEnum wheelSize,
                                     EngineModelEnum engineMode,
                                     Set<OptionsEnum> options) {
        for (int i = 0; i < storage.length - 1;i++) {
            if (model == ModelEnum.MODEL_CHAISER && engineMode == EngineModelEnum.TURBO1 && color == ColorEnum.WITHE && wheelSize == WheelSizeEnum.r16) {
                return storage[0];
            }

            if (model == ModelEnum.MODEL_MARK2 && engineMode == EngineModelEnum.TURBO1 && color == ColorEnum.BLACK && wheelSize == WheelSizeEnum.r16){
            return storage[1];
            }

            if (model == ModelEnum.MODEL_ARISTO &&  engineMode == EngineModelEnum.TURBO2 && color == ColorEnum.CHAMELION && wheelSize == WheelSizeEnum.r17){
                return storage[2];
            }

            if (model == ModelEnum.MODEL_CRESTA && engineMode == EngineModelEnum.TURBO1 && color == ColorEnum.METALLIC && wheelSize == WheelSizeEnum.r16){
                return storage[3];
            }

            if (model == ModelEnum.MODEL_SOARER && engineMode == EngineModelEnum.TURBO1 && color == ColorEnum.WITHE && wheelSize == WheelSizeEnum.r17){
                return storage[4];
            }

            if (model == ModelEnum.MODEL_ARISTO && engineMode == EngineModelEnum.TURBO2 && color == ColorEnum.METALLIC && wheelSize == WheelSizeEnum.r17){
                return storage[5];
            }

        }

        return null;
    }

    public ColorEnum[] getColor() {
        return color;
    }
}




