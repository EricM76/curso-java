public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        // convertir string a numero
        String numeroString = "10";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println(numeroInt);
        // convertir string a float o double
        String numeroStringFloat = "10.5";
        float numeroFloat = Float.parseFloat(numeroStringFloat);
        System.out.println(numeroFloat);
        // convertir string a char
        String letraString = "a";
        char letraChar = letraString.charAt(0);
        System.out.println(letraChar);
    }
}