 # Plan de Pruebas de Software
 ## Concesionario - AutoUD
 ## 9 de julio, 2018


## Tabla de Contenidos
### Historial de Versiones
### Información del proyecto
### Aprobaciones
### Resumen Ejecutivo
### Alcance de las Pruebas
#### Elementos de Pruebas
#### Nuevas Funcionalidades a Probar
#### Pruebas de Regresión
#### Funcionalidades a No Probar
#### Enfoque de Pruebas (Estrategia)
### Criterios de Aceptación o Rechazo
#### Criterios de Aceptación o Rechazo
#### Criterios de Suspensión
#### Criterios de Reanudación
### Entregables
### Recursos
#### Requerimientos de Entornos – Hardware
#### Requerimientos de Entornos – Software
#### Herramientas de Pruebas Requeridas
#### Personal
#### Entrenamiento
### Planificación y Organización
#### Procedimientos para las Pruebas
#### Matriz de Responsabilidades
#### Cronograma
#### Premisas
#### Dependencias y Riesgos
### Referencias
### Glosario

## Resumen Ejecutivo
El propósito del presente documento es describir e informar al lector acerca del plan maestro de pruebas de software del proyecto AutoUD. Teniendo en cuenta lo anterior, el alcance del plan es la descripción, documentación, implementación y entrega de resultados para los componentes de Venta, Nómina e Inventario, no obstante, los recursos para la realización de las pruebas son limitados y además, la falta de conocimiento y experiencia en las herramientas de prueba de software. 

## Alcance de las Pruebas

### Elementos de Pruebas
- Nómina
	- Calcular de comisiones por venta.
	- Calcular de prestaciones.
	- Calcular de deducciones.
	- Calcular de Sueldo.
	- Consulta de Nomina.
- Inventario
	- Agregar nuevo automóvil.
	- Consulta de automóviles.

- Venta
	- Generar nueva cotización.

### Nuevas Funcionalidades a Probar 
- Generación de Nómina.
- Generación de listado de vendedores.
- Generación de listado de clientes.
- Inventario de vehículo del concesionario.

### Pruebas de Regresión 
- Registro de Empleado.
- Registro de Cliente.

### Funcionalidades a No Probar 
- Aquellas que no han sido listadas anteriormente, ya que cubren el alcance establecido y esperado por el equipo de trabajo.

### Enfoque de Pruebas (Estrategia) 
Se busca realizar pruebas de las funcionalidades, de interfaces y requerimentos no funcionales de los componentes de Nómina, Venta e Inventario. Para ello, se busca un subconjunto de entradas definidas (Ej: Nombre, Apellido, Placa de vehículo, Documento de identificación, entre otros) y configuraciones (Ej: Navegadores), que conduzcan hacia el correcto cumplimiento de los requerimentos, establecidos en el documento de plan de proyecto.


## Criterios de Aceptación o Rechazo
### Criterios de Aceptación o Rechazo 
- Completar el 100% de las pruebas unitarias.
- 80% de casos exitosos.
- 80% de defectos corregidos.
- Cobertura de las funcionalidades mencionadas anteriormente.

### Criterios de Suspensión 
- Defectos en la herramienta de pruebas.
- Defectos en una o varias funcionalidades.
- Incompletitud de una o varias funcionalidades.
- Fallos en el desempeño de las pruebas.

### Criterios de Reanudación
- Corrección de fallos en la herramienta de prueba.
- Corrección de defectos en las funcionalidades.
- Entrega de funcionalidad completa.
- Reformulación de diseño de pruebas.


## Entregables 
- Documento de Plan de Pruebas.
- Casos de Pruebas.
- Especificación de Diseño de Casos.
- Reportes de incidencias de errores.
- Reportes generados por las herramientas de automatización de pruebas.

## Recursos
### Requerimientos de Entornos – Hardware 
- 4 Computadores portatiles.
- Base de daros PostgresSQL.
- Servidor GlashFish 4.12
- Repositorio GitHub.
- Conexión a internet (5MB).

### Requerimientos de Entornos – Software 
- Software de automatización de Pruebas.
- Navegador WEB (Firefox o Google Chrome).

### Personal
Segun el organigrama establecido; tenemos 5 integrantes que cumpliran con los roles de lider, Analistas de pruebas, desarrolladores, diseñadores y DBA.
Dichas personas son:
- (1) David Ricardo Cortes Leal.
- (2) David Hernando Castro Santiago.
- (3) Juan Sebastian Sanchez Mancilla.
- (4) Oscar Ivan Torres Pinto.
- (5) Daniel Alfonso Vargas Ortiz.

### Entrenamiento
Capacitación de los empleados en las herramientas pertinentes en la ejecución de las pruebas.
 
## Planificación y Organización
### Procedimientos para las Pruebas
- Pruebas unitarias.
- Pruebas de integración de modulos.
- Pruebas de Aceptación.

### Matriz de Responsabilidades
#### Integrantes del equipo QA:
- Gerente de calidad
	- David Ricardo Cortes Leal.	
- Ingeniero de calidad	
	- David Hernando Castro Santiago.
	- Juan Sebastián Sanchez Mancilla.
- Asistente Ingeniero de calidad
	- Óscar Iván Torres Pinto.			
	- Daniel Alfonso Vargas Ortiz.

#### Matriz RACI
![Matriz RACI](https://github.com/danielvargas97/AutoUD/blob/master/matrizRACI.png)

### Cronograma
![Cronograma Pruebas]((https://github.com/danielvargas97/AutoUD/blob/master/Cronograma-Pruebas.png)
//Referenciar cronograma de tareas en esta sección.

### Premisas
- Para la sección de pruebas de caja blanca usaremos Selenium, al igual para las pruebas de optimización y rendimiento.
- Para las metricas del software usaremos el plugin STAN que prueba la calidad general de los modulos del software.
 
### Dependencias y Riesgos
En el proyecto tenemos ciertos riesgos asociados con el proceso de pruebas de software, listados a continuación.

- Dependencias con otros proyectos de la org.
	- Establecimiento de estandares de comunicación entre proyectos.
- Disponibilidad de recursos.
	- Acudiendo a las pólizas y a los acuerdos establecidos en cuanto a holguras de recursos (dinero), se podria llegar a un acuerdo de aumento presupuestal y su debido ajuste en los documentos de entrega.
- Restricciones de tiempo.
	- Acudir a las holguras de tiempo que se establecieron en el cronograma de manera implicita.
- Premisas que resulten no ser ciertas (Resultados no esperados de las herramientas de prueba).
	- Buscar nuevas herramientas que puedan solventar las falencias del software que usamos (Selenium).

## Referencias 
-[Plan de Proyecto](https://github.com/danielvargas97/AutoUD/blob/master/README.md)
-[¿Qué es una Matriz RACI? ](http://www.cantabriatic.com/que-es-una-matriz-raci/)

## Glosario
### Glosario Matriz RACI
- R: Responsible / Responsable. Es el que se encarga de hacer la tarea o actividad.
- A: Accountable / Persona a cargo. Es la persona que es responsable de que la tarea esté hecha. No es lo mismo que la R, ya que no tiene porqué ser quien realiza la tarea, puede delegarlo en otros. Sin embargo, si es quien debe asegurarse de que la tarea sea haga, y se haga bien.
- C: Consulted / Consultar. Los recursos con este rol son las personas con las que hay consultar datos o decisiones con respecto a la actividad o proceso que se define.
- I: Informed / Informar. A estas personas se las informa de las decisiones que se toman, resultados que se producen, estados del servicio, grados de ejecución…
