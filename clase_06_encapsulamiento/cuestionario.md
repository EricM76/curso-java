
Clase 6 - JAVA
Comenzado el	martes, 8 de abril de 2025, 23:44
Estado	Finalizado
Finalizado en	martes, 8 de abril de 2025, 23:46
Tiempo empleado	1 minutos 24 segundos
Puntos	11,00/11,00
Calificación	10,00 de 10,00 (100%)
Pregunta 1
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Por qué conviene que los atributos sean private en lugar de public?
Pregunta 1Respuesta

a.
Para obligar al usuario a modificar el código fuente cada vez que quiera cambiar un atributo.

b.
Para asegurar el encapsulamiento, controlando el acceso a los atributos mediante getters y setters.

c.
Porque Java no permite atributos public en las clases.

d.
Para no poder acceder jamás a los valores de los atributos.
Retroalimentación
Declarar los atributos como private y usar getters/setters es una práctica estándar de encapsulamiento que protege la integridad de los datos.



La respuesta correcta es: Para asegurar el encapsulamiento, controlando el acceso a los atributos mediante getters y setters.
Pregunta 2
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
Si una clase Pedido contiene una ArrayList<Producto> como atributo, ¿qué relación se está modelando?
Pregunta 2Respuesta

a.
Encapsulamiento, ya que Pedido oculta sus atributos.

b.
Polimorfismo, ya que Producto adopta distintas formas dentro de Pedido.

c.
Herencia, ya que Pedido extiende ArrayList.

d.
Composición/Colaboración, ya que Pedido tiene/usa objetos Producto dentro de sí.
Retroalimentación
Tener una ArrayList<Producto> en Pedido muestra que Pedido colabora con Producto, conteniéndolos en su interior (composición).



La respuesta correcta es: Composición/Colaboración, ya que Pedido tiene/usa objetos Producto dentro de sí.
Pregunta 3
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué sucede si no se define ningún constructor en una clase?
Pregunta 3Respuesta

a.
La clase no puede crear objetos con new.

b.
La clase utiliza un constructor por defecto sin parámetros que provee el compilador.

c.
La clase no puede compilar.

d.
Se lanza una excepción en tiempo de ejecución.
Retroalimentación
La respuesta correcta es: La clase utiliza un constructor por defecto sin parámetros que provee el compilador.
Pregunta 4
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué es una variable de clase (estática) en Java?
Pregunta 4Respuesta

a.
Una variable única para cada objeto instanciado.

b.
Una variable que no puede cambiar su valor.

c.
Una variable que solo existe dentro de un método.

d.
Una variable compartida por todas las instancias de la clase, perteneciente a la clase en sí.
Retroalimentación
Una variable estática pertenece a la clase, no a un objeto en particular, y todas las instancias la comparten.



La respuesta correcta es: Una variable compartida por todas las instancias de la clase, perteneciente a la clase en sí.
Pregunta 5
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué ventaja ofrece el uso de getters y setters?
Pregunta 5Respuesta

a.
Obligan a que los atributos sean siempre públicos.

b.
Impiden totalmente el acceso a los atributos.

c.
Permiten manipular atributos libremente sin validaciones.

d.
Permiten controlar y validar el acceso a los atributos, evitando valores inválidos.
Retroalimentación
Getters y setters permiten validar y controlar el acceso a los atributos, mejorando la integridad de los datos.



La respuesta correcta es: Permiten controlar y validar el acceso a los atributos, evitando valores inválidos.
Pregunta 6
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Para qué sirven los constructores en una clase Java?
Pregunta 6Respuesta

a.
Para eliminar objetos de la memoria.

b.
Para ejecutar código sin necesidad de un método main.

c.
Para cambiar el tipo de dato de una variable sin crear una nueva clase.

d.
Para inicializar los atributos de un objeto al crearlo con new.
Retroalimentación
Los constructores se ejecutan al crear un objeto y sirven para inicializar correctamente sus atributos.



La respuesta correcta es: Para inicializar los atributos de un objeto al crearlo con new.
Pregunta 7
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cuál es una buena práctica al crear métodos en POO?
Pregunta 7Respuesta

a.
Que los métodos nunca retornen valores, solo impriman resultados.

b.
Que los métodos hagan múltiples tareas complejas sin dividir la lógica.

c.
Que todos los métodos sean estáticos para simplificar el uso.

d.
Que los métodos tengan nombres descriptivos y realicen una sola tarea concreta.
Retroalimentación
Los métodos deberían tener nombres descriptivos y enfocarse en una sola responsabilidad, facilitando el mantenimiento y la lectura del código.



La respuesta correcta es: Que los métodos tengan nombres descriptivos y realicen una sola tarea concreta.
Pregunta 8
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cuál es la principal diferencia entre la programación estructurada y la orientada a objetos?
Pregunta 8Respuesta

a.
La programación estructurada no permite usar variables.

b.
La POO no permite usar funciones.

c.
La programación estructurada es más moderna que la POO.

d.
La programación orientada a objetos se basa en clases y objetos que representan entidades del mundo real.
Retroalimentación
La POO organiza el código en clases y objetos, reflejando entidades y comportamientos, mientras que la programación estructurada se centra en secuencias de instrucciones y funciones.



La respuesta correcta es: La programación orientada a objetos se basa en clases y objetos que representan entidades del mundo real.
Pregunta 9
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué sucede si no se define ningún constructor en una clase?
Pregunta 9Respuesta

a.
La clase no puede crear objetos con new.

b.
Se lanza una excepción en tiempo de ejecución.

c.
La clase no puede compilar.

d.
La clase utiliza un constructor por defecto sin parámetros que provee el compilador.
Retroalimentación
Si no se define un constructor, Java provee uno por defecto sin parámetros.



La respuesta correcta es: La clase utiliza un constructor por defecto sin parámetros que provee el compilador.
Pregunta 10
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Cómo se logra el encapsulamiento en Java?
Pregunta 10Respuesta

a.
Declarando las variables como public y los métodos como private.

b.
Usando solo variables globales sin métodos.

c.
Evitando el uso de clases y trabajando solo con funciones.

d.
Declarando atributos private y usando getters y setters para controlarlos.
Retroalimentación
El encapsulamiento se logra ocultando los atributos (private) y exponiendo métodos de acceso (getters y setters) que controlan cómo se modifican esos atributos.

La respuesta correcta es: Declarando atributos private y usando getters y setters para controlarlos.
Pregunta 11
Correcta
Se puntúa 1,00 sobre 1,00
Marcar pregunta
Enunciado de la pregunta
¿Qué es un objeto en el contexto de la POO?
Pregunta 11Respuesta

a.
Una variable global que almacena datos temporales.

b.
Un bloque de código que se ejecuta sin parámetros.

c.
Un archivo externo que se importa al proyecto.

d.
Una instancia concreta de una clase, con atributos y métodos.
Retroalimentación
Un objeto es una instancia de una clase, que posee atributos (estado) y métodos (comportamientos).



La respuesta correcta es: Una instancia concreta de una clase, con atributos y métodos.