public class Assignatura implements Comparable<Assignatura> {
    private String nom;
    private int codi, curs;
    
    public Assignatura(String nom, int codi, int curs) {
        this.nom = nom;
        this.codi = codi;
        this.curs = curs;
    }
    
    @Override
    public String toString() {
        return this.nom + "; codi: " + this.codi + "; curs; " + this.curs;
    }
    
    @Override
    public int compareTo(Assignatura a) {
        //Has to return 0 if this == a
        //Has to return >0 if this > a
        //Has to return <0 if this < a
        if(this.curs != a.curs) {
            return this.curs - a.curs;
        }
        //The asingments are the same!
        //We have to compare both titulations
        return this.nom.compareTo(a.nom);
    }
    
}
