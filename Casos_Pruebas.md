# PLAN DE CASO DE PRUEBA

### Historial de Revisiones

|    Fecha   | Versión |                                 Descripción            |      Autor      |
|:----------:|:-------:|:------------------------------------------------------:|:---------------:|
| 11/07/2018 |   1.0   | Implementación caso de prueba: Consulta de nomina      |   David Castro  |
|:----------:|:-------:|:------------------------------------------------------:|:---------------:|
| 11/07/2018 |   1.0   | Implementación caso de prueba: Registro de vehiculos   |   David Castro  |
|:----------:|:-------:|:------------------------------------------------------:|:---------------:|
| 11/07/2018 |   1.0   | Implementación caso de prueba: Creación de cotización  |   David Castro  |


### Tabla de Contenidos
1. [Consulta de nomina](#topicOne)
2. [Registro de vehiculos](#topicTwo)
3. [Creación de cotización](#topicThree)


## Caso de Prueba Consulta de nomina <a name="topicOne"> </a>
**1.Descripción:**

Este artefacto cubre el conjunto de pruebas realizadas sobre el caso de uso de consulta de nomina.
La pruebas realizadas a este caso de uso son:

- Al estar en el menu principal se pasara el raton sobre el menu "nomina".
- Al desplegarse el menu se hara clic en el boton "Nomina".
- Se verificara que los registros esten completos.
- Se verificara que los registros pertenezcan al mes actual.
- Se verificara que los caracteres sean validos, entendibles y concuerden con la información de la BD.

El entorno del cual partiremos para realizar la prueba será la información presentada por la consulta de la nomina.

*Responsables:*
- Jefe de pruebas
- Aseguramiento de calidad

**2. Consultar nomina**

*2.1 Descripción*

Este modulo debe encargarse de consultar la nomina accediendo a los datos de la BD y mostrnadolos en una tabla del jsp.


*2.2 Condiciones de ejecución*

- Dar clic en el modulo de "nomina".
- Deben existir datos en la base de datos.
- Empleados deben estar registrados.
- Los servidores que atienden a la bd deben estar en plenio funcionamiento.

*2.3 Entrada*

- Los datos ya precargados en la BD de los empleados y sus ventas.

*2.4 Resultado esperado*

La pagina muestra una tabla que lista a todos los empleados con sus respectivas nominas ya calculadas en el programa, ademas de mostrarse su sueldo base y el mes actual al que sereferencia la nomina.

El estado de la prueba es : En evaluación

## Caso de prueba:Registro de vehiculos <a name="tipocTwo"> </a>
**1.Descripción:**

Este artefacto cubre el conjunto de pruebas realizadas sobre el caso de uso de registro de vehiculos.


La pruebas realizadas a este caso de uso son:

- Al estar en el menu principal se pasara el raton sobre el menu "inventario".
- Al desplegarse el menu se hara clic en el boton "Nuevo auto".
- En la ventana contigua se mostrar un formulacio al usuario en el que ingresara un vehiculo nuevo.
- Se verificaran que las condiciones puestas en la BD para cada item se cumplan.
- Se verificara que los caracteres para cada campo sean los correctos.
- Se verificara que no se produzcan errres por el tipo de datos enviados, que sean anteriormente capturados.
- Al hacer clic en Agregar se agregara el auto con su información a la BD.

El entorno del cual partiremos para realizar la prueba será el formulario de "nuevo auto" que es presentada para el ingreso de nuevos autos al concesionario.

*Responsables:*
- Jefe de pruebas
- Aseguramiento de calidad

**2. Registro de vehiculos:**

*2.1 Descripción*

Esta funcionalidad permite agregar vehiculos a la base de datos mediante la información presentada por el usuario en un formulario presentado en el JSP de nuevo auto.

*2.2 Condiciones de ejecución*

- La placa del auto a ingresar no debe estar previamente registrada.
- Conexión a la BD sin errores.
- Los caracteres enviados por el usuario deben ser validos.
- El tamaño ya predefinido en la BD no debe traspasarse en cada uno de los campos

*2.3 Entrada*

- Usuario ingresa la placa del vehiculo.
- Usuario ingresa motor del vehiculo.
- Usuario ingresa transmisión del vehiculo.
- Usuario ingresa modelo vehiculo.
- Usuario ingresa año del vehiculo.
- Usuario ingresa precio del vehiculo.
- Usuario ingresa marca del vehiculo.
- Usuario selecciona color del vehiculo.
- submit del boton "agregar".

*2.4 Resultado esperado*

La página vuelve al menu principal y el programa agrega a la base de datos el auto con la información suministrada por el usuario.

*2.5 Evaluación de la Prueba*

El estado de la prueba es : en evaluación

## Caso de Prueba: Creación de la cotización <a name="third-example"></a>

**1.Descripción:**

Este artefacto cubre el conjunto de pruebas realizadas sobre la historia de Usuario de la creación de la cotización.

![Historia de usuario 1](/images/historiaU1.PNG)

La pruebas realizadas a este caso de uso son:

- Desde el menu principal Dar clic en "Cotización" y que se habilite El modulo de cotizaciones que permite la busqueda de un auto para un cliente especifico por parte de un vendedor especifico.
- Verificación de la existencia de los datos en la BD.
- Verificación del formato de los datos.
- al terminar la busqueda mostrar elauto correspondiente a la busqueda y posible venta.

El entorno del cual partiremos para realizar la prueba será el formulario de datos que presenta el modulo de cotización para posteriormente realiar la busqueda con los datos ingresados.

*Responsables:*
- Jefe de pruebas
- Aseguramiento de calidad

**2. Actualizar información de visitante**

*2.1 Descripción*

El formulario cuyo objetivo es recibir la información del auto a buscar, el vendedor que realiza la busqueda y el cliente interesado en la busqueda para que se pueda observar el auto correspondiente a la posible venta y se construya la cotización.

*2.2 Condiciones de ejecución*

- Conexión a la BD sin errores.
- Para que el modulo funcione correctamente es necesario que ya existan en la base de datos el usuario, el cliente y el vehiculo.

*2.3 Entrada*

- Placa del vehiculo a buscar
- identificación del cliente solicitante.
- Id del vendedor.
- submit representado por el boton "cotizar".

*2.4 Resultado esperado*

El formulario envia los datos a buscar en cada entidad de la BD y muestra el vehiculo a cotizar ademas de crear una nueva fila en la entidad de ventas de la BD

*2.5 Evaluación de la Prueba*

El estado de la prueba es : en evaluación