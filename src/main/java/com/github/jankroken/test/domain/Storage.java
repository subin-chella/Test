package com.github.jankroken.test.domain;

public interface Storage {
    public void depositIron(int amount);
    public boolean checkIron(int amount);
    public boolean takeIron(int amount);
    public void depositProduct(Product product, int units);
    public int countProduct(Product product);
}
