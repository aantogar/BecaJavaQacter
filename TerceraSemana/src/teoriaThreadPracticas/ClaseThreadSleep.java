package teoriaThreadPracticas;

import java.text.DecimalFormat;

public class ClaseThreadSleep {
	private static int s;
	private static int m;
	private static int h;
	 private static DecimalFormat myformat=new DecimalFormat("00");
	public static void main(String[] args) throws InterruptedException {
		System.out.println("EJERCICIO TREAD SLEEP DEL RELOJ\n");
		System.out.println("Bucles anidados:\n");
		
		
		for(h=0;h<24;h++) {
			for ( m=0;m<60;m++) {
				for(s=0;s<60;s++) {
					System.out.println(myformat.format(h)+":"+
				myformat.format(m)+":"+ myformat.format(s));
					Thread.sleep(1000);
				}
			}
		}
	
	}

}
