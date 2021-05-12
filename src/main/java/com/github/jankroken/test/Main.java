package com.github.jankroken.test;

import com.github.jankroken.test.domain.Storage;
import com.github.jankroken.test.persistence.DummyStorage;
import com.github.jankroken.test.service.ProductionService;

import static com.github.jankroken.test.domain.Product.CAR;

public class Main {

    public void main() {
        Storage storage = new DummyStorage(4000);
        ProductionService service = new ProductionService(storage);
        boolean success = service.produce(CAR, 10);
        if (success) {
            System.out.println("Produced 10 cars");
        } else {
            System.out.println("Could not produce 10 cars");
        }
    }
}
