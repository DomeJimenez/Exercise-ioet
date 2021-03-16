# Exercise-ioet

## Resumen
Para la programación utilicé JAVA como lenguaje de programación, Eclipse como IDE y las librerías JRE System Lybrary [JavaSE-1.8] y Junit 5 para las pruebas unitarias.

La metodología que utilicé para desarrollar el ejercicio fue la metodología Kanban ya que es la metodología que suelo utilizar al realizar mis proyectos individuales y tareas en general. Esta metodología es muy útil ya que me permitió separar todo el ejercicio en pequeñas tareas como analizar el problema, codificar las funciones, crear las pruebas unitarias, etc. Y me permitió tener una visión del avance del ejercicio con respecto a mis tareas de la universidad, de este modo pude organizarme para entregar todo a tiempo.

El enfoque que utilicé para el desarrollo del ejercicio fue el desarrollo en cascada ya que es fácil de seguir, el programa es pequeño y la metodología que utilice no esta ligada a ningún enfoque.

La arquitectura que escogí fue la modelo-vista-controlador, a pesar de no tener una interfaz gráfica esta arquitectura me permite organizar como va a estar estructurado el programa. Me permite entender cuales serán las clases que utilizaré para modelar el programa y cuales utilizaré para que realicen las funciones y así lograr el objetivo planteado, separando todo esto de la clase que estará interactuando con el usuario.

No considere necesaria la implementación de ningún patrón de diseño ya que no quería hacer más complejo el código, aun así, considere la posibilidad de implementar dos patrones de comportamiento:
* Patrón iterator, lo quise incluir ya que tenía pensado utilizar una colección para guardar los datos y poder manejarlos de mejor manera, este patrón me permitiría recorrer de diferentes formas la colección, pero ya que no aportaría nada al objetivo del ejercicio no se implementó.
* Patrón Método plantilla, pensé en implementar este patrón para poder leer diferentes extensiones de archivos sin problemas, pero ya que en el ejercicio se especificó que debería ser un input .txt no se incluyó.

## Solución
Siguiendo la arquitectura que escogí, se crearon tres paquetes modelo, vista y controlador. El modelo que se creo fue Empleado, tiene los parámetros para poder almacenar y manejar la información importante: el nombre y una colección que almacena los días y horas. Se creo este modelo ya que mi solución fue crear una colección de empleados y al momento de leer el archivo.txt se extraerá la información dentro de esta colección, todo esto sucederá en el controlador. Una vez se tiene la información almacenada en la colección se creó una función que permite el análisis del pago dependiendo de los días y las horas, esta función devuelve un Sting con el formato del output pedido en el ejercicio. 

## Instrucciones
1. Clonar el repositorio en la computadora local.
2. Abrir la IDE que se prefiera para ejecutar programas creados con JAVA.
3. Acceder desde la IDE a la carpeta donde se clono el repositorio.
4. Esperar a que se cargue en la IDE y ejecutar la clase main que se encuentra en src/vista/Ejecutable.java
5. Si existe algún problema a la hora de correr el programa se debe asegurar que se incluyan las librerías JRE System Lybrary [JavaSE-1.8] y Junit 5.
