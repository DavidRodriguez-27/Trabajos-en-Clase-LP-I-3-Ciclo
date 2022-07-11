import java.util.Scanner;

public class clsNumericas {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		double x;
		System.out.println("Ingrese un numero real");
		x=lee.nextDouble();
		System.out.println("Ingresaste el numero: " + x);
		
		System.out.println("Valor absoluto: " + Math.abs(x));
		System.out.println("Entero superior: " + Math.ceil(x));
		System.out.println("Entero inferior: " + Math.floor(x));
		System.out.println("Redondeado a 3 decimales: " + (double)Math.round(x*1000/1000));
		System.out.println("Redondeado a 2 decimales: " + (double)Math.round(x*100/100));
		System.out.println("Redondeado a 0 decimales: " + (double)Math.round(x*1/1));
		System.out.println("Elevado al cuadrado: " + Math.pow(x, 2));
		System.out.println("Elevado al cubo: " + Math.pow(x,3));
		System.out.println("Raiz cuadrada: " + Math.sqrt(x));
		System.out.println("Valor aleatorio: " + Math.random());
		System.out.println("Constante PI: " + Math.PI);
		System.out.println("Exponente logaritmo natural: " + Math.E);

	}

}
