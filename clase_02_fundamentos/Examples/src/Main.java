public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        System.out.println("Suma: " + suma); // 30
        System.out.println("Resta: " + resta); // -10
        System.out.println("Multiplicacion: " + multiplicacion); // 200
        System.out.println("Division: " + division); // 0
        System.out.println("Modulo: " + modulo); // 10

        // convertir string a numero
        String numeroString = "10";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println(numeroInt); // 10
        // convertir string a float o double
        String numeroStringFloat = "10.5"; // 10.5
        float numeroFloat = Float.parseFloat(numeroStringFloat);
        System.out.println(numeroFloat);
        // convertir string a char
        String letraString = "a";
        char letraChar = letraString.charAt(0);
        System.out.println(letraChar);

        // operadores de comparación
        int c = 10;
        int d = 20;
        boolean igual = c == d; // false
        boolean distinto = c != d; // true
        boolean mayor = c > d;

    }
}