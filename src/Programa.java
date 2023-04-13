/**
 * Clase programa que es utilizada para probar la clase calculadora
 * contiene un main el cual generara un menu de seleccion y pedira datos
 * para que se realice una operacion con ellos
 * @param args
 */
public class Programa 
{


	public static void main(String[] args) 
	{
		float num1, num2; //Variables de la clase que se usaran para almacenar los numeros a operar

		int eleccion; //Variable usada para almacenar la eleccion de la operacion

		Calculadora calculadora; //Objeto de la clase calculadora

		//Se piden los dos valores
		//Pedimos el primer valor
		System.out.println("Introduce el primer numero");
		num1 = Teclado.real();

		//Pedimos el segundo valor
		System.out.println("Introduce el segundo numero");
		num2 = Teclado.real();

		calculadora = new Calculadora(num1,num2); //Le pasamos los numeros al constructor de la clase calculadora

		//Le pedimos al usuario que introduzca otro numero para elegir la operacion a realizar
		System.out.println("Introduce el numero para elegir la operacion\n"
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

}
