//---------LA TEORÍA-------------
//Cada archivo .java se denomina clase

//SECUENCIA DE COLORES:
	//NARANJA = Palabras clave de Java
	//AZUL = Nombre clase (Edad)
	//CIAN = Nombre variable privada (Años)
	//EL OTRO AZUL = Nombre variable no privada (A)
	//VERDE = Nombre de método al crear (setAños, getAños, FaltanParaCien) (Líneas: 30 39 48)
	//LIMA = Nombre de método al llamarlo (getAños) (Línea 49)

//PRIVATE/PUBLIC
	//PRIVATE: Variables / métodos que se utilizan sólo desde esta clase. No se pueden llamar desde otra. (Variable Años)
	//PUBLIC: Variables / métodos que se utilizan desde esta y otra clase. Se pueden utilizar desde otra clase porque son Public (setAños, getAños, FaltanParaCien)

//------------COMIENZO DEL PROGRAMA---------------
public class Edad {		//De esta forma se inicializa una clase. Esta clase se llama Edad.

//------------INICIALIZACIÓN DE VARIABLES----------------
	private int Años; //De esta forma se inicializa una variable (atributo) de una clase. (private/public) (tipo dato) (nombre)
						//En todos los programas, las variables serán de tipo private.

//---------------MÉTODOS SET-----------------------
	public void setAños(int A) {		//De esta forma se inicializa un método de una clase. (private/public) (tipo de dato que devuelve) (nombre) (variables que necesita)
										//En todos los programas, los métodos serán de tipo public.
										//Este método se llama setAños
										//Este método devuelve un valor de tipo void (vacío) o sea, no devuelve nada
										//Este método requiere una variable de tipo short a la que llamaremos A
		Años = A;		//Esta es la función del método. Introducirá el valor de A en la variable Años.		
	}		//Cerramos el método con una llave
	
//-----------------MÉTODOS GET-------------------
	public int getAños () {			//Método getAños. Devolverá los años introducidos.
										//Este método es de tipo public
										//Este método devuelve un valor de tipo short (número entero) por lo que después de public dice short
										//Este método no requiere ninguna variable así que entre los paréntesis no hay nada escrito.
		return Años;		//La función return es NECESARIA en un método que devuelva un valor. La forma de la función es: return (variable)
							//NOTA: EL TIPO DE VARIABLE DEBE SER EL MISMO QUE APAREZCA EN LA INICIALIZACIÓN DEL MÉTODO. EN ESTE CASO SHORT.
	}		//Cerramos el método con una llave
	
//----------------MÉTODOS DE CÁLCULO--------------------
	public int FaltanParaCien () {		//Método FaltanParaCien. Devolverá los años restantes para los 100
		return (100 - getAños());		//Devuelve el valor de 100 - los Años introducidos
										//NOTA: EN ESTE MÉTODO ESTAMOS LLAMANDO A OTRO MÉTODO (GETAÑOS) PARA QUE NOS DEVUELVA LA VARIABLE AÑOS.		
	}		//Cerramos el método con una llave
	
	
	public int CopiarEdad (int número) {		//El método hallará la diferencia entre las dos edades introducidas e introducirá esta diferencia en la edad del objeto.
		setAños (Math.abs(getAños()- número));		//LLama al método setAños() y le entrega la diferencia de getAños() y un número entero que le entreguemos.
											//El número entero será el método Napoleón.getAños() pero no lo podemos llamar desde aquí, lo haremos desde la otra clase. (EdadPrueba.java)
											//Volvemos a utilizar la función Math.abs() para que el valor no sea negativo.
		return getAños();
	}
}
