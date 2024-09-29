package com.example.shapes;

import com.example.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
