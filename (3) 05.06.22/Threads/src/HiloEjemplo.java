
public class HiloEjemplo extends Thread {

	public static void main(String[] args) {		
		

		for (int i=0;i<10;i++) {
			System.out.println(i + " ");
		}
		System.out.println("Fin del hilo");
	}

}
