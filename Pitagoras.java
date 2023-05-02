// Tube ciertos problemas para poder realizar este algoritmo asi que tome referencias de internet.
import java.util.Scanner;

public class Pitagoras{
	public static void main(String[] args) {

		double cateto1, cateto2, hipotenusa;
		Scanner sc = new Scanner(System.in);
		 
    System.out.println("Buenos Dias, hoy calcularemos los lados de un triangulo, Pitagoras");
    //Normalmente siempre se calcula mas la Hipotenusa asi que le daremos prioridad a eso.

    System.out.println("Introduce el valor de cateto1, porfavor");
    cateto1 = sc.nextDouble();
  //El cateto1 se va a tomar como el cateto Adyacente que su formula es (Raiz de pitagoras elevado al cuadrado menor catero opuesto al cuadrado.)

    System.out.println("Introduce el valor de el cateto2, porfavor");
    cateto2 = sc.nextDouble();
  //El cateto2 se va a tomar como el cateto Opuesto que su formula es (Raiz de pitagoras elevado al cuadrado menor catero Adyacente al cuadrado.)

    System.out.println("Introduce el valor de la hipotenusa deve de ser este dato mas grande que los demas, porfavor");
    hipotenusa = sc.nextDouble();
  //La Hipotenusa se va a tomar como hipotenusa que su formula es (Raiz de cateto Adyacente elevado al cuadrado mas catero opuesto al cuadrado.)

    System.out.println("La hipotenusa es:" +Math.sqrt(Math.pow (cateto1, 2) + Math.pow(cateto2, 2)));
    System.out.println("Cateto 1 es:" +Math.sqrt(Math.pow (hipotenusa, 2) - Math.pow(cateto2, 2)));
    System.out.println("Cateto 2 es:" +Math.sqrt(Math.pow (hipotenusa, 2) - Math.pow(cateto1, 2)));

	}
}
		

	

		