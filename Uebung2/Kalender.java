import java.util.Scanner;

public class Kalender {
	
    public static void main(String[] args){
		
		Scanner scan= new Scanner(System.in);
		



        int tag= 0;
        int m= 0;
        int j= 0;
		
		int w= 0;
		
		w = (tag + 2*m +(3*m+3)/5+j+j/4-j/100+j/400 + 1)%7;
        
        if ((m<=2) && (j<=2)){
			
            m+=12;
            j-=1;	
			
        }else if(w == 0){
			
		}

        



    }
}
