//---------LA TEOR�A-------------
//Cada archivo .java se denomina clase

//SECUENCIA DE COLORES:
	//NARANJA = Palabras clave de Java
	//AZUL = Nombre clase (Edad)
	//CIAN = Nombre variable privada (A�os)
	//EL OTRO AZUL = Nombre variable no privada (A)
	//VERDE = Nombre de m�todo al crear (setA�os, getA�os, FaltanParaCien) (L�neas: 30 39 48)
	//LIMA = Nombre de m�todo al llamarlo (getA�os) (L�nea 49)

//PRIVATE/PUBLIC
	//PRIVATE: Variables / m�todos que se utilizan s�lo desde esta clase. No se pueden llamar desde otra. (Variable A�os)
	//PUBLIC: Variables / m�todos que se utilizan desde esta y otra clase. Se pueden utilizar desde otra clase porque son Public (setA�os, getA�os, FaltanParaCien)

//OPERACIONES:
	//A�os es de tipo short	
	//El m�todo FaltanParaCien() devuelve un tipo int
		//Se opera 100-getA�os (int-short). Esta operaci�n es posible porque int>short
	//Secuencia de tipos: byte>short>int>long>float>double

//------------COMIENZO DEL PROGRAMA---------------
public class Edad {		//De esta forma se inicializa una clase. Esta clase se llama Edad.

//------------INICIALIZACI�N DE VARIABLES----------------
	private short A�os; //De esta forma se inicializa una variable (atributo) de una clase. (private/public) (tipo dato) (nombre)
						//En todos los programas, las variables ser�n de tipo private.

//---------------M�TODOS SET-----------------------
	public void setA�os(short A) {		//De esta forma se inicializa un m�todo de una clase. (private/public) (tipo de dato que devuelve) (nombre) (variables que necesita)
										//En todos los programas, los m�todos ser�n de tipo public.
										//Este m�todo se llama setA�os
										//Este m�todo devuelve un valor de tipo void (vac�o) o sea, no devuelve nada
										//Este m�todo requiere una variable de tipo short a la que llamaremos A
		A�os = A;		//Esta es la funci�n del m�todo. Introducir� el valor de A en la variable A�os.		
	}		//Cerramos el m�todo con una llave
	
//-----------------M�TODOS GET-------------------
	public short getA�os () {			//M�todo getA�os. Devolver� los a�os introducidos.
										//Este m�todo es de tipo public
										//Este m�todo devuelve un valor de tipo short (n�mero entero) por lo que despu�s de public dice short
										//Este m�todo no requiere ninguna variable as� que entre los par�ntesis no hay nada escrito.
		return A�os;		//La funci�n return es NECESARIA en un m�todo que devuelva un valor. La forma de la funci�n es: return (variable)
							//NOTA: EL TIPO DE VARIABLE DEBE SER EL MISMO QUE APAREZCA EN LA INICIALIZACI�N DEL M�TODO. EN ESTE CASO SHORT.
	}		//Cerramos el m�todo con una llave
	
//----------------M�TODOS DE C�LCULO--------------------
	public int FaltanParaCien () {		//M�todo FaltanParaCien. Devolver� los a�os restantes para los 100
		return (100 - getA�os());		//Devuelve el valor de 100 - los A�os introducidos
										//NOTA: EN ESTE M�TODO ESTAMOS LLAMANDO A OTRO M�TODO (GETA�OS) PARA QUE NOS DEVUELVA LA VARIABLE A�OS.		
	}		//Cerramos el m�todo con una llave
}
