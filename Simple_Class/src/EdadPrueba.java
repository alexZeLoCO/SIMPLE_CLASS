//---------LA TEOR�A-------------
//Cada archivo .java se denomina clase

//SECUENCIA DE COLORES:
	//NARANJA = Palabras clave de Java
	//AZUL = Nombre clase (EdadPrueba, Scanner, Edad)
	//AMARILLO = Nombre de objeto al crear (teclado, alex, Napole�n) (L�neas: 26 27 39)
	//EL OTRO AMARILLO = Nombre de objeto al llamar (teclado, alex, Napole�n) (L�neas: 30 33 34 42 44 45)
	//VERDE = Nombre de m�todo al crear (main) (L�neas: 24)
	//LIMA = Nombre de m�todo al llamarlo (setA�os, nextShort, getA�os, FaltanParaCien) (L�neas: 30 33 34 42 44 ...)

//PRINT()
	//printf("Texto %(letra)",(Variable/m�todo/operaci�n)) Imprimir� el texto entre comillas sustituyendo el %(letra) por el valor a la derecha de las comillas y la coma.
	//En este caso imprimiremos valores enteros (a�os) as� que la letra debe ser d (%d)
	//Si imprimi�semos valores reales (con decimales) la letra deber�a ser la f (%f)

	//Si queremos imprimir dos l�neas deberemos a�adir \n al final de la primera: printf("texto %d.\n",variable)
	//																			  printf("texto2 %d.",variable2)

//Esquemas:
	//Crear objeto: TIPO NOMBRE = new TIPO ();
	//Llamar m�todos: OBJETO.M�TODO(VALORES); (valores s� es necesario)
	//printf ("texto %(letra)",valor);


//------------COMIENZO DEL PROGRAMA--------------------
import java.util.Scanner; 		//IMPORTAR CLASE SCANNER PARA VARIABLE teclado
public class EdadPrueba {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO DE TIPO SCANNER LLAMADO TECLADO.
		Edad alex = new Edad ();		//CREAR OBJETO DE TIPO EDAD LLAMADO ALEX
		
		System.out.print("Introduzca su edad: "); 		//SOLICITA EDAD
		alex.setA�os(teclado.nextShort());		//LLAMAMOS M�TODO SETA�OS() DE OBJETO ALEX Y LE ENTREGAMOS COMO VARIABLE (A) LO QUE INTRODUZCA EL USUARIO POR EL TECLADO
							//NOTA: ESTAMOS LLAMANDO UNA FUNCI�N (SETA�OS()) Y PARA ENTREGARLE LA VARIABLE QUE PRECISA ESTAMOS LLAMANDO OTRO M�TODO (NEXTSHORT()) DEL OBJETO TECLADO
		
		System.out.printf("Tienes %d a�os.\n",alex.getA�os());		//IMPRIMIMOS VALOR INTRODUCIDO POR EL USUARIO UTILIZANDO PRINTF(). LLAMAREMOS AL M�TODO (GETA�OS()) DEL OBJETO ALEX
		System.out.printf("Te faltan %d a�os para llegar a 100.\n",alex.FaltanParaCien());		//IMPRIMIMOS LOS A�OS RESTANTES PARA LLEGAR A LOS 100. LLAMAREMOS AL M�TODO (FALTANPARACIEN()) DEL OBJETO ALEX
	
		//Ahora repetiremos el ejercicio con otra edad.
		//VAMOS A ALMACENAR DOS EDADES A LA VEZ, UNA BAJO EL NOMBRE DE ALEX Y OTRA BAJO NAPOLE�N.
		
		Edad Napole�n = new Edad(); 		//CREAMOS OTRO OBJETO DE TIPO EDAD LLAMADO NAPOLE�N.
		
		System.out.print("Introduzca otra edad: ");		//SOLICITAMOS OTRO VALOR
		Napole�n.setA�os(teclado.nextShort());		//LLAMAMOS M�TODO SETA�OS() DE OBJETO NAPOLE�N Y LE ENTREGAMOS COMO VARIABLE (A) LO QUE INTRODUZCA EL USUARIO POR EL TECLADO
		
		System.out.printf("Si tiene %d a�os, faltan %d para los 100\n", Napole�n.getA�os(),Napole�n.FaltanParaCien());		//MOSTRAMOS LOS A�OS Y LOS QUE FALTAN PARA 100, UTILIZAREMOS DOS %d Y DOS M�TODOS DEL OBJETO NAPOLE�N
		System.out.printf("La diferencia entre los a�os introducidos es de %d.",Math.abs(alex.getA�os()-Napole�n.getA�os()));		//MOSTRAMOS LA DIFERENCIA ENTRE LOS A�OS HACIENDO UNA OPERACI�N DE DOS M�TODOS
														//Llamamos al m�todo abs() de la clase Math (preexistente en java) para obtener el valor absoluto de la resta. (evitar resultados negativos)
	
		alex.CopiarEdad(Napole�n.getA�os());	//Llamamos al m�todo copiarEdad() del objeto alex y le entregamos lo que devuelva el m�todo Napole�n.getA�os() (los a�os de Napole�n)
							//El m�todo calcularla la diferencia y establecer� los a�os de alex como dicha difrencia.
									
		System.out.printf("Los a�os de alex menos los de Napole�n son: %d.",alex.getA�os());		//Utilizamos el m�todo alex.getA�os() apra recibir los a�os de alex. Que ser�n la diferencia entre alex y Napole�n.
	}		

}
