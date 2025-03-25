package edu.upc.etsetb.poo.laboratorio.sesion5.main;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author dario.martinez.m
 */
public class Impresora {
    private String nombre;
    private LinkedList<Trabajo> cola;
    
    public Impresora (String nombre){
        this.nombre = nombre;
        this.cola = new LinkedList<>();
    }
    public void addTrabajoEnCola (Trabajo trabajo){
        this.cola.add(trabajo);
    }
    public boolean procesaSiguienteTrabajo(){
        if(this.cola.isEmpty()){
        return false;
        }
        else {
            this.cola.remove(0);
            return true;
        }
        
    }
    public boolean priorizaTrabajoEnCola(int id) {
        Iterator<Trabajo> it = this.cola.iterator();
        while (it.hasNext()) {
            Trabajo trabajo = it.next();
            if (trabajo.getId() == id) { 
                this.cola.remove(trabajo);
                this.cola.addFirst(trabajo);
                return true;
            }
        }
        return false;
    }

    
    public void limitaLongitudCola(int maxTrabajos) {
       
        while (this.cola.size() > maxTrabajos) {
            
            this.cola.remove(this.cola.size()- 1);
        }
    }
    
    public String toString() {
    String s = "Impresora: " + this.nombre + "\n";
    s += "Trabajos actualmente en cola:\n";
    
    for (Trabajo trabajo : this.cola) {
            s += trabajo.toString(); 
        }
    
        return s;
    }


}
