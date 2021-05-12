package com.github.jankroken.test.domain;

public enum Product {
    CAR(100),
    BOAT(20),
    IRON_TABLE(5);

    private int ironNeededToProduce;

    Product(int ironNeededToProduce) {
        this.ironNeededToProduce = ironNeededToProduce;
    }
}
