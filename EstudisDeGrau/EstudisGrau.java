import java.util.TreeSet;

public class EstudisGrau {
    
    private String titulacio;
    private TreeSet<Assignatura> assignatures;
    
    public EstudisGrau(String titulacio) {
        this.titulacio = titulacio;
        this.assignatures = new TreeSet<>();
    }
    public void addAssignatura(Assignatura a) {
        this.assignatures.add(a);
    }
    public void llistaInfoAssignatura() {
        for ( Assignatura a : this.assignatures ) {
            System.out.println(a);
        }
    }
}
