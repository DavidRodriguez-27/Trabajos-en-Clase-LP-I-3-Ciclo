
public class clsStringBuffer {

	public static void main(String[] args) {
		
		/*
		String cadena = "";
		long numero1 = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			cadena += "hola" + "que" + "tal" + "estas";
		}
		long numero2 = System.currentTimeMillis();
		System.out.println(numero2-numero1);
		*/
		
		StringBuffer cadena=new StringBuffer();
		long numero1 = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			cadena.append("hola");
			cadena.append("que");
			cadena.append("tal");
			cadena.append("estas");
		}
		long numero2=System.currentTimeMillis();
		System.out.println(numero2-numero1);

	}

}
