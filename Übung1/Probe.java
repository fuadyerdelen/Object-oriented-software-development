import java.util.Scanner;

// Aufgabe 3 : Umgang mit Variablen	

// Aufgabe 3.a
		
	public class Probe{
		
		public static void main(String[] args) {
			
			Scanner input= new Scanner(System.in);
	
			System.out.println("Weisen Sie bitte a zu");
			int a= input.nextInt();
		
			System.out.println("Weisen Sie bitte b zu");
			int b= input.nextInt();
	
// Aufgabe 3.b 
	
		//int a=2;
		//int b=5;
		
		int add= a+b;//-----------> Addieren wir die Variablen.				
		int addNeg= -a+b;//-------> Addieren wir Variable a(negation) mit b.
		int addDoble= 2*(a+b);//--> Multipilieren wir addierende Variablen.
		int divisA= b/a;// -------> Dividieren wir b durc a.
		int divisB= a/b;// -------> Dividieren wir a durc b.
		int modB= a%b;// ---------> Rest von a dividiert durch b.
		int modA= b%a;// ---------> Rest von b dividiert durch a.
		
		
		System.out.println("a + b = " + add);
		System.out.println("-a + b = " + addNeg);
		System.out.println("2*(a + b) = " + addDoble);
		System.out.println("b/a = " + divisA);
		System.out.println("a/b = " + divisB);
		System.out.println("a%b = " + modB);
		System.out.println("b%a = " + modA);
		


// Aufgabe 3.c
		
		
		float fla = 2.5f;
		float flb = 5.0f;
	
		float division= fla/flb; // --------> 
		float modulo = flb%fla; // ---------> 
		float halbFlb= flb/2; // -----------> 
		float halbBvonPrv= b/2; // ---------> Wir haben wegen Variabletyp float 2,0 ausgegeben, obwohl die Variable b eine ganze Zahl ist.
		// int intErgFloatDiv= (int)flb/2; //----> Ich habe Fehler bekommen. Wir können nicht bei einen int eine Kommazahlenwert zuweisen.
		
		//System.out.println(division);
		//System.out.println(modulo);
		//System.out.println(halbFlb);
		//System.out.println(halbBvonPrv);
		// System.out.println(intErgFloatDiv);


// Aufgabe 3.d 
		
		/*
		*ich bekomme Fehler ("possible lossy conversion from int to byte")
		* Beim Variable "byte" können wir nicht etwas addieren 
		*/
		
		 byte byte1= 122;
		 byte1= b + byte1;
		 byte1= a + byte1;
		
		// System.out.println(byte1);


//  Aufgabe 3.e

		/**
		*Ich habe Fehler bekommen.
		*Wegen Wert von Variable int z können wir nicht
		*int z einer "byte" zuweisen. 		
		*/
		
		int z= 222;
		//byte byte2= (byte)z;
		
		//System.out.println(byte2);


//  Aufgabe 3.f

		/**
		*Bei dieser Übung zeigt mir die Variable "boolean", 
		*ob die Werte wahr oder falsch sind.  
		*/
		


		//boolean erste= a == 2²; 			// -----> gibt es Fehler in exponentiellen Zahlen. Wenn 4 ist --> false
		boolean zweite= a == 3; 			// -----> false
		boolean dritte= a != 3; 			// -----> true
		boolean vierte= (a == 3) == false;	// -----> true
		boolean fuenfte= (a==2)||(b==4);    // -----> true
		boolean sechste= (a==2)&&(b==4);    // -----> false
		boolean siebte= (a==2)&&!(b==4);	// -----> true
		boolean achte= a<2 && b==4||b==5;     // -----> true
		boolean neunte= a<2 && (b==4||b==5);  // -----> false		
		
		//System.out.println(neunte);


//  Aufgabe 3.g


		/* Am Ende beide sind gleich 5 geworden */
		
		int temp=a;
		 a= b;
		 b= temp;

		//System.out.println("Wert a = "+ a + ", "+"wert b = "+ b); // -->(Wert a = 5, wert b = 5)
	
	
//  Aufgabe 3.h

		
		/* Hier habe ich 1 bekommen, weil a und zero gleich geworden. */
			
		int zero= a-a;
		int divByZero= a/zero;

		//System.out.println(divByZero);
		

//  Aufgabe 3.i

		
		
		
		System.out.println("Sie haben a= "+ a +" und b= "+ b +" zugewiesen");


		}
	
	}