
/**
 * Clase calculadora, consta de una serie de metodos que haran unas
 * operaciones con unos valores que introducira el usuario
 * Probada por Pablo Alvarez
 * A fecha de 17/04/2023
 * @author Pablo Alvarez
 * @version final
 * @since 17/04/2023
 */

public class Calculadora 
{
	public float resultado; //Variable en la que se almacenara el resultado de las operaciones
	public float num1, num2; //Variables que usaremos para almacenar los numeros introducidos por el usuario

	/**
	 * Metodo que se llamara en el main, sacara un mensaje por pantalla
	 * y cambiara el valor de num1 y num2 
	 * Autores: Raul Bustelo & Jose Antonio Alvarez
	 * @throws Se lanza una excepcion que recogera el programa principal si el valor introducido no es numerico.
	 */
	public void introducirDatos() throws Exception
	{
		try
		{
			System.out.print("Introduce el valor del primer operador: ");
			num1 = Teclado.real();


			System.out.print("\nIntroduce el valor del segundo operador: ");
			num2 = Teclado.real();
		}
		catch(Exception e)
		{
			throw new Exception("El valor introducido debe ser numerico");
		}
	}

	/**
	 * Metodo que mostrara un mensaje por pantalla que mostrara el resultado
	 * de la operacion de los dos numeros
	 * Autores: Ivan del llano, Ainhoa 
	 */
	public void mostrarDatos() 
	{
		System.out.println("El resultado de la operacion del numero 1:" + this.num1 + " y del numero 2 " + this.num2 + " es igual a " + this.resultado);
	}

	/**
	 * Metodo para sumar, almacenara el resultado en la variable resultado
	 * los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
	 * Autores: Nel Antonio Buro y Adán Barrero
	 */
	public void sumar() 
	{
		resultado = num1 + num2;
		mostrarDatos();
	}

	/**
	 * Metodo para resta, almacenara el resultado en la variable resultado
	 * los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
	 * Autores: Miguel Sorondo y Pablo Morilla
	 */
	public void restar() 
	{
		resultado = num1 - num2;
		mostrarDatos();		
	}

	/**
	 * @throws Exception si el segundo número (divisor) es cero.
	 * 
	 * Metodo para dividir, almacenara el resultado en la variable resultado
	 * los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
	 * 
	 * Autores: Emi y Ruben Santos
	 */
	public void dividir() throws Exception 
	{
		if(num2 != 0) 
		{
			resultado = num1 / num2;
			mostrarDatos();
		} 
		else throw new Exception("No se puede dividir por 0");
	}

	/**
	 * Método que multiplica {@code this.num1} por {@code this.num2}.
	 * No tiene parámetros ni devuelve nada, así que el resultado es almacenado en {@code this.resultado}.
	 * Para mostrar el resultado se llama al método {@code this.mostrarDatos()}.
	 * Autores: Marcos Lazaro y Gabriel Alvarez
	 */
	public void multiplicar()
	{
		int cantOperaciones = 0; // Almacena la cantidad de operaciones que se van a realizar
		float multiplicando = 0; // Contiene el valor que va a ser usado como multiplicando
		float decOperando; // Almacena los posibles decimales del operando

		// En el caso de que alguno de los operadores sea 0, se asignará 0 al resultado directamente.
		if(this.num1 == 0 || this.num2 == 0)
		{
			this.resultado = 0;
		}
		
		else // Si no, se realizará la operación de multiplicación
		{
			decOperando = this.num2 - (int)this.num2; // Se almacenan los decimales
			cantOperaciones = (int)this.num2; // Se almacenan la cantidad de operaciones

			// Se realiza la multiplicación
			for(int i = 0; i < Math.abs(cantOperaciones); i++)
			{
				this.num2 = multiplicando;
				this.sumar();
				multiplicando = this.resultado;
			}

			// Se devuelve a this.num2 su valor original
			this.num2 = cantOperaciones + decOperando;

			// Se realiza la operacion restante si fuese necesario
			this.resultado += this.num1 * Math.abs(decOperando);

			// Se pone this.resultado a negativo en el caso de que alguno de los operadores lo sea
			if(!(this.num1 > 0 && this.num2 > 0) || (this.num1 < 0 && this.num2 < 0))
				this.resultado = -this.resultado;
		}

		this.mostrarDatos();
	}

}
