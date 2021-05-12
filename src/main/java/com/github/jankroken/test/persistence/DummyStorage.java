package com.github.jankroken.test.persistence;

import com.github.jankroken.test.domain.Product;
import com.github.jankroken.test.domain.Storage;

import java.util.HashMap;

public class DummyStorage implements Storage {
    private int iron;
    private HashMap<Product,Integer> products;

    public DummyStorage(int iron) {
        this.iron = iron;
        this.products = new HashMap<>();
    }

    @Override
    public void depositIron(int amount) {
        iron += amount;
    }

    @Override
    public boolean checkIron(int amount) {
        return iron >= amount;
    }

    @Override
    public boolean takeIron(int amount) {
        return false;
    }

    @Override
    public void depositProduct(Product product, int units) {

    }

    @Override
    public int countProduct(Product product) {
        return 0;
    }
}
