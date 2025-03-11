public class BuscadorDicotomicoDePalabras {
    public static void main(String[] args) {
        
        String palabras = "Agua Bate Collar Dedo Espada Feo Gas Hebrio Zebra";
        String[] palabrasSeparadas = palabras.split(" ");
        int l = palabrasSeparadas.length;
       
        int primera = 0, ultima = l, centro;
        String buscarPalabra = "Hebrio";
        
        centro = (ultima+primera)/2;
        
        for ( int i = primera ; i < centro+1 ; i++) {
            if ( palabrasSeparadas[i].equals(buscarPalabra) == false ) {
                System.out.println("No se ha encontrado " + "'" + buscarPalabra + "'" + " en la posición " + i);
            } else {
                System.out.println("Se ha encontrado " + "'" + buscarPalabra + "'" + " en la posición " + i);
                break;
            }
            if ( palabrasSeparadas[i+centro].equals(buscarPalabra) == false ) {
                        System.out.println("No se ha encontrado " + "'" + buscarPalabra + "'" + " en la posición " + (i+centro));
            } else {
                    System.out.println("Se ha encontrado " + "'" + buscarPalabra + "'" + " en la posición " + (i+centro));
                break;
            }
        }   
    }    
}
