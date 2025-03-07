public class AlumnePOO {
    
    private String nom, nif;
    private double laboratori, exParcial, exFinal;
    
    public AlumnePOO(String nom, String nif){
       
        this.nom = nom;
        this.nif = nif;
        this.laboratori = 0.0;
        this.exParcial = 0.0;
        this.exFinal = 0.0;
        
    }   
    //implementar getters
    public String getNom() {
        return this.nom;
    }
    public String getNif() {
        return this.nif;
    }
    public double getLaboratori() {
        return this.laboratori;
    }
    public double getExParcial() {
        return this.exParcial;
    }
    public double getExFinal() {
        return this.exFinal;
    }
    //implementar setters
    public void setLaboratori(double laboratori) {
        this.laboratori = laboratori;
    }
    public void setExParcial(double exParcial) {
        this.exParcial = exParcial;
    }
    public void setExFinal(double exFinal) {
        this.exFinal = exFinal;
    }
    
    // resto de metodos
    public double avalua() {
        if(this.exParcial > this.exFinal)
            return 0.25*this.laboratori + 0.2*this.exParcial + 0.55*this.exFinal;
        else
            return 0.25*this.laboratori + 0.75*this.exFinal;
    }
   
    @Override
    public String toString() {
        String s = this.nom + " (NIF: " + this.nif + ")\n";
        
        s += "______________________________________\n\n";
        s += "Nota de laboratori: " + this.laboratori + "\n";
        s += "Nota examen parcial: " + this.exParcial + "\n";
        s += "Nota examen final: " + this.exParcial + "\n";
        s += "______________________________________\n";
        s += "NOTA FINAL: " + this.avalua() + "\n";
        
        return s;
    }
}
