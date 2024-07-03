package com.spring.codingshuttleSpring;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.syrup", havingValue ="Chocolate")
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
