public class CalcWithIntAndFloat {

	private static void calc(int cycles) {
		
		float f1 = 0.1f;   // big DEc 
		float f2 = 0f;
		
		for(int i = 0; i < cycles; i++) {
			f2 += f1;
		}
		
		
		int i1 = 1;
		int i2 = 0;
		for(int i = 0; i < cycles; i++) {
			i2 += i1;
		}
		
		System.out.println("Cycles " + cycles + " -> float: " + f2 + " int: " + (((float)i2)/10) );
		//System.out.printf("Cycles %5d -> float: %4.6f int: %4.6f \n", cycles, f2 ,(((float)i2)/10) );
	}

	public static void main(String[] args) {
				
		calc(10);
		calc(100);
		calc(1000);
		calc(10000);
		calc(100000);
		
	}
	  
}