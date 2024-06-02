



<h2>Bitacora:</h2>

1.01 Empezando a configurar el entorno de trabajo

1.02 Agregando clase ConvertidorDeMonedas donde se configurará la api

1.03 Agregando Record para llamar las divisas y la conversión.

1.04 Corrigiendo un error en el record "CompararPrecios" de coda a code

1.05 Se creo un método para llamar la comparasión de divisas en el record "Comparar Precios." se mantiene en standby el record "Llamar Divisas." Se comenzó a escribir el código en principal y se probó que se puede llamar a la API y se puede llamar sin problemas.

1.06 En Principal, se agregó el Menú y Scanner para el input. Iniciando un "switch" para agregar cada caso del menú.

1.07 Principal: crear el primer caso, aun incompleto para determinar valores. CompararParesDeDivisas: Se iban agregar variables pero se descartó. CompararPrecios se eliminó "conversion_rate" y se acomodo base_code, target_code y conversion_result. Se creó la claso "Divisas" donde se agregó 3 variables para poder llamar después de forma independiente.

1.08 Divisas: Se Agregaron getters y setters, y se creó un método para llamar objetos del Json.

1.09 Principal: El case 1 está listo y corré sin problemas mostrando el resultado deseado al momento de llamarlo en la consola. Adicionalmente, se llamó la clase Divisa con valor de "cantidad" y se creo la variable "opción" con valor a 0 que servirá para condicionar el while, funcioinando siempre y cuando no sea un 7. Se modificó al llamar opción para el input porque ya estaba declarada la variable antes. Se modificó la lectura para ingresar la cantidad. Se modificó y arregló el case 1 llamando la clase Divisas llamandolo "resultado" donde se ingresa el valor de "cantidad" y compara, que ayudará a imprimirlo adecuadamente con un "toString". Se llama un sout con resultado.   
LlamarDivisas: fue Eliminada pues no se tiene un uso con ellas.
Divisas: Se había agregado con Comparable pero fue descartado. Se arregló los parametrs para lamar a Divisas, agregando un "float valor", y dentro del mismo, se modificó el llamar valor.getValor por simplemente "valor". Se modifica y retoca el toString. 
CompararParesDeDivisas: Se había experimentado crear un extend a Divisas y un toString para llamar un super.toString, pero al final fue desechado.

1.10 Principal: Se Actualizó el menú con las opciones correctas y se corrigieron algunos errores del mismo. Se agregaron el resto de case donde: 
case 1 para convertir "Dólar" a "Real Brasieño" 
case 2 para convertir "Rea Brasileño" a "Dólar"
case 3 para convertir "Dólar" a "Peso chileno"
case 4 para convertir "Peso chieno" a "Dólar"
case 5 para convertir "Dólar" a "Peso colombiano"
case 6 para convertir "Peso colombiano" a "Dólar"
case 7 para salir de la aplicación.

1.2.01 Principal: Se mejoró el código para reducir las líneas en los cases del switch. 
Se posicionó fuera del while el inció de variables como "consulta", "compara", "cantidad", "resultado" e "historial." 
Se creó un if dentro del "try" dónde si el valor de opción no es 7, aka salir, se ejecuta un sout con el resultado y el metoddo para crear un archivo Json.
Se agregó un "Throws IOException" en el main.
Se creó la clase "GeneradorDeHistorial" y en ésta clase se creó el método para guardar los datos de cada consulta del programa.

Divisas: Sé optimizó el código y se eliminó los Getters y Setters que no se usan en el código.

1.2.02 En esta ocasión se registrará en cada sesión del convertidor de monedas un archivo Json donde cada consulta será guardada en ua lista, cuyo valor sería la fecha y la información solicitada como el monto, las monedas a llamar y la conversión. Al finalizar la sesión, todos estos datos serán guardados en un archivo Json, y por cada sesión, el nombre del archivo agregará una cifra que estará aumentando en la creación de un nuevo archivo.  

Principal: Se agregó los imports de time.format.DateTimeFormatter,util.ArrayList, util.List. Se manda a llamar un nuevo DateTimeFormate llamadó fechaHora Se creo una nueva variante llamada "fecha" que llamará fechaHora. Se llama una List desde Divisas donde se almacenará cada consulta. 
Se agregó un fecha.setFecha en la línea 51. 
 a resultado, se agregó un nuevo parametro donde se agregará la fecha y hora al momento de generarse.
 Se manda llamar a la lista para agregar los valores de "resultado"
 al finalizar la sesión, se guardara el registro en un archivo Json nuevo, y en cada iterasión, el nombre irá agregando una cifra que irá en incremento para identificarlo.
 
 GeneradorDeHistorial: Contiene el método para guardar los registros en un archivo .json.
 Se llama DateTimeFormatter con el patrón "Mes días año" que se asignará al nombre del archivo.
 Se llama Stream donde indicaremos la locaización de dónde se guardan los documentos .json. 
 Se llama la clase long creando la variable "contador" que permitirá consultar la ruta de los archivos e identicar el texto del nombre del archivo para así agregar una cifra en la creación de un nuevo archivo. 
 Se modificó el FileWriter para que el nombre del archivo se llame "consulta" concatenandolo con la variablel "contador" que irá incrementando la cifra en cada archivo nuevo, a su vez concatenandolo con la variable "dateTime" que imprime la fecha local.
 
 Divisas: Se agregó un nuevo String llamado Fecha, la cual se agregó como parametro en Divisas (línea 12) para que ésta sea agregada a la lista en principal y sea impresa en cada consulta. A su vez se agregaron los getter and setters de fecha.
 
 1.02.02:
 Se Agregó una nueva clase llamada "PrincipalMasDivisas" para experimentar con el ingreso de diferentes divisas y sus convinaciones, además de optimizar el menú de inicio y el código.
 PrincipalMasDivisas: Es la nueva clase cuyo código de Principal se tomó como base y se realizo lo anterioirmente mencionado.
 
 Divisas: Se acomodo un poco el código del getter y setter de fecha.
 se agregaron getter y setter para "divisaEntrada" y "divisaSalida" que se usa en PrincipalMasDivisas.
 1.3.0 Finale:
 Se transporta el código de la clase "PrincipalMasDivisas" a "Principal", eliminando la primera clase mencionando y dejando como producto final unicamente a Principal.
 El programa mostrará un menú con los códigos que el usuario introducirá para consultar las conversiones de monedas, lo cual amplía enormemente la posibilidad de convinaciones posiles. cada consulta se añadirá a una lista la cuál al finalizar la sesión se añadirá a un archivo json. Cada archivo .json generado tendrá un número único y la fecha de su creación. cada consulta dentro del archvo tendrá una estampa de fecha y hora.
 
 Cosas a mejorar: Inputs invalidos, pues en lugar de terminar el programa, continua y arroja como resultado "null".


 
