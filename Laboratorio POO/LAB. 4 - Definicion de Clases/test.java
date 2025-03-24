/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math.test;

import edu.upc.etsetb.poo.math.complex;

/**
 *
 * @author dario
 */
public class test {
    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(1, -2);

        System.out.println("Numero complexe c1: " + c1);
        System.out.println("Numero complexe c2: " + c2);

        complex suma = c1.add(c2);
        System.out.println("Suma: " + suma);

        complex resta = c1.resta(c2);
        System.out.println("Resta: " + resta);

        complex producto = c1.mult(c2);
        System.out.println("Producte: " + producto);

        complex division = c1.divide(c2);
        if (division != null) {
            System.out.println("Divisio: " + division);
        }

        System.out.println("Modul de c1: " + c1.getModulo());
        System.out.println("Fase de c1: " + c1.getFase());
    }
}
