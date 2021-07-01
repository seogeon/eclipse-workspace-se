
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread");

		
		
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("mySuperUltraThread");
		cct.start();
		
		System.out.println("2.main thread");
		
	}

}
