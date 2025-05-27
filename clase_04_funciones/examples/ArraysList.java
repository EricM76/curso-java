import java.util.ArrayList;
public class ArraysList {
    /*
     * ArrayList es una implementación de la interfaz List.
       Se usa cuando queremos una lista dinámica, con acceso rápido por índice.
       Ideal para lectura frecuente; no se recomienda si hay muchas inserciones al medio (usar LinkedList en ese caso).
       Resumen de Métodos útiles (List y ArrayList)

        Método	Descripción
        add(valor)	Agrega un elemento
        get(indice)	Obtiene el valor en una posición
        set(indice, valor)	Modifica un valor en una posición
        remove(valor/índice)	Elimina por valor o posición
        contains(valor)	Verifica si existe un valor
        size()	Devuelve la cantidad de elementos
        clear()	Vacía la lista
        isEmpty()	Verifica si está vacía
        indexOf(valor)	Devuelve la posición de un valor (si no existe, devuelve -1)
        lastIndexOf(valor)	Devuelve la última posición de un valor (si no existe, devuelve -1)
        toArray()	Convierte a un array
        sort()	Ordena la lista (necesita Collections.sort())
     */
    public static void main(String[] args) {
        // Creamos un ArrayList de números enteros
        ArrayList<Integer> edades = new ArrayList<>();

        // Agregamos elementos
        edades.add(25);
        edades.add(30);
        edades.add(22);

        // Recorremos con for tradicional
        for (int i = 0; i < edades.size(); i++) {
            System.out.println("Edad en posición " + i + ": " + edades.get(i));
        }

        // Modificamos un valor
        edades.set(1, 35); // Cambia el valor en posición 1
        System.out.println("Lista después de modificar: " + edades);

       /* edades.set(100,3);
        System.out.println("Lista después de modificar: " + edades);*/ 

        // Eliminamos un valor por índice
       /* edades.remove(0); // Elimina el primer valor
        System.out.println("Lista después de eliminar: " + edades);*/ 

        // Vaciar la lista
        /*edades.clear();
        System.out.println("Lista vacía: " + edades);*/
        // TAREA HACER UN ARRAYLIST SIN TIPO DE DATO
    }
}
    
    /*
     * IMPORTANTE
     *  List es una interfaz
        Es parte del framework de colecciones de Java.

        Define comportamientos genéricos para listas (como add, remove, get, etc.).

        No se puede instanciar directamente:

        List<String> lista = new List<>(); // ERROR
        Se utiliza para programar hacia una interfaz, lo cual es una buena práctica.

        ArrayList es una clase concreta
        Implementa la interfaz List.

        Tiene una estructura basada en array dinámico.

        Se puede instanciar directamente:

        ArrayList<String> lista = new ArrayList<>(); // CORRECTO
        🧠 Resumen:
        IMPORTANTE: CUANDO VEAMOS POO ESTO COBRARA SENTIDO
        Característica	               List (interfaz)	               ArrayList (clase concreta)
        ¿Se puede instanciar?	          ❌ No	                         ✅ Sí
        ¿Tiene comportamiento propio?	  ❌ No, solo define	             ✅ Sí, lo implementa
        ¿Permite flexibilidad?	          ✅ Alta (interfaz)	             🔁 Limitada a su implementación
        ¿Recomendación?	                Declarar como List	               Usar ArrayList como          implementación concreta
     */
