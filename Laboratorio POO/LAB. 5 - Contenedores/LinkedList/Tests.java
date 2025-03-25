package edu.upc.etsetb.poo.laboratorio.sesion5.test;

import edu.upc.etsetb.poo.laboratorio.sesion5.main.Impresora;
import edu.upc.etsetb.poo.laboratorio.sesion5.main.Trabajo;

/**
 *
 * @author dario.martinez.m
 */
public class Tests {
    
    public static void juegoPruebasTrabajoImpresora1(){
        Impresora imp = new Impresora ("LaserPrinter-1");
        Trabajo t1 = new Trabajo(1,"User-1","documento.docx");
        Trabajo t2 = new Trabajo(2,"User-12","listado.pdf");
        Trabajo t3 = new Trabajo(3,"User-7","horario.docx");
        Trabajo t4 = new Trabajo(4,"User-1","libro java.pdf");
        Trabajo t5 = new Trabajo(5,"User-3","nomina.pdf");
        Trabajo t6 = new Trabajo(6,"User-3","tareas.txt");
        
        imp.addTrabajoEnCola(t1);
        imp.addTrabajoEnCola(t2);
        imp.addTrabajoEnCola(t3);
        imp.addTrabajoEnCola(t4);
        imp.addTrabajoEnCola(t5);
        imp.addTrabajoEnCola(t6);
        
        System.out.println(imp.toString());

        
        imp.procesaSiguienteTrabajo();
        imp.procesaSiguienteTrabajo();
        
        System.out.println(imp.toString());

    }
    
    public static void juegoPruebasTrabajoImpresora2(){
        Impresora imp = new Impresora ("LaserPrinter-1");
        Trabajo t1 = new Trabajo(1,"User-1","documento.docx");
        Trabajo t2 = new Trabajo(2,"User-12","listado.pdf");
        Trabajo t3 = new Trabajo(3,"User-7","horario.docx");
        Trabajo t4 = new Trabajo(4,"User-1","libro java.pdf");
        Trabajo t5 = new Trabajo(5,"User-3","nomina.pdf");
        Trabajo t6 = new Trabajo(6,"User-3","tareas.txt");
        
        imp.addTrabajoEnCola(t1);
        imp.addTrabajoEnCola(t2);
        imp.addTrabajoEnCola(t3);
        imp.addTrabajoEnCola(t4);
        imp.addTrabajoEnCola(t5);
        imp.addTrabajoEnCola(t6);
        
        System.out.println(imp.toString());
        
        int i = imp.LengthCola();
        imp.priorizaTrabajoEnCola(i);
                
        imp.limitaLongitudCola(3);
        
        System.out.println(imp.toString());
        
    }
    
    public static void main (String[] args){
        juegoPruebasTrabajoImpresora1();
        juegoPruebasTrabajoImpresora2();
        
    }
    
    
    
}
