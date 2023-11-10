public class TesteZahl{
	
	
	static boolean isPrim(int zahl){
		boolean erg= isPrim_rec(zahl, 2);
		return erg;
	}
	
	static boolean isPrim_rec(int zahl, int divisor){
		if(zahl < 2){
			return false; // 0 und 1 gelten nicht als Primzahlen
		}

		if (zahl == 2){
			return true;
		}

		int zahlDurchDiv= zahl / divisor; // Erg was in Z. 22 berechnet wird.
		if( (zahl % divisor) == 0){
			return false;
		}
		else if(divisor > (zahl / divisor)){
			return true;
		}
		else{
			if(divisor == 2){
				boolean erg= isPrim_rec(zahl, divisor+1);
				return erg;
				// Typische, kompaktere Schreibweise:
				// return isPrim_rec(zahl, divisor+1);
			}
			else{
				boolean erg= isPrim_rec(zahl, divisor+2);
				return erg;
				// Typische, kompaktere Schreibweise:
				// return isPrim_rec(zahl, divisor+2);
			}
		}
	}
	
	public static void main(String[] args){
			
		 int z= -17;
		//methode aufrufen
		 boolean erg= isPrim(z);
		 
		 System.out.println ("Die Zahl " +z+ " ist " +( (erg == true) ? "eine" : "keine" )+ " Primzahl." );
	}
}