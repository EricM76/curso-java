
Clase 4 - JAVA
Comenzado el	martes, 8 de abril de 2025, 21:12
Estado	Finalizado
Finalizado en	martes, 8 de abril de 2025, 21:13
Tiempo empleado	1 minutos 26 segundos
Calificación	10,00 de 10,00 (100%)
Pregunta 1
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué es la sobrecarga de métodos (overloading) en Java?
Pregunta 1Respuesta

a.
Reutilizar el mismo método para diferentes tipos de proyectos sin cambiar el nombre del archivo.

b.
Tener múltiples métodos con el mismo nombre pero distinta lista de parámetros.

c.
Crear métodos demasiado largos y complejos.

d.
Tener dos métodos con el mismo nombre y la misma firma.
Retroalimentación
La sobrecarga consiste en tener métodos con el mismo nombre pero distintos parámetros

La respuesta correcta es: Tener múltiples métodos con el mismo nombre pero distinta lista de parámetros.
Pregunta 2
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué ventaja ofrece un ArrayList frente a un array en Java?
Pregunta 2Respuesta

a.
Un ArrayList es más lento que un array en todos los casos.

b.
Los ArrayList permiten agregar y eliminar elementos dinámicamente sin tamaño fijo.

c.
Los ArrayList solo pueden contener números enteros.

d.
Los ArrayList no pueden crecer ni decrecer en tamaño.
Retroalimentación
Un ArrayList es dinámico y permite agregar o eliminar elementos sin un tamaño fijo

La respuesta correcta es: Los ArrayList permiten agregar y eliminar elementos dinámicamente sin tamaño fijo.
Pregunta 3
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué significa que en Java las variables se pasan "por valor" a los métodos?
Pregunta 3Respuesta

a.
Que el método siempre recibe el valor por referencia, pudiendo modificar la variable original.

b.
Que no es posible pasar variables a los métodos.

c.
Que el método recibe una copia del valor, sin afectar la variable original fuera del método, salvo que sean objetos.

d.
Que el método recibe una referencia al mismo objeto y lo puede cambiar por completo.
Retroalimentación
En Java los tipos primitivos se pasan por valor (el método recibe una copia). Para objetos, se pasa la referencia, pero no se puede cambiar la referencia original, aunque sí el contenido del objeto.

La respuesta correcta es: Que el método recibe una copia del valor, sin afectar la variable original fuera del método, salvo que sean objetos.
Pregunta 4
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cuál de las siguientes afirmaciones sobre las cadenas en Java es correcta?
Pregunta 4Respuesta

a.
Las cadenas en Java solo pueden contener caracteres en mayúsculas.

b.
Las cadenas en Java son inmutables, los métodos que las "modifican" devuelven nuevas cadenas.

c.
No existe la clase String en Java.

d.
Las cadenas en Java son mutables, se pueden modificar directamente.
Retroalimentación
Las cadenas en Java son inmutables. Cualquier operación que parezca modificarlas en realidad crea una nueva instancia.



La respuesta correcta es: Las cadenas en Java son inmutables, los métodos que las "modifican" devuelven nuevas cadenas.
Pregunta 5
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué logra un método con retorno double y dos parámetros int?
Pregunta 5Respuesta

a.
El método puede realizar cálculos con enteros y devolver un resultado con decimales.

b.
Debe forzosamente recibir parámetros double si el retorno es double.

c.
Solo puede retornar valores enteros, no decimales.

d.
No puede compilar, ya que int no se puede usar con double.
Retroalimentación
Un método con retorno double puede devolver decimales, aunque reciba int. Al realizar operaciones, se puede convertir o devolver el resultado en double.



La respuesta correcta es: El método puede realizar cálculos con enteros y devolver un resultado con decimales.
Pregunta 6
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué método de String en Java eliminaría espacios en blanco al principio y al final de una cadena?
Pregunta 6Respuesta

a.
replace()

b.
substring()

c.
trim()

d.
toUpperCase()
Retroalimentación
El método trim() elimina espacios al inicio y final de la cadena

La respuesta correcta es: trim()
Pregunta 7
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Si tenés un String nombre = " Café Premium MOLIDO "; y querés convertirlo en "Café Premium Molido" con la primera letra de cada palabra en mayúscula y el resto en minúsculas, ¿qué pasos deberías realizar primero?
Pregunta 7Respuesta

a.
Llamar a trim() para eliminar espacios y luego toLowerCase() para normalizar minúsculas.

b.
No existe una forma de convertir a minúsculas en Java.

c.
Reemplazar manualmente cada carácter sin usar métodos.

d.
Directamente usar toUpperCase() sin trim.
Retroalimentación
Primero trim() para remover espacios extra, luego toLowerCase() para normalizar antes de capitalizar las letras iniciales.

La respuesta correcta es: Llamar a trim() para eliminar espacios y luego toLowerCase() para normalizar minúsculas.
Pregunta 8
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cuál es la principal razón para extraer lógicas repetidas en métodos separados?
Pregunta 8Respuesta

a.
Para complicar la lectura del código.

b.
Para obligar a escribir más líneas de código innecesarias.

c.
Para simplificar el mantenimiento, aumentar la legibilidad y reutilización del código.

d.
Para duplicar funciones y confundir al equipo.
Retroalimentación
Extraer lógicas repetidas en métodos separados facilita mantenimiento, legibilidad y reutilización.

La respuesta correcta es: Para simplificar el mantenimiento, aumentar la legibilidad y reutilización del código.
Pregunta 9
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Dado el siguiente código:

String[] productos = new String[3];

productos[0] = "Café";

productos[1] = "Té";

productos[2] = "Chocolate";



¿Qué sucede si intentás acceder a productos[3]?

Pregunta 9Respuesta

a.
Retorna null.

b.
Lanza una excepción ArrayIndexOutOfBoundsException.

c.
Crea un nuevo elemento vacío automáticamente.

d.
Imprime "Chocolate".
Retroalimentación
Acceder a un índice fuera del rango del array lanza ArrayIndexOutOfBoundsException.

La respuesta correcta es: Lanza una excepción ArrayIndexOutOfBoundsException.
Pregunta 10
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué permite lograr la modularización del código mediante métodos?
Pregunta 10Respuesta

a.
Repetir la misma lógica varias veces sin razón.

b.
Dividir el código en partes más pequeñas y reusables, facilitando el mantenimiento.

c.
Evitar completamente el uso de variables.

d.
Aumentar la complejidad del programa.
Retroalimentación
La modularización mejora la mantenibilidad, reutilización y claridad del código.

La respuesta correcta es: Dividir el código en partes más pequeñas y reusables, facilitando el mantenimiento.