//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        showProductPendingWithFor();
    }

    public static void  showProductPendingWithFor(){
        int productsPending = 5;

        for(int i = 1; i <= productsPending; i++){
            System.out.println("Revisando producto número " + i);
        }
    }
    public static void  showProductPendingWithWhile(){
        int productsPending = 5;

        int count = 1;
        while (count <= productsPending) {
            System.out.println("Revisando producto número: " + count);
            count++;
        }
    }

    public static void calculateDemand(){
        int stockCafePremium = 150;
        System.out.println("Stock actual de Café Premium: " + stockCafePremium);

        int demand = getDemand();

        if(stockCafePremium >= demand) {
            System.out.println("Podemos cubrir el pedido de " + demand + " unidades");
        } else {
            System.out.println("No hay stock suficiente para cubrir el pedido. Sorry");
        }
    }

    public static int getDemand(){
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es la demanda de café Premium? ");

        return sc.nextInt();
    }

    public static void operator(){
        int unitPrice = 200;
        int quantity = 10;
        int totalCost = unitPrice * quantity; //2000

        System.out.println("El costo total del pedido es: $" + totalCost);
    }

    public static void hello(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingresá tu nombre: ");

        String nameClient = sc.nextLine();

        System.out.println("¡Bienvenido/a a nuestra tienda, " + nameClient + "!");
    }

    public static void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos querés comprar? ");

        int quantityProduct = sc.nextInt();

        System.out.println("Vas a comprar " + quantityProduct + " prodcutos");
    }
}