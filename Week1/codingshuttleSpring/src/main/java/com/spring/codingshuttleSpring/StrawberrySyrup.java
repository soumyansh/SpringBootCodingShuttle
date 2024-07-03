package com.spring.codingshuttleSpring;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.syrup", havingValue ="Strawberry")
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Strawberry Syrup");
    }
}
