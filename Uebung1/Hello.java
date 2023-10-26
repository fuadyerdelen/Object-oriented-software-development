 /**
   * Mein erstes Programm in der Datei Hello.java
   */
  public class Hello {
	    /**
		 * Meine erste Methode main
		 */
		public static void main(String[] args) {
			// Wir geben "Hello World!" auf der Konsole aus
			System.out.println("Hello M.Fuad!");
			
			
			/** 
			*1.e =>  Erstens erkannte es die Zahlen 5 und 3 als 
			*Text und schrieb sie nebeneinander. 
			*Im zweiten Fall wurden die Zahlen in Klammern gesetzt, 
			*so dass sie als Zahlen gelesen und addiert wurden.   
			*/
			
			System.out.println("Ergebnis1:" + 5 + 3 );
			System.out.println("Ergebnis1:" + (5 + 3) );
			
			
			/** 
			*1.f => Ich habe immer endlosse "Hello" bekommen.
			* Wenn ich Strg + C gemaht habe, stoppte es.
			*/
			
			 while(true){
				System.out.println("Hello");
			} 
			
			
		}
  }