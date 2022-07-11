
public class HiloEjemplo extends Thread {
	
	public HiloEjemplo(String nombre) {
		super(nombre);
	}

	public void run() {		
		
	/*	
	 
		for (int i=0;i<10;i++) {
			System.out.println(i + " ");
		}
		System.out.println("Fin del hilo");
	}
	
	*/
	
	/*
	
	for (int i=0; i<10; i++) {
		System.out.println(i + " " + getName());
	}
	System.out.println("Fin del hilo" + getName());
	}
	
	*/
		
	for(int i=0; i<10; i++) {
		if(getName().equalsIgnoreCase("Hilo Uno")) {
			System.out.println(i + " " + getName() + "<------");
		} else {
			System.out.println(i + " " + getName() + "------>");
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin del Hilo" + getName());
	  }
	}

}
