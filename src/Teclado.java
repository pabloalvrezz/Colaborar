import java.io.*;

public class Teclado 
{
	static String inicializar()
	{
		String buzon ="";
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader miTeclado = new BufferedReader(flujo);
		
		try
		{
			buzon=miTeclado.readLine();
		}
		catch (Exception e)
		{

		}
		return buzon;
	}

	static int entero()
	{
		int valor=Integer.parseInt(inicializar());
		return valor;
	}
	
	static float real()
	{
		float valor=Float.parseFloat(inicializar());
		return valor;
	}

	static double realDoble()
	{
		double valor=Double.parseDouble(inicializar());
		return valor;
	}
	
	static String cadena()
	{
		String valor= inicializar();
		return valor;
	}
	
	static char caracter()
	{
		String valor= inicializar();
		return valor.charAt(0);
	}
}
