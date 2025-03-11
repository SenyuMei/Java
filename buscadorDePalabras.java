import java.util.Scanner;

public class BuscadorDePalabras {
    public static void main(String[] args) {
        
        Scanner palabras = new Scanner(System.in);
        System.out.print("Introduce un string: ");
        String separado = palabras.nextLine();
        String[] separa = separado.split(" ");
        int l = separa.length;
        
        
        Scanner word = new Scanner(System.in);
        System.out.print("Introduce un palabra: ");
        String palabra = word.nextLine();
        System.out.println("");
        
        for ( int i = 0 ; i < l ; i++ ) {
            if ( separa[i].equals(palabra) == true ) {
                System.out.println(palabra + " esta contenido en el array en la posción " + i);
            } else if ( separa[i].equals(palabra) == false ) {
                System.out.println("Su palabra " + palabra + " no esta en la posición " + i);
                if ( i == l-1 ) {
                    System.out.println(palabra + " no esta contenido en su array :-(\n");
                }
            }
        }
        System.out.println("");
    }
}
