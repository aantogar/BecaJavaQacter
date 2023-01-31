package teoriaThreadPracticas;

public class ClaseThreadSleep {
	private static int i;
	private static int x;
	private static int y;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("EJERCICIO TREAD SLEEP DEL RELOJ\n");
		System.out.println("Bucles anidados:\n");
		for(i=0;i<60;i++) {
			for ( x=0;i<60;x++) {
				for(y=0;y<60;y++) {
					System.out.println(i+ ":"+x+":"+y+"\n");
					Thread.sleep(1000);
				}
			}
		}
	
	}

}
