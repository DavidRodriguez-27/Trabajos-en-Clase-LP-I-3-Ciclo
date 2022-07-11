
public class clsFuncCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "   este ES UN texto de PRUEBA    ";
		String frase = original.trim();
		System.out.println("*"+original+"*");
		System.out.println("*"+frase+"*");
		//PARA OBTENER LA LONGITUD DE CADENA:
		System.out.println(frase.length());
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		System.out.println(frase.substring(0, 3));
		System.out.println(frase.substring(frase.length()-2,frase.length()));
		System.out.println(frase.indexOf("B"));
		System.out.println(frase.indexOf("UN t",15));

	}

}
