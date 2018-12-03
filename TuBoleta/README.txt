Se enunciarán los pasos para generar el report de serenity para el proyecto del autómata de TuBoleta.com

1)abrir la consola y cambiar el directorio al de ../TuBoleta
2)iniciar gradle con el comando "gradle"
3)luego de que gradle esté en funcionamiento corremos el comando "gradle clean test"
	*El comando clean va a eliminar los reportes previamente diligenciados de las pruebas anteriores
	*El comando test va a correr denuevo la prueba y a generar un nuevo reporte
3.1)en caso de que la linea "test.finalizedBy(aggregate)" sea eliminada del build.gradle se deberá correr adicionalmente
el comando "gradle aggregate" para generar el index que nos va a mostrar el reporte

Pre-requisitos:
	1) se debe tener gradle instalado




A la hora de escojer un concierto al azar el programa ha sido programado para que escoja el primer concierto en la lista
para demostrar el camino más adecuado, buscando en la pagina del concierto el botón amarillo para comprar una boleta
y continuar con las demás instrucciones previamente programadas. 
de igual manera el programa puede escojer un concierto al azar y de este modo se podrá evidenciar,
en el reporte, la excepcion de que no se ha encontrado el boton amarillo para comprar, ya que las paginas
de algunos conciertos no manejan todas los mismos botones en sus interfaces.