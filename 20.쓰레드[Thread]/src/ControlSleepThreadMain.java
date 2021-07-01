
public class ControlSleepThreadMain {

	public static void main(String[] args) throws InterruptedException {
	 System.out.println("1.main");
	 System.out.println("2.main 쓰레드 3초간 sleep");
     Thread.sleep(3000);
     System.out.println("3.main 쓰레드 3초후 sleep깨어난후 실행");
     ControlSleepThread cst=new ControlSleepThread();
     cst.start();
     System.out.println("4.main 쓰레드 return ");
     
     
	}

}
