
public class Principal {

	public static void main(String[] args) {
		
		/*
		HiloEjemplo miHilo1 = new  HiloEjemplo();
		miHilo1.start();
		*/
		
		/*
		HiloEjemplo miHilo1 = new HiloEjemplo();
		HiloEjemplo miHilo2 = new HiloEjemplo();
		miHilo1.start();
		miHilo2.start();
		System.out.println("Fin del proceso");
		
		*/
		
		HiloEjemplo miHilo1 = new HiloEjemplo("Hilo uno");
		HiloEjemplo miHilo2 = new HiloEjemplo("Hilo dos");
		miHilo1.start();
		miHilo2.start();
		System.out.println("Fin del Proceso");	
		

	}

}
