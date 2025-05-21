Cuestionario de Autoevaluación - Pre entrega
Comenzado el	martes, 20 de mayo de 2025, 20:33
Estado	Finalizado
Finalizado en	martes, 20 de mayo de 2025, 20:35
Tiempo empleado	2 minutos 42 segundos
Calificación	10,00 de 10,00 (100%)
Pregunta 1
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cuál es la razón de utilizar un menú en bucle hasta que el usuario elija salir?
Pregunta 1Respuesta

a.
Para que el usuario se confunda al no poder salir.

b.
No tiene razón de ser, se hace por costumbre.

c.
Para permitir que el usuario realice varias operaciones (agregar, listar, etc.) sin reiniciar el programa.

d.
Porque Java no soporta métodos sin bucles infinitos.
Retroalimentación
¡Correcto! Mantener el programa activo en un bucle permite realizar múltiples acciones sucesivas sin reiniciar la aplicación.

La respuesta correcta es: Para permitir que el usuario realice varias operaciones (agregar, listar, etc.) sin reiniciar el programa.
Pregunta 2
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Por qué es recomendable utilizar métodos (funciones) en tu proyecto, por ejemplo para calcular el total de un pedido o formatear nombres de productos?
Pregunta 2Respuesta

a.
Para dividir la lógica en partes reutilizables y mejorar el mantenimiento.

b.
Para complicar la lectura del código.

c.
Porque Java exige que toda la lógica esté en métodos estáticos.

d.
No es recomendable usar métodos, se hace todo en una sola clase.
Retroalimentación
¡Exacto! Los métodos ayudan a separar la lógica, mejorar la legibilidad y permitir reutilización.

La respuesta correcta es: Para dividir la lógica en partes reutilizables y mejorar el mantenimiento.
Pregunta 3
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Si quisieras personalizar el formato en que un Producto se muestra en consola, ¿qué podrías hacer?
Pregunta 3Respuesta

a.
Nada, Java no permite personalizar el formato de salida.

b.
Crear un método toString() en la clase Producto.

c.
Guardar la información en variables globales y usarlas.

d.
Escribir todo el texto en el método main.
Retroalimentación
¡Correcto! El método toString() en la clase Producto define cómo se convierte a texto al imprimir el objeto.

La respuesta correcta es: Crear un método toString() en la clase Producto.
Pregunta 4
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Por qué es importante validar los datos (como el precio y el stock) antes de crear un nuevo objeto Producto?
Pregunta 4Respuesta

a.
Porque Java no acepta números negativos.

b.
Para dificultar la inserción de datos.

c.
No es necesario, Java maneja los errores automáticamente.

d.
Para asegurar que los valores sean coherentes y evitar errores en el futuro.
Retroalimentación
¡Bien hecho! Validar asegura coherencia en los datos, evitando valores negativos o inconsistentes que podrían causar fallas lógicas.

La respuesta correcta es: Para asegurar que los valores sean coherentes y evitar errores en el futuro.
Pregunta 5
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué estructura de datos es la más adecuada para almacenar los objetos Producto en tu aplicación de Java?
Pregunta 5Respuesta

a.
ArrayList<Producto>

b.
String[]

c.
int[]

d.
HashMap<String, Producto>
Retroalimentación
¡Exacto! Un ArrayList<Producto> permite agregar, eliminar y recorrer los productos de forma dinámica y sencilla.

La respuesta correcta es: ArrayList<Producto>
Pregunta 6
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Por qué podrías necesitar una clase Pedido en tu proyecto de e-commerce?
Pregunta 6Respuesta

a.
Para separar la lógica de los pedidos (productos solicitados, cantidades, total) de la lógica de los productos o del usuario.

b.
Para almacenar todos los productos en una misma variable global.

c.
Para obligar al usuario a comprar siempre el mismo producto.

d.
No es necesario, todo se puede poner en la clase main.
Retroalimentación
¡Bien hecho! Encapsular la información y la lógica de un pedido en su propia clase clarifica responsabilidades y facilita el mantenimiento.

La respuesta correcta es: Para separar la lógica de los pedidos (productos solicitados, cantidades, total) de la lógica de los productos o del usuario.
Pregunta 7
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Si tuvieras que manejar el caso de stock insuficiente al crear un pedido, ¿qué técnica sería apropiada para comunicar el error?
Pregunta 7Respuesta

a.
Mostrar un mensaje “Stock insuficiente” y continuar sin cambios.

b.
Escribir un comentario en el código y seguir sin notificar al usuario.

c.
Ignorar el problema y dejar que se vendan productos con stock negativo.

d.
Lanzar una excepción personalizada (por ej. StockInsuficienteException) y manejarla adecuadamente.
Retroalimentación
¡Muy bien! Crear excepciones personalizadas y capturarlas mejora la robustez y claridad del código.

La respuesta correcta es: Lanzar una excepción personalizada (por ej. StockInsuficienteException) y manejarla adecuadamente.
Pregunta 8
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
En una aplicación que maneja un catálogo de productos, ¿cuál es la utilidad de una variable static int contadorProductos en la clase Producto?
Pregunta 8Respuesta

a.
Se usa para obligar a cada objeto a tener el mismo nombre.

b.
No tiene ninguna utilidad, solo aumenta la complejidad.

c.
Permite acceder a atributos privados de otras clases.

d.
Para compartir un contador global que se incremente cada vez que se crea un nuevo Producto.
Retroalimentación
¡Exacto! Una variable static compartida permite llevar la cuenta de cuántos productos se han creado sin relacionarlo a una instancia en particular.

La respuesta correcta es: Para compartir un contador global que se incremente cada vez que se crea un nuevo Producto.
Pregunta 9
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Si definiste una clase Pedido que contiene una lista de productos y sus cantidades, ¿cuál es la ventaja principal de gestionar esas relaciones en una clase separada y no directamente en la clase Producto?
Pregunta 9Respuesta

a.
No hay diferencia, se puede poner todo en la clase Producto sin problemas.

b.
Permite un mayor control de versiones en el repositorio.

c.
Obliga a que todos los productos se vendan en la misma cantidad.

d.
Simplifica la lógica al separar la responsabilidad de gestionar pedidos de la definición de productos.
Retroalimentación
Al poner la lista de productos y cantidades en la clase Pedido, se separan las responsabilidades: Producto se encarga de las características de cada producto (nombre, precio, stock), mientras que Pedido maneja la lógica de compra y cantidades solicitadas.

La respuesta correcta es: Simplifica la lógica al separar la responsabilidad de gestionar pedidos de la definición de productos.
Pregunta 10
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué ventaja aporta el uso de la clase Scanner en la interacción con el usuario?
Pregunta 10Respuesta

a.
No tiene ninguna ventaja, ya que Java no necesita leer datos del usuario.

b.
Hace que el programa sea completamente gráfico.

c.
Permite leer datos desde la consola de forma sencilla, adaptando tipos como int, double o String.

d.
Obliga al usuario a ingresar siempre valores por defecto.
Retroalimentación
¡Exacto! Scanner facilita la lectura de distintos tipos (enteros, decimales, textos) desde la consola.

La respuesta correcta es: Permite leer datos desde la consola de forma sencilla, adaptando tipos como int, double o String.