package com.company;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        Factory factory = new Factory(service);
        ShowRoom showRoom = new ShowRoom(factory, service);

        Factory.getFromStorage(
                ColorEnum.WITHE,
                ModelEnum.MODEL_CHAISER,
                WheelSizeEnum.r16,
                EngineModelEnum.TURBO1,
                null);
        factory.print();
    }
}









