/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math;

/**
 *
 * @author dario
 */
public class complex {
    // Atributos de un número complejo
    private double real, imaginaria;

    // Constructores
    public complex() {
        this.real = 0.0;
        this.imaginaria = 0.0;
    }

    public complex(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public complex(complex c) {
        this.real = c.real;
        this.imaginaria = c.imaginaria;
    }

    // Métodos accesores
    public double getReal() {
        return this.real;
    }

    public double getImaginaria() {
        return this.imaginaria;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public complex add(complex c) {
        double sumReal = this.real + c.real;
        double sumImaginaria = this.imaginaria + c.imaginaria;
        return new complex(sumReal, sumImaginaria);
    }

    public complex resta(complex c) {
        double restReal = this.real - c.real;
        double restImaginaria = this.imaginaria - c.imaginaria;
        return new complex(restReal, restImaginaria);
    }

   
    public complex mult(complex c) {
        double prodReal = this.real * c.real - this.imaginaria * c.imaginaria;
        double prodImaginaria = this.real * c.imaginaria + this.imaginaria * c.real;
        return new complex(prodReal, prodImaginaria);
    }

   
    public complex divide(complex c) {
        double denominator = c.real * c.real + c.imaginaria * c.imaginaria;
        if (denominator == 0) {
            System.out.println("La división no se puede realizar: denominador igual a cero.");
            return null;
        }
        double divReal = (this.real * c.real + this.imaginaria * c.imaginaria) / denominator;
        double divImaginaria = (this.imaginaria * c.real - this.real * c.imaginaria) / denominator;
        return new complex(divReal, divImaginaria);
    }

    public double getModulo() {
        return Math.sqrt(this.real * this.real + this.imaginaria * this.imaginaria);
    }

  
    public double getFase() {
        return Math.atan2(this.imaginaria, this.real);
    }
    
    @Override
    public String toString() {
        String s = this.real + "";
        if (this.imaginaria >= 0) {
            s += " +";
        } else {
            s += " ";
        }
        s += this.imaginaria + "i";
        return s;
    }
}
