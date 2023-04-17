import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestCalculadora 
{
	
	//Crearemos un objeto de la clase calculadora
	private Calculadora calculadora = new Calculadora();

	//Probaremos el metodo suma de la clase calculadora, con unos valores que le daremos
	@Test
	public void testSumar() 
	{
		calculadora.num1 = 2;
		calculadora.num2 = 3;
		calculadora.sumar();
		assertEquals(5, calculadora.resultado);
	}

	//Probaremos el metodo resta de la clase calculadora, con unos valores que le daremos
	@Test
	public void testRestar() 
	{
		calculadora.num1 = 5;
		calculadora.num2 = 3;
		calculadora.restar();
		assertEquals(2, calculadora.resultado);
	}

	//Probaremos el metodo dividir de la clase calculadora, con unos valores que le daremos
	@Test
	public void testDividir() 
	{
		calculadora.num1 = 6;
		calculadora.num2 = 2;
		assertDoesNotThrow(() -> calculadora.dividir());
		assertEquals(3, calculadora.resultado);
	}

	//Probaremos el mismo metodo dividir, pero esta vez el denominador sera 0
	@Test
	public void testDividirPorCero() 
	{
		calculadora.num1 = 5;
		calculadora.num2 = 0;
		assertThrows(Exception.class, () -> calculadora.dividir());
	}

	//Probaremos el metodo multiplicar con unos valores que le asignaremos
	@Test
	public void testMultiplicar() 
	{
		calculadora.num1 = 2;
		calculadora.num2 = 3;
		calculadora.multiplicar();
		assertEquals(6, calculadora.resultado);
	}

	//Probaremos el metodo multiplicar, pero uno de los valores sera 0
	@Test
	public void testMultiplicarPorCero() 
	{
		calculadora.num1 = 5;
		calculadora.num2 = 0;
		calculadora.multiplicar();
		assertEquals(0, calculadora.resultado);
	}
}
