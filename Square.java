package com.company;

import java.util.Scanner;

public class Square extends Figure implements Printable {
    private double a;

    public Square()
    {
        a = 0;
    }

    @Override
    double calculateArea(){
        return a * a;
    }

    @Override
    double calculatePerimeter(){
        return 2*a + 2*a;
    }

    @Override
    protected void loadData() {
        try {
            System.out.println("Podaj dlugosc boku kwadratu: ");
            Scanner scn = new Scanner(System.in);
            a = scn.nextDouble();
            if (a < 0)
                System.out.println("Taki kwadrat jest niemożliwy");
        } catch (Exception e) {
            System.out.println("Złe dane");
        }
    }

    @Override
    public void print()
    {
        this.loadData();
        System.out.println("Pole kwadratu: " + calculateArea());
        System.out.println("Obwód kwadratu: " + calculatePerimeter());
    }
}