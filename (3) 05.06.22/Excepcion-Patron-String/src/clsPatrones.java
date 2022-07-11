import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clsPatrones {

	public static void main(String[] args) {
		
		String cadena = "abc de la programacion";
		
		//1. Comprobar si el string cadena contiene exactamente el patron "abc"
		Pattern pat = Pattern.compile("abc");
		Matcher mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		//2. Comprobar si el String cadena contiene "abc"
		pat = Pattern.compile("*.abc.*");
		mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("SI");			
		} else {
			System.out.println("NO");
		}
		
		//Otra forma de hacerla:
		pat = Pattern.compile("abc");
		mat = pat.matcher(cadena);
		if (mat.find()) {
			System.out.println("valio");
		}else {
			System.out.println("No valido");
		}
		
		//3. Comprobar si el String cadena empieza por "abc"
		pat = Pattern.compile(cadena);
		if(mat.matches()) {
			System.out.println("valido");
		} else {
			System.out.println("No valido");
		}
		
		//4. Comprobar si el String cadena empieza por "abc" ó "ABC"
		pat = Pattern.compile("^[aA]bc.*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		
		//5. Comprobar si el String cadena esta formado por un minimo de 5 letras mayusculas o minusculas y un maximo de 10
		pat = Pattern.compile("^[^\\d].*");
		mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("6) SI");
		} else {
			System.out.println("6) NO");
		}
		
		//7. Comprobar si el String cadena no acaba no con un digito
		pat = Pattern.compile("\"^[^\\d]$");
		mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("7) SI");
		} else {
			System.out.println("7) NO");
		}
		
		//8. Comprobar si el String cadena solo contienen los caracteres a o b
		pat = Pattern.compile("a|b +");
		mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("8) SI");
		} else {
			System.out.println("8) NO");
		}
		
		//9. Comprobar si el String cadena contiene un 1 y ese 1 no esta seguido por un 2
		pat = Pattern.compile(".*1(?!2).*");
		mat = pat.matcher(cadena);
		if(mat.matches()) {
			System.out.println("9) SI");
		} else {
			System.out.println("9) NO");
		}

	}

}
