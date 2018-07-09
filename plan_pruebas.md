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

Listado de las funcionalidades no directamente involucradas en el desarrollo, pero cuyos componentes están siendo afectados y por ende deben probarse para asegurar que continúan funcionando adecuadamente. Al igual que en el punto anterior, se describen desde el punto de vista del usuario. 

### Funcionalidades a No Probar 
- 
Listado de las funcionalidades que NO se van a probar. Debe incluir información de las razones por las cuales no se van a probar y los riesgos que se están asumiendo.

### Enfoque de Pruebas (Estrategia) 
La Estrategia de Pruebas puede definirse como un documento aparte, o puede ser incluido dentro del Plan de Pruebas según su extensión. Aquí pueden definirse los tipos de pruebas a realizar (funcionales, de desempeño, de interfaces, no funcionales, etc.), requerimientos especiales de las pruebas, configuraciones a probar, subconjuntos de datos a considerar, nivel de pruebas de regresión, entre otros aspectos.

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
- Navegador WEB (Firefox o GChrome).

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
Lista cada una de las personas integrantes del equipo de QA y sus responsabilidades. Se puede hacer uso de una Matriz RACI (Responsable, Aprobador, Consultado, Informado). 

### Cronograma
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
Ponho!
Lista de todos los documentos que pueden citarse como apoyo o para ampliar el contenido del plan de pruebas. Algunos ejemplos de lo que se puede hacer referencia aquí son: 
•	Plan de Proyecto.
•	Especificaciones de Requerimientos. 
•	Diseño General.
•	Diseño Detallado. 
•	Procedimientos y estándares de Desarrollo. 
•	Procedimientos y estándares de Pruebas. 
•	Metodologías, Procedimientos y estándares corporativos.

## Glosario
Definiciones de términos usados en la documentación, y general sobre el área de pruebas.
