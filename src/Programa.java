/**
 * Clase programa que es utilizada para probar la clase calculadora
 * contiene un main el cual generara un menu de seleccion y pedira datos
 * para que se realice una operacion con ellos
 * Autor: Pablo Álvarez
 * @param args
 */
public class Programa 
{
	public static void main(String[] args) 
	{
		int eleccion = 0; //Variable usada para almacenar la eleccion de la operacion

		Calculadora calculadora = new Calculadora(); //Objeto de la clase calculadora

		//Se abre bloque try para controlar las excepciones
		try
		{
			//Pedimos los datos al usuario
			calculadora.introducirDatos();

			//Le pedimos al usuario que introduzca otro numero para elegir la operacion a realizar
			System.out.println("Introduce el numero para elegir la operacion, 9 para salir\n"
					+ "1. Sumar\n"
					+ "2. Restar\n"
					+ "3. Dividir\n"
					+ "4. Multiplicar\n");

			//Pedimos el valor de la eleccion del usuario
			eleccion = Teclado.entero();

			switch(eleccion)
			{
			case 1: calculadora.sumar();
			break;

			case 2: calculadora.restar();
			break;

			case 3: calculadora.dividir();
			break;

			case 4: calculadora.multiplicar();
			break;
			}

		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
