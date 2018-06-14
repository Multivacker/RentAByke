# RentAByke
Program to manage the rental of a bicycle shop, developed in JAVA, I use Netbeans IDE 8.2

Hola!! La lógica fué lo primero que pensé y desarrollé, la primer idea que tuve fué la obtener el momento en el que empieza y en el que finaliza el alquiler mediante la clase Date, (un click de un boton iba a captar el momento exacto según la hora del sistema y ya no tenía que lidiar con excepciones ni entrada de datos erróneos) Luego restarle al Date de alquilerFinaliza el Date de alquilerEmpieza dándome como resultado otro Date llamado tiempoDeAlquiler (me quedaba un Date de año 0 (1900), de mes 0 (Enero), para días la diferencia, etc. Pero tuve la mala idea de querer alojar las semanas en el parámetro Month (que acepta valores de 0 a 11 y considerando que el dueño de la tienda no pidió que le arme una promoción mensual, pensaba en un límite de hasta tres o 4 semananas en el alquiler) la cuestión es que esto no prosperó (Me tiraba error en el cálculo de semanas) y decidí armarme un Date perzonalizado para el caso, contenía esta vez un parámetro para semana y era la Clase RentTime, allí se encuentra el método calculatesRentTime. 

calculatesRentTime: Método que calcula la diferencia entre dos Objetos de la clase Date y devuelve un Objeto de la clase RentTime cuyos 5 parámetros son: weeks, days, hours, minutes, seconds, todos son integers. Mediante el uso del método getTime() de la clase Date obtengo rentStarts y rentEnds expresados en milisegundos, le resto rentStarts a rentEnds y esa diferencia la uso para calcular y alojar los 5 parámetros del objeto de salida RentTime.

Getters, setters y toString();


En la clase Ticket están los métodos para calular los costos del alquiler, calcular el precio final y métodos para generar e imprimir el ticket de cobro y son los siguientes (La tienda no cobra seguro de alquiler):

Método calculateCostPerHour: Método que calcula el costo del alquiler por hora, tiene una tolerancia de 15 minutos, pasado ese tiempo se le cobrará el recargo por minutos excedidos. Recibe por parámetro un Objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio.

Método calculateCostPerDay: Método que calcula el costo del alquiler por Día, no apliqué ningun tipo de recargo ya que el local tiene un horario de apertura y cierre y hace que no haya que calcular excedentes de ningún tipo (la bicicleta se devuelve en un día o al siguiente). Recibe por parámetro un objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio.

calculateCostPerWeek: Método que calcula el costo del alquiler por Semana y cobra también si hubiera, días excedentes. Recibe por parámetro un objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio.

calculatesFinalprice: Decide qué promoción aplicar acorde al rentTime recibido, y decide si aplicar o no el descuento por plan familiar acorde a la cantidad de bicicletas alquiladas.Recibe por parámetro un objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio final.

printTicket: Este método muestra solo la información que se requiere para imprimir el ticket. Recibe 3 parámetros que son objetos de la clase Ticket, la clase client y la clase Bike respectivamente. devuelve un double con el precio final formateado a 2 decimales.

Getters, setters y toString();

En las clases de Bike y Client estan los métodos Getters, setters y toString();

Finalmente la clase RentAByke es la encargada de hacer el testing mediante ejemplos de Tickets para ser calculados e impresos por pantalla. Esta clase es la que tiene el método main y donde arranca a ejecutarse desde el proyecto. Como no se pidió ningún tipo de aplicación no hice una arquitectura de Modelo Vista Controlador(La cual había pensado una interfaz para el dueño de la tienda, otra para el testing y otro JForm para el Ticket) Ni tampoco página web (No diseñé una Base de datos para conectarme, y tampoco consideré necesario aplicarle al programa colecciones mediante la clase arrayList de tipo Client y Bike)
