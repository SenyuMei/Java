import java.util.Scanner;

public class GeneradorAcronimo {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un acronimo: ");
        String text = lector.nextLine();
        
        String acronimo = "ETSETB";
        String acronimoCompleto = "Escola Tècnica Superior Enginyeria Telecomunicació Barcelona";
        String siNo = "Su acronimo no se ha podido leer :-(";
        
        if (text.equals(acronimo) == true) {
           System.out.println(acronimoCompleto);
        } else {
            System.out.println(siNo);
        }
    }
}
