public class Main {
    public static void main(String[] args) {
        
        char anterior = ' ', actual;
        int numPalabras = 0;
        
        String text = "Univeristat   Politécnica   de   Catalunya";
        
        for( int i = 0 ; i < text.length() ; i++ ) {
            actual = text.charAt(1);
            if(anterior == ' ' && actual != ' ') {
                numPalabras++;
            anterior = actual;
            }
        }
        System.out.println("El nombre de palabras es: " +numPalabras);
    }
}
