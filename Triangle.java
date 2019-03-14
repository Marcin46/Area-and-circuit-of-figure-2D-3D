package com.company;

import java.util.Scanner;

public class Triangle extends Figure implements Printable {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle() { a = 0; b = 0; c = 0; h = 0; }

    @Override
    double calculateArea() {
        return 0.5 * c * h;
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    protected void loadData() {
        try {
        System.out.println("Podaj dlugosci boków a, b i c (podstawa) oraz wyskokość h: ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        h = scn.nextDouble();
        double tmp = Math.max(a, Math.max(b,c));
        if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0 || h < 0 || h > tmp)
            System.out.println("Taki trójkąt jest niemożliwy");
        } catch (Exception e) {
            System.out.println("Złe dane");
        }
    }

    @Override
    public void print() {
        this.loadData();
        System.out.println("Pole trójkąta: " + calculateArea());
        System.out.println("Obwód trójkąta: " + calculatePerimeter());
    }
}