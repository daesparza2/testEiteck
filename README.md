## Actividad BackEnd Eiteck 👇


Considere el siguiente escenario:
La panadería XXX desea vender cajas de panes mediante una página web. Hay que tener en cuenta
que existen 3 usuarios distintos en la aplicación, un administrador, un cliente y un usuario delivery.
El administrador del sitio se encargará de cargar la información sobre las cajas como: nombre,
precio, cantidad (unidades por caja), descripción, además, una caja puede tener una o varias
imágenes asociadas. A más de lo anterior, el usuario administrador tendrá la posibilidad de ver los
pedidos que han sido realizados mediante el sitio web, es de interés conocer: qué cliente realizó el
pedido, la fecha en la que hizo el pedido, el tipo de pago y el valor total de la orden.
Por otro lado el cliente, únicamente podrá acceder al sitio web y realizar pedidos en la aplicación.
Tenga en cuenta que el cliente podrá registrar una o varias direcciónes conforme haga pedidos. Para
realizar una órden (una o varias cajas de panes). El usuario debe indicar: nombre, dirección, teléfono
y puede escoger alguno de los siguientes métodos de pago: efectivo o tarjeta.
Finalmente, el usuario de tipo delivery podrá tener acceso a ver las órdenes que han sido generadas
para poder realizar los envíos.
Se requiere crear web services (Rest y formato JSON) que representen una posible solución a dicho
escenario; para ello:
- Backend: (framework o lenguaje a su elección)
- Base de datos: la de su preferencia, PostgreSQL, MySQL, NoSQL, etc
- Documentación adecuada de los endpoints generados (urls, formatos en solicitudes POST,
etc)


<h1 align="center"> PanaderiAPI</h1>
<p align="center"><img src="https://refactorizando.com/wp-content/uploads/2020/12/spring-data-postgresql-1024x308.jpeg"/></p> 

## Tabla de contenidos:
---

