package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;
        while(!exit) {
            System.out.println("Podaj numer figury: ");
            System.out.println("1 - kwadrat");
            System.out.println("2 - okrąg");
            System.out.println("3 - trójkąt");
            System.out.println("4 - graniastosłup");
            System.out.println("---");
            System.out.println("0 - exit");
            Scanner scn = new Scanner(System.in);
            int option = scn.nextInt();
            Printable figura = null;
            switch (option) {
                case 0: {
                    exit = true;
                    break;
                }
                case 1: {
                    figura = new Square();
                    break;
                }
                case 2: {
                    figura = new Circle();
                    break;
                }
                case 3: {
                    figura = new Triangle();
                    break;
                }
                case 4: {
                    Prism gr = new Prism();
                    System.out.println("Podaj numer podstawy graniastosłupa: 1 - kwadrat, 2 - okrąg, 3 - trójkąt");
                    int option2 = scn.nextInt();
                    switch (option2) {
                        case 1: {
                            gr.basis = new Square();
                            break;
                        }
                        case 2: {
                            gr.basis = new Circle();
                            break;
                        }
                        case 3: {
                            gr.basis = new Triangle();
                            break;
                        }
                        default: {
                            System.err.println("STOP");
                        }
                    }
                    gr.print();
                    break;
                }
                default: {
                    System.err.println("STOP");
                }
            }
            if (figura != null) {
                figura.print();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }

    }
}
