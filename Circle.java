package com.company;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Circle extends Figure implements Printable {
    private double r;

    public Circle() {
        r = 0;
    }

    @Override
    double calculateArea(){
        return PI * r * r;
    }

    @Override
    double calculatePerimeter(){
        return 2 * PI * r;
    }

    @Override
    protected void loadData() {
        try {
        System.out.println("Podaj promień okręgu: ");
        Scanner scn = new Scanner(System.in);
        r = scn.nextDouble();
        if (r < 0)
            System.out.println("Taki okrąg jest niemożliwy");
        } catch (Exception e) {
            System.out.println("Złe dane");
        }
    }

    @Override
    public void print()
    {
        this.loadData();
        System.out.println("Pole okręgu: " + calculateArea());
        System.out.println("Obwód okręgu: " + calculatePerimeter());
    }
}