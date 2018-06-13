# RentAByke
Program to manage the rental of a bicycle shop, developed in JAVA, I use Netbeans IDE 8.2

Hola!! La lógica fué lo primero que pensé y me centré en los métodos para calular los costos del alquiler, son los siguientes:

Método calculateCostPerHour:
Método que calcula el costo de la renta por hora, tiene una tolerancia de 15 minutos, pasado ese tiempo se le cobrará el recargo por minutos excedidos. Recibe por parámetro un objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio.

Método calculateCostPerDay:
Método que calcula el costo de la renta por Día, no apliqué ningun tipo de recargo ya que el local tiene un horario de apertura y cierre y hace que no haya que calcular excedentes de ningún tipo (la bicicleta se devuelve en un día o al siguiente). Recibe por parámetro un objeto de la clase RentTime y una variable integer que aloja el valor de la cantidad de bicicletas. Devuelve un double con el precio.
