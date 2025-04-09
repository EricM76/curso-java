import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testImmutabilityString();
        formatProduct();
        String result = formatNameProduct("caFÉ PREMIUM molido");
        System.out.println(result); // Café Premium Molido
        introArrays();
        introArrayList();
        System.out.println("Producto traído de la lista: " + getProduct(1));
    }

    public static void testImmutabilityString() {
        String name = "Juan";
        System.out.println(name); // Juan

        name.toUpperCase();
        System.out.println(name); // Juan

        name = name.toUpperCase();
        System.out.println(name); // JUAN
    }

    public static void formatProduct() {
        String product = "Café Premium MOLIDO  ";
        product = product.trim().toLowerCase();
        System.out.println(product); // café premium molido
    }

    public static String formatNameProduct(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void introArrays() {
        String[] products = new String[3]; // create string array with 3 elements
        products[0] = "Café Premium Molido";
        products[1] = "Té Verde Orgánico";
        products[2] = "Chocolate Amargo 80%";

        for (String product : products)
            System.out.println("Producto: " + product);
    }

    public static void introArrayList() {
        ArrayList<String> productsList = new ArrayList<>();
        productsList.add("Café Premium Molido");
        productsList.add("Té Verde Orgánico");
        productsList.add("Chocolate Amargo 80%");

        for (String product : productsList)
            System.out.println("Producto de la lista: " + product);
    }

    public static String getProduct(int index){
        ArrayList<String> productsList = new ArrayList<>();
        productsList.add("Café Premium Molido");
        productsList.add("Té Verde Orgánico");
        productsList.add("Chocolate Amargo 80%");

        return productsList.get(index);
    }
}

