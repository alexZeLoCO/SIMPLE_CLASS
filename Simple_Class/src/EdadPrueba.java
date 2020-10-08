//---------LA TEORÍA-------------
//Cada archivo .java se denomina clase

//SECUENCIA DE COLORES:
	//NARANJA = Palabras clave de Java
	//AZUL = Nombre clase (EdadPrueba, Scanner, Edad)
	//AMARILLO = Nombre de objeto al crear (teclado, alex, Napoleón) (Líneas: 26 27 39)
	//EL OTRO AMARILLO = Nombre de objeto al llamar (teclado, alex, Napoleón) (Líneas: 30 33 34 42 44 45)
	//VERDE = Nombre de método al crear (main) (Líneas: 24)
	//LIMA = Nombre de método al llamarlo (setAños, nextShort, getAños, FaltanParaCien) (Líneas: 30 33 34 42 44 ...)

//PRINT()
	//printf("Texto %(letra)",(Variable/método/operación)) Imprimirá el texto entre comillas sustituyendo el %(letra) por el valor a la derecha de las comillas y la coma.
	//En este caso imprimiremos valores enteros (años) así que la letra debe ser d (%d)
	//Si imprimiésemos valores reales (con decimales) la letra debería ser la f (%f)

	//Si queremos imprimir dos líneas deberemos añadir \n al final de la primera: printf("texto %d.\n",variable)
	//																			  printf("texto2 %d.",variable2)

//Esquemas:
	//Crear objeto: TIPO NOMBRE = new TIPO ();
	//Llamar métodos: OBJETO.MÉTODO(VALORES); (valores sí es necesario)
	//printf ("texto %(letra)",valor);


//------------COMIENZO DEL PROGRAMA--------------------
import java.util.Scanner; 		//IMPORTAR CLASE SCANNER PARA VARIABLE teclado
public class EdadPrueba {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO DE TIPO SCANNER LLAMADO TECLADO.
		Edad alex = new Edad ();		//CREAR OBJETO DE TIPO EDAD LLAMADO ALEX
		
		System.out.print("Introduzca su edad: "); 		//SOLICITA EDAD
		alex.setAños(teclado.nextShort());		//LLAMAMOS MÉTODO SETAÑOS() DE OBJETO ALEX Y LE ENTREGAMOS COMO VARIABLE (A) LO QUE INTRODUZCA EL USUARIO POR EL TECLADO
							//NOTA: ESTAMOS LLAMANDO UNA FUNCIÓN (SETAÑOS()) Y PARA ENTREGARLE LA VARIABLE QUE PRECISA ESTAMOS LLAMANDO OTRO MÉTODO (NEXTSHORT()) DEL OBJETO TECLADO
		
		System.out.printf("Tienes %d años.\n",alex.getAños());		//IMPRIMIMOS VALOR INTRODUCIDO POR EL USUARIO UTILIZANDO PRINTF(). LLAMAREMOS AL MÉTODO (GETAÑOS()) DEL OBJETO ALEX
		System.out.printf("Te faltan %d años para llegar a 100.\n",alex.FaltanParaCien());		//IMPRIMIMOS LOS AÑOS RESTANTES PARA LLEGAR A LOS 100. LLAMAREMOS AL MÉTODO (FALTANPARACIEN()) DEL OBJETO ALEX
	
		//Ahora repetiremos el ejercicio con otra edad.
		//VAMOS A ALMACENAR DOS EDADES A LA VEZ, UNA BAJO EL NOMBRE DE ALEX Y OTRA BAJO NAPOLEÓN.
		
		Edad Napoleón = new Edad(); 		//CREAMOS OTRO OBJETO DE TIPO EDAD LLAMADO NAPOLEÓN.
		
		System.out.print("Introduzca otra edad: ");		//SOLICITAMOS OTRO VALOR
		Napoleón.setAños(teclado.nextShort());		//LLAMAMOS MÉTODO SETAÑOS() DE OBJETO NAPOLEÓN Y LE ENTREGAMOS COMO VARIABLE (A) LO QUE INTRODUZCA EL USUARIO POR EL TECLADO
		
		System.out.printf("Si tiene %d años, faltan %d para los 100\n", Napoleón.getAños(),Napoleón.FaltanParaCien());		//MOSTRAMOS LOS AÑOS Y LOS QUE FALTAN PARA 100, UTILIZAREMOS DOS %d Y DOS MÉTODOS DEL OBJETO NAPOLEÓN
		System.out.printf("La diferencia entre los años introducidos es de %d.",Math.abs(alex.getAños()-Napoleón.getAños()));		//MOSTRAMOS LA DIFERENCIA ENTRE LOS AÑOS HACIENDO UNA OPERACIÓN DE DOS MÉTODOS
														//Llamamos al método abs() de la clase Math (preexistente en java) para obtener el valor absoluto de la resta. (evitar resultados negativos)
	
		alex.CopiarEdad(Napoleón.getAños());	//Llamamos al método copiarEdad() del objeto alex y le entregamos lo que devuelva el método Napoleón.getAños() (los años de Napoleón)
							//El método calcularla la diferencia y establecerá los años de alex como dicha difrencia.
									
		System.out.printf("Los años de alex menos los de Napoleón son: %d.",alex.getAños());		//Utilizamos el método alex.getAños() apra recibir los años de alex. Que serán la diferencia entre alex y Napoleón.
	}		

}
