package clasesReconocimiento;

import java.util.Scanner;

public class Suma3Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3, suma;
		
		System.out.println("Digite las 3 calificaciónes");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma = nota1 + nota2 + nota3;
		
		System.out.println("\nLa suma total es: "+suma);
		
		
	}
	
}
