

public class Pelicula {
    
    protected String titol, llistaActors, idioma;
    protected int duracio;
    
    public Pelicula (String titol, String llistaActors, String idioma, int duracio) {
        this.titol = titol;
        this.llistaActors = llistaActors;
        this.idioma = idioma;
        this.duracio = duracio;
    }
    public double getPreu() {
        return 9.0;
    }
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Títol: ").append(this.titol).append("\n");
        sb.append("Llista actors: ").append(this.llistaActors).append("\n");
        sb.append("Duració: ").append(this.duracio).append(" minuts\n");
        sb.append("NOVETAT");
        
        return sb.toString();
        
    }
    
}
