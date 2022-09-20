package clasesReconocimiento;

import java.util.Scanner;

public class AveriguarCantidadDinero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float guillermo, luis, juan, total;
		
		System.out.print("¿Cuanto dinero tiene Guillermo?  →");
		guillermo = entrada.nextFloat();
		
		luis = guillermo/2;
		juan = (guillermo+luis)/2;
		
		total = guillermo+luis+juan;
		
		System.out.println("El total de dinero es: "+total);
		
		
		
	}

}
