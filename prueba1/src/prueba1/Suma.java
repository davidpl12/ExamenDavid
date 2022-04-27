package prueba1;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero");
		int num1=sc.nextInt();
		
		System.out.println("Introduzca el segundo numero");
		int num2=sc.nextInt();
		
		int suma;
		suma=num1+num2;
		
		System.out.println("La suma es: " + suma);
		
		System.out.println("Nueva linea");	
	}

}
