public class TestCinema {
    
    public static void main (String[] args) {
        Cinema cine = new Cinema("Nom cine", "Direcció cine", 93000111);
        
        Pelicula n = new Pelicula("Títol n", "Actors n", "Idioma n", 90);
        Reposicio r1 = new Reposicio("Titol r1", "Actors r1", "Idiomara e1", 90, true);
        Reposicio r2 = new Reposicio("Titol r2", "Actors r2", "Idiomara e2", 90, false);
        
        cine.addNovetat(n);
        cine.addNovetat(n);
        cine.addNovetat(n);
        
    }
    
}
