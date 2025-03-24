import java.util.Scanner;

public class GeneradorAcronimo {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un acronimo? ");
        String sec = lector.nextLine();
        String fin = "";
        char n = ' ';
        int len = sec.length();
        fin += sec.charAt(0);
        for (int i = 1; i< len-1;i++){
            if (sec.charAt(i) == n){
                fin +=sec.charAt(i+1);
            }   

            
        }
        System.out.println("El acronimo de "+sec+" es: "+fin+"");
    }
    
}
