public class Main {
    public static void main(String[] args) {
        String palabra = "hola";
        
        if(palabra.length() > 0) {
            System.out.print(palabra.charAt(0));
            for (int i = 1 ; i < palabra.length() ; i++) {
                System.out.print(" . " + palabra.charAt(i));
            }
        }
    }
}
