package com.github.jankroken.test.service;

import com.github.jankroken.test.domain.Product;
import com.github.jankroken.test.domain.Storage;

public class ProductionService {

    private Storage storage;

    public ProductionService(Storage storage) {
        this.storage = storage;
    }

    public boolean produce(Product product, int count) {
        return false;
    }
}
