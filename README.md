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


## Guía de usuario
---
El codigo fue desarrollado  en java 8 y en spring boot 2.3.3 con el IDE eclipse. 

Puedes clonar este reposito e importar el proyecto en eclipse para su compilacion o puedes acceder a las siguientes urls que se encuentran desplegadas en https://jelastic.com/

El uso de la api necesita las siguientes credenciales 

 - Usuario Administrador  :
   username: david
   password: admin
 - Usuario cliente :
   username: alejandro
   password cliente
 - Usuario delivery :
   username: jose
   password: delivery

Las url son las siguientes:

http://env-1690261.sp.skdrive.net/caja/registrar esta es una solicitud de tipo post que recive el siguiente parametro 
 	

{
    "nombre": "empanada",
    "precio": 3.00,
    "cantidad": 8,
    "descripcion": "esto es una caja de empanadas"
}

http://env-1690261.sp.skdrive.net/imagen/guardar esta es una solicitud de tipo post y recive 2 parametros 

1. file : el archivo de la imagen que se desea guardar
2. id : el identificador de la caja a la que se le desea asociar la imagen

http://env-1690261.sp.skdrive.net/pedido/registrar esta es una solicitud tipo pst y recive el siguiente parametro 

{
    "cliente": "Alejandro",
    "fecha": "2022-01-24",
    "tipoPago": true,
    "estado": false,
    "total": null,
    "direccion": "Quito Av 10 de Agosto",
    "telefono": "0987456321",
    "cajas": null,
    "usuarioId": 2
}

En donde 
- usuarioId: es el id del usuario que registra el pedido
- tipoPago: true si es con tarjeto o false si es con efectivo 
- estado: true si fue entregado o false si aun no es entregado

http://env-1690261.sp.skdrive.net/pedido/addCajaPedido es una peticion de tipo post y recive 2 parametros 

1. idcaja: identificador de la caja que se quiere agregar al pedido
2. idpedido: identificador del pedido

http://env-1690261.sp.skdrive.net/pedido/listar es una peticion tipo get que retorna todos los pedidos

http://env-1690261.sp.skdrive.net/caja/listar es una peticion de tipo get que retorna todas las cajas

http://env-1690261.sp.skdrive.net/usuario/listaEnvios/id es una peticion de tipo get cuyo parametro id recive el id del usuario tipo delivery y retorna los datos del usuario y la lista de pedidos que tiene a su cargo

