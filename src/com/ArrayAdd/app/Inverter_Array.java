package com.ArrayAdd.app;
import java.util.Random;
public class Inverter_Array {

	public static void main(String[] args) {
		//Constant
				final int ELEMENTS_ARRAY=5;
				
				//Variable

				//Array Declaration
				byte[] vector = new byte [ELEMENTS_ARRAY];
				byte[] vector2 = new byte [ELEMENTS_ARRAY];
				
				//Object declaration
				Random randomNumbers = new Random(System.nanoTime());
				
				System.out.println("Vector creado ");
				//Relleno del vector con numeros aleatorios
				for (int i=0;i<ELEMENTS_ARRAY;i++)
				{
					vector[i]= (byte) randomNumbers.nextInt(10);
					System.out.println(vector[i]);
				}
				
				System.out.println("Vector invertido ");
				
				//invertir arreglo
				for (int j=ELEMENTS_ARRAY-1;j>=0;j--)
				{
				vector2[j]= (byte) vector[j];	
				System.out.println(vector2[j]);
				}
				
	}

}
