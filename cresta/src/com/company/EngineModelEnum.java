package com.company;

public enum EngineModelEnum {


    ATMO("1g-fe"),
    SPORT1("1jz-ge"),
    SPORT2("2jz-ge"),
    TURBO1("1jz-gte"),
    TURBO2("2jz-gte");
   private String engine;

    EngineModelEnum(String engine) {
        this.engine = engine;
    }
}

