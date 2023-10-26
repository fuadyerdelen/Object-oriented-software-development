public class Start{

	public static void checkWithIf(int z1, int z2){
		
		System.out.println("\nIf with Z1("+z1+") & Z2 ("+z2+"):");
		
		if(z1 > z2){
			System.out.println("Z1 ("+z1+") > Z2 ("+z2+")" );
		}
		else if(z2 > z1){
			System.out.println("Z2 ("+z2+") > Z1 ("+z1+")" );
		}
		else {
			System.out.println("Z1 ("+z1+") = Z2 ("+z2+")" );
		}
	}

	public static void countWithWhile(int start, int endExclusive){
		
		System.out.println("\nWhile:");
		int i= start;
		while(i<endExclusive){
			System.out.println(i);
			i++;
		}

	}
	
	public static void countWithFor(int start, int endExclusive){
		
		System.out.println("\nFor:");
		for(int i=start; i < endExclusive; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String [] args){
	    
		checkWithIf( 9, 3);
		System.out.println("str");
		checkWithIf( 4, 5);  
		
		countWithWhile( 1, 11);
		countWithFor  ( 11, 21);
	}
}