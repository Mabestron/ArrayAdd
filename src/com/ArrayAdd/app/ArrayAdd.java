package com.ArrayAdd.app;
import java.util.Random;
public class ArrayAdd 
{

	public static void main(String[] args) 
	{
		//Constant
		final int ELEMENTS_ARRAY=5;
		
		//Variable
		
		
		//Array Declaration
		byte[] vector = new byte [ELEMENTS_ARRAY];
		byte[] vector2 = new byte [ELEMENTS_ARRAY];
		byte[] vector3 = new byte [ELEMENTS_ARRAY];
		
		//Object declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		System.out.println(" Vector 1");
		
		//Relleno del vector con numeros aleatorios
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i]= (byte) randomNumbers.nextInt(10);
			System.out.println(vector[i]);
			
		}
		
		System.out.println(" Vector 2");
		
		//rellenado del segundo vector
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector2[i]= (byte) randomNumbers.nextInt(10);
			System.out.println(vector2[i]);
		}
		
		//Suma de Vectores el primero con el ultimo
		System.out.println("Suma de Vectores");
		int cont=ELEMENTS_ARRAY-1;
		for (int i=0;i<=ELEMENTS_ARRAY-1;i++)
		{
				vector3[i]=(byte) (vector[i]+vector2[cont]);
				cont--;
				System.out.println(vector3[i]);	
			
		}
	}

}
