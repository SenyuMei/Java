package edu.upc.etsetb.poo.laboratorio.sesion5.main;

/**
 *
 * @author dario.martinez.m
 */
public class Trabajo {
    private int id;
    private String usuario;
    private String descripcion;
    
    public Trabajo(int id, String usuario, String descripcion){
        this.id = id;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public  String toString(){
        String s = "ID: " + this.id + "[" + this.usuario + "]: " + this.descripcion + "\n";
        
        return s;
        
    }
    
}
