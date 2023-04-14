
public class Calculadora 
{
	private float resultado; //Variable en la que se almacenara el resultado de las operaciones
	private float num1, num2; //Variables que usaremos para almacenar los numeros introducidos por el usuario

	//Metodo que se llamara en el main, sacara un mensaje por pantalla
	//y cambiara el valor de num1 y num2 
    public void introducirDatos() 
    {
       
    }

    //Metodo que mostrara un mensaje por pantalla que mostrara el resultado
    //de la operacion de los dos numeros
    public void mostrarDatos() 
    {

    }

    /**
     * Metodo para sumar, almacenara el resultado en la variable resultado
     * los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
     */
	public void sumar() 
	{
		resultado = num1 + num2;
		mostrarDatos();
	}

	//Metodo para restar, almacenara el resultado en la variable resultado
    //los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
	public void restar() 
	{
		
		
	}
	
	/**
	 * @throws Exception si el segundo número (divisor) es cero.
	 * 
	 * Metodo para dividir, almacenara el resultado en la variable resultado
	 * los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
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

	//Metodo para multiplicar, almacenara el resultado en la variable resultado
    //los numeros usados seran num1 y num2. Se llamara al metodo mostrarDatos
	public void multiplicar() {
	
		
	}

	



	
}