- [Mi solucion](#mi-solucion)
- [Diagrama Entidad Relacion](#diagrama-entidad-relacion)
- [Guía de usuario](#guía-de-usuario)
- [Guía de instalación](#guía-de-instalación)
- [Cómo contribuir](#cómo-contribuir)
- [Código de conducta](#código-de-conducta)
- [Autor/es](#autores)
- [Información adicional](#información-adicional)
- [Licencia](#licencia)
- [Limitación de responsabilidades - Solo BID](#limitación-de-responsabilidades)

## Mi solucion
---
Lo primero que hice fue organizar mi trabajo utilizando la herramienta https://trello.com/ de la siguiente manera 



- Trabaje bajo el enfoque de Scrum por lo que estableci 5 columnas "Product Backlog", "To Do", "In Progress", "Testing" y "Done"
- Decidi trabajr con spring boot y postgreSql por que son las tecnologias con las que he trabajado el ultimo año en el lado del backend
- Segui la estructura MVC para la codificacion del proyecto utilizando una cuarta capa destinada a los servicios que me permiten exprimir las bondades y facilidades de trabajar con spring boot y JPA 
- Para la gestion de los usuarios y sus roles utilice spring security, el cual me permite configurar las url de la api para definir que tipo de usuario puede acceder o realizar una peticion al proyecto backend

![image](https://user-images.githubusercontent.com/65741905/150896455-b2a28045-a5cd-4c8e-8f5b-1877b2d180fa.png)
 Nota : la columna Done esta duplicada con el fin de que se puedan observar todas las actividades que se encuentran en ella

### Diagrama Entidad Relacion
---
![panaderiatest](https://user-images.githubusercontent.com/65741905/150896658-b04f0617-fb0a-4be9-83af-53ac969a00b4.png)

## Po
---
Esto es un archivo README. Debe contener la documentación de soporte uso de la herramienta digital. Las siguientes secciones son las secciones recomendadas que debes poner incluir en cualquier herramienta digital. Puedes descargar este archivo para que te sirva como plantilla.

Asegúrate de empezar este archivo con una breve descripción sobre las funcionalidades y contexto de la herramienta digital. Sé conciso y al grano.

## Guía de usuario
---
Explica los pasos básicos sobre cómo usar la herramienta digital. Es una buena sección para mostrar capturas de pantalla o gifs que ayuden a entender la herramienta digital.
 	
## Guía de instalación
---
Paso a paso de cómo instalar la herramienta digital. En esta sección es recomendable explicar la arquitectura de carpetas y módulos que componen el sistema.

Según el tipo de herramienta digital, el nivel de complejidad puede variar. En algunas ocasiones puede ser necesario instalar componentes que tienen dependencia con la herramienta digital. Si este es el caso, añade también la siguiente sección.

La guía de instalación debe contener de manera específica:
- Los requisitos del sistema operativo para la compilación (versiones específicas de librerías, software de gestión de paquetes y dependencias, SDKs y compiladores, etc.).
- Las dependencias propias del proyecto, tanto externas como internas (orden de compilación de sub-módulos, configuración de ubicación de librerías dinámicas, etc.).
- Pasos específicos para la compilación del código fuente y ejecución de tests unitarios en caso de que el proyecto disponga de ellos.

### Dependencias
Descripción de los recursos externos que generan una dependencia para la reutilización de la herramienta digital (librerías, frameworks, acceso a bases de datos y licencias de cada recurso). Es una buena práctica describir las últimas versiones en las que ha sido probada la herramienta digital. 

    Puedes usar este estilo de letra diferenciar los comandos de instalación.

## Cómo contribuir
---
Esta sección explica a desarrolladores cuáles son las maneras habituales de enviar una solicitud de adhesión de nuevo código (“pull requests”), cómo declarar fallos en la herramienta y qué guías de estilo se deben usar al escribir más líneas de código. También puedes hacer un listado de puntos que se pueden mejorar de tu código para crear ideas de mejora.

## Código de conducta 
---
El código de conducta establece las normas sociales, reglas y responsabilidades que los individuos y organizaciones deben seguir al interactuar de alguna manera con la herramienta digital o su comunidad. Es una buena práctica para crear un ambiente de respeto e inclusión en las contribuciones al proyecto. 

La plataforma Github premia y ayuda a los repositorios dispongan de este archivo. Al crear CODE_OF_CONDUCT.md puedes empezar desde una plantilla sugerida por ellos. Puedes leer más sobre cómo crear un archivo de Código de Conducta (aquí)[https://help.github.com/articles/adding-a-code-of-conduct-to-your-project/]

## Autor/es
---
Nombra a el/los autor/es original/es. Consulta con ellos antes de publicar un email o un nombre personal. Una manera muy común es dirigirlos a sus cuentas de redes sociales.

## Información adicional
---
Esta es la sección que permite agregar más información de contexto al proyecto como alguna web de relevancia, proyectos similares o que hayan usado la misma tecnología.

## Licencia 
---

La licencia especifica los permisos y las condiciones de uso que el desarrollador otorga a otros desarrolladores que usen y/o modifiquen la herramienta digital.

Incluye en esta sección una nota con el tipo de licencia otorgado a esta herramienta digital. El texto de la licencia debe estar incluído en un archivo *LICENSE.md* o *LICENSE.txt* en la raíz del repositorio.

Si desconoces qué tipos de licencias existen y cuál es la mejor para cada caso, te recomendamos visitar la página https://choosealicense.com/.

Si la herramienta que estás publicando con la iniciativa Código para el Desarrollo ha sido financiada por el BID, te invitamos a revisar la [licencia oficial del banco para publicar software](https://github.com/EL-BID/Plantilla-de-repositorio/blob/master/LICENSE.md)

## Limitación de responsabilidades
Disclaimer: Esta sección es solo para herramientas financiadas por el BID.

El BID no será responsable, bajo circunstancia alguna, de daño ni indemnización, moral o patrimonial; directo o indirecto; accesorio o especial; o por vía de consecuencia, previsto o imprevisto, que pudiese surgir:

i. Bajo cualquier teoría de responsabilidad, ya sea por contrato, infracción de derechos de propiedad intelectual, negligencia o bajo cualquier otra teoría; y/o

ii. A raíz del uso de la Herramienta Digital, incluyendo, pero sin limitación de potenciales defectos en la Herramienta Digital, o la pérdida o inexactitud de los datos de cualquier tipo. Lo anterior incluye los gastos o daños asociados a fallas de comunicación y/o fallas de funcionamiento de computadoras, vinculados con la utilización de la Herramienta Digital.
