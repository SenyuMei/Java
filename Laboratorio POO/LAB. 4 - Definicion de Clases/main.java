/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math;

import edu.upc.etsetb.poo.math.complex;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class main {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        boolean cal = true;

        Scanner lector = new Scanner(System.in);
        while(cal){
        System.out.print("""
                         Benvenido a la calculadora de complejos! Operacines disponibles:
                         + (Re1,Im1)(Re2,Im2)
                         - (Re1,Im1)(Re2,Im2)
                         * (Re1,Im1)(Re2,Im2)
                         / (Re1,Im1)(Re2,Im2)
                         Con que quiere operar? """);
        String op = lector.nextLine();
        
        String[] clear = op.split(" ");
        complex num1 = createComplex(clear[1]);
        complex num2 = createComplex(clear[2]); 
        complex resultado = new complex();
        switch(op.charAt(0)){
            case 'F':
            case 'f':
                System.out.println("Hasta la proxima!");
                cal = false;          
            case '+':
                resultado = num1.add(num2);
                break;
            case '-':
                resultado = num1.resta(num2);
                break;
            case '*':
            resultado = num1.mult(num2);
                break;
             case '/':
                resultado = num1.divide(num2);
            break;
            default:
                System.out.println("Error comando incorrecto!");
                   
            }
        
            System.out.println("Resultado: " + resultado);
        }
        lector.close();
        
        
    }
    public static complex createComplex(String strComplex){
        strComplex = strComplex.substring(1, strComplex.length() - 1);
        String[] comp = strComplex.split(",");
        double real = Double.parseDouble(comp[0].trim());
        double imag = Double.parseDouble(comp[1].trim());
        return new complex(real,imag);
    }
    
}
