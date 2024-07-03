package com.spring.codingshuttleSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.frost", havingValue ="Strawberry")
public class StrawberryFrost implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}
