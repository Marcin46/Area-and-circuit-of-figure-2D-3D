package com.company;

import java.util.Scanner;

public class Prism extends Figure implements Printable{
    public Figure basis;
    private double H;

    public Prism() {
        basis = new Square();
        H = 0;
    }

    @Override
    double calculateArea(){
        return 2 * basis.calculateArea() + basis.calculatePerimeter() * H;
    }

    @Override
    double calculatePerimeter(){
        return 0;
    }

    double calculateCapacity(){
        return basis.calculateArea() * H;
    }

    @Override
    protected void loadData() {
        try {
        basis.loadData();
        System.out.println("Podaj wysokość graniastosłupa prawidłowego: ");
        Scanner scn = new Scanner(System.in);
        H = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Złe dane");
        }
    }

    @Override
    public void print() {
        this.loadData();
        System.out.println("Pole powierzchni graniastosłupa: " + calculateArea());
        System.out.println("Objętość graniastosłupa: " + calculateCapacity());
    }
}