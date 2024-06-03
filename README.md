<h1 align="center"> Divirtor: conversor de divisas </h1>

![Diferentes divisas mostrando la idea de convertir monedas](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/92fd44f7-929e-4b24-b52f-c72f375056b7)
![Badge estado del proyecto: finalizado](https://img.shields.io/badge/Status-Finished-orange)
![Aplicación funcionando](https://img.shields.io/badge/Conversor-funcionando-blue)
![Aplicación funcionando](https://img.shields.io/badge/Version-1.3.0-red)
![GitHub Org's stars](https://img.shields.io/github/stars/YazidVillasana?style=social)

<h2>Indice</h2>

<br><b><i>—Introducción</i></b>

<br><b><i>—Estado del proyecto</i></b>

<br><b><i>—Características y demostración</i></b>

<br><b><i>—Bitacora</i></b>

<br><b><i>—Desarrollador</i></b>


*****************************


<h3>Introducción</h3>

Divirtor es una aplicación sencilla que permite, mediante la consola, consultar diversas divisas de manera intuitiva.

Las monedas/divisas disponibles a consultar en Divirtor son:
<br><b>BRL</b> &emsp;&emsp; <i>Real brasileño</i>
<br><b>MXN</b> &emsp;&emsp; <i>Nuevo peso mexicano</i>
<br><b>USD</b> &emsp;&emsp; <i>Dólar americano</i>
<br><b>CAD</b> &emsp;&emsp; <i>Dólar canadiense</i>
<br><b>ARS</b> &emsp;&emsp; <i>Peso argentino</i>
<br><b>CLP</b> &emsp;&emsp; <i>Peso chileno</i>
<br><b>COP</b> &emsp;&emsp; <i>Peso colombiano</i>
<br><b>CHF</b> &emsp;&emsp; <i>Franco suizo</i>
<br><b>CNY</b> &emsp;&emsp; <i>Renminbi yuan chino</i>
<br><b>EUR</b> &emsp;&emsp; <i>Euro</i>
<br><b>JPY</b> &emsp;&emsp; <i>Yen japones</i>
<br><b>GBP</b> &emsp;&emsp; <i>Libra esterlina</i>

Es posible consultar todas las combinaciones disponibles entre las divisas, donde cualquiér par es posible de comparar y mostrar el resultado de la conversión.

*****************************

<h3>Estado del Proyecto</h3>

El proyecto fue un desafió para mostrar las hábilidades adquiridas en las clases que ofrece <a href="https://www.aluracursos.com/"><b>ALURA<b><a/> donde pude desarrollar por cuenta propia un programa que permite, en un estado inicial del programa, seleccionar entre seis opciones e introducir un valor que sería el monto a convertir. 

<br>Como parte del desafio, de forma opcional, se solicitaba crear registros de las consultas, añadir más divisas y crear una marca de tiempo de cada registro lo cual nos lleva al producto actual. 
<br>De este modo, el estado del proyecto es: <b>"Finalizado"</b>

*****************************

<h3>Características y demostración</h3>

Divirtor es un convertidor de divisas que, mediante la llamada de una API proporcionada por <a href="https://www.exchangerate-api.com/">ExchangeRate-API<a/>, permite al usuario seleccionar una variedad de divisas las cuales podran crearse conversiones desde una divisa a convertir y otra divisa objetivo, siendo que el usuario podrá seleccionar el montó que desea consultar. 
<br>Asi, Divirtor es un programa simple, pero intuitivo.

Ahora, una pequeña demostración de cómo funciona la aplicación y demostración de cómo usar este programa.


Al iniciar, el usuario será bienvenido y mostrará instrucciones de 3 sencillos pasos.
<br>1. Eligir y escribir el código de divisa a convertir
<br>2. Introducir el código de divisa objetivo la cuál se calculará.
<br>3. Ingresar el mónto a convertir.

![inicio Instrucciones](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/4c49b7dc-3ee3-448e-b1af-f6dd15f31b15)

<br>A continuación, se muestra el menú de Divisas, donde muestra las siglas o código de las monedas que se desean convertir y enseguida el nombre de la moneda que representa. La aplicación cuenta con doce monedas disponibles para crear pares de conversión. 

![menu De Divisas Y Primer Input](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/e5c81f5b-01c1-410b-8292-5abf457b2fb3)

<br>en la parte inferior de la captura, podemos apreciar que la consola nos solicita ingresarel código de la divisa a convertir, y a manera de ejemplo se introduce "BRL" que representa el "Real brasileño" que sería el primer parametro que se solicita al usuario, tal como se indica en las instrucciones. 

<br>Ahora, tras introducir el primer parametro, en este caso BRL, se nos pregunta por la siguiente divisa para calculár la conversión, el cuál por fines didácticos seleccionamos USD o dólar americano. Como último parametro se solicita al usuario que ingrese el monto del valór a convertir entre BRL y USD, en este caso sería "100[BRL]". El programa mediante la solicitud API que realiza con estos parametros, nos mostrará una leyenda que indica el monto de la divisa a convertir tiene el valor de "19.2 [USD]"

![Ingresando los códigos de divisas a convertir su monto y resultado](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/c27178bd-56b8-4020-bae2-5d23b292e98e)

<br>Al terminar la consulta, la aplicación de forma interna agrega esta información a una lista con un estampado de tiempo sobre la consulta recién realizada, la cual se almacenará de forma local hasta que finalice el programa, y dicha información será guardada en un archivo .json a modo de registro.

<br>Al terminar esta iteración, volvemos al menú de Divisas y nuevamente la consola nos solicitará ingresar el cógido de la divisa, que, a manera de demostracón crearemos otra consulta, en esta ocasión convertiremos 1,000 "MXN"/Nuevos pesos mexicanos a "CHF"/Franco suizo para crear un segundo registro. 

![Consulta de conersión de nuevo peso mexicano a franco suizo](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/61f291d8-3fef-4d21-b405-011614ea9197)

<br>Como se muestra en el input introducido de la captura, el programa se ha optimizado para que se reconozca el código sin importar el uso de mayusculas o mínusculas. Continuando, se crea la consulta y muestra el resultado que 1000 MXN son igual a 53.11 francos suizos.

<br>Nuevamente se mostrará el menú de divisas, pero digamos que ya hemos terminado con nuestras consultas y deseamos finalizar el programa, una de las opciones mostradas en la parte inferior del menú es "salir" el cual permite al usuario terminar con la aplicación. Simplemente se introduce como parametro la palabra "Salir" sin hacer distinción entre mayúsculas o minúsculas, y éste finalizará.

![SaliendoDeLaAplicacion](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/d1ed793f-f607-4afa-ace8-f039f7e5c06d)


<br>Una vez finalizada la sesión, la aplicación recolecta todas las consultas guardadas en la lista y las introduce dentro de un nuevo documento .json que servirá para recolectar la información de las consultas

![Archivo .json creado y sus datos](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/f52cf9c7-a1eb-4ab7-a618-d13fc3d2901c)

<br>El archivo se nombra automáticamente con el nombre de "consulta" más un número que lo identifica como archivo único, la fecha con formato mes, día y año para facilitar la identificación del archivo. Dentro del archivo podemos ver que al inicio de cada consulta viene estampada la fecha y hora en que ésta fue realizada, seguido del valor ingresado, la divisa a convertir, la divisa objetivo y el valor de la conversión final.

<br> No hay límite en la cantidad de consultas que se puede solicitar a la aplicación, pues estas se iran acumulando para imprimirse en el archivo que se generará una vez finalizando el programa, y en cada ocasión que un archivo es creado, se irá incrementando la cifra seguida de la palabra "consulta" para así no sobre-escribir archivos viejos con nuevos y llevar una mejor gestión de los archivos generados.

![Multiples Archivos j.son y Multiples Consultas en un archivo](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/b62f9929-54b9-416f-b012-54b1c3b05738)

<br>Sin más, esta es la demostración de cómo funciona y el comportamiento de este convertidor de divisas.

*****************************

<h3>Bitacora</h3>

Por cuestiones de error humano, no se generaron distintas "branches" al momento de realizar los commits al repositorio, así que las versiones anteriores e iniciales del programa no se encuentra disponible. Sin embargo, me encontré realizando una bitacora en cada momento que creí que me encontraba realizando un push tras cambios y progresos significativos. 
<br>Asi, a continuación, una bitacora explicando el procedimiento a groso modo de la realización de este programa.

-Bitacora: 
1.01 Empezando a configurar el entorno de trabajo.

1.02 Agregando clase ConvertidorDeMonedas donde se configurará la API.

1.03 Agregando Record para llamar las divisas y la conversión.

1.04 Corrigiendo un error en el record "CompararPrecios" de coda a code

1.05 Se creo un método para llamar la comparasión de divisas en el record "Comparar Precios." se mantiene en standby el record "Llamar Divisas." Se comenzó a escribir el código en principal y se probó que se puede llamar a la API y se puede llamar sin problemas.

1.06 En la Clase Principal, se agregó el Menú y Scanner para el input. Iniciando un "switch" para agregar cada caso del menú.

1.07 Principal: crear el primer caso, aun incompleto para determinar valores. CompararParesDeDivisas: Se iban agregar variables pero se descartó. CompararPrecios se eliminó "conversion_rate" y se acomodo base_code, target_code y conversion_result. Se creó la clase "Divisas" donde se agregó 3 variables para poder llamar después de forma independiente.

1.08 Divisas: Se Agregaron getters y setters, y se creó un método para llamar objetos del Json.

1.09 Principal: El case 1 está listo y corré sin problemas mostrando el resultado deseado al momento de llamarlo en la consola. Adicionalmente, se llamó la clase Divisa con valor de "cantidad" y se creo la variable "opción" con valor a 0 que servirá para condicionar el while, funcioinando siempre y cuando no sea un 7. Se modificó al llamar opción para el input porque ya estaba declarada la variable antes. Se modificó la lectura para ingresar la cantidad. Se modificó y arregló el case 1 llamando la clase Divisas llamandolo "resultado" donde se ingresa el valor de "cantidad" y compara, que ayudará a imprimirlo adecuadamente con un "toString". Se llama un sout con resultado.   
LlamarDivisas: fue Eliminada pues no se tiene un uso con ellas.
Divisas: Se había agregado con Comparable pero fue descartado. Se arregló los parametrs para llamar a Divisas, agregando un "float valor", y dentro del mismo, se modificó el llamar valor.getValor por simplemente "valor". Se modifica y retoca el toString. 
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
Se creó la clase "GeneradorDeHistorial" y en esta clase se creó el método para guardar los datos de cada consulta del programa.
Divisas: Sé optimizó el código y se eliminó los Getters y Setters que no se usan en el código.

1.2.02 En esta ocasión se registrará en cada sesión del convertidor de monedas un archivo Json donde cada consulta será guardada en una lista, cuyo valor sería la fecha y la información solicitada como el monto, las monedas a llamar y la conversión. Al finalizar la sesión, todos estos datos serán guardados en un archivo Json, y por cada sesión, el nombre del archivo agregará una cifra que estará aumentando en la creación de un nuevo archivo.  
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

*****************************

<h3>Desarrollador</h3>

<p><b>Yazid Villasana</b></p>

<img align="center">![Yazid Villasana](https://github.com/YazidVillasana/desafioConvertidorMonedas/assets/119089799/07c5edf1-83d2-4387-ac58-c5ae0d0e7baf)</img>

Mi <a href="https://github.com/YazidVillasana">GitHub <a/>

Mi <a href="https://www.linkedin.com/in/yazidvillasana/">Linked <a/>

Contacto: <a href="mailto:villasana.yazid@gmail.com">villasana.yazid@gmail.com<a/>

 
