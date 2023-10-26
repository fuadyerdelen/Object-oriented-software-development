import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


 public class MyAppletViewer extends JFrame{
	 
	/**
	 * Mein erstes Applet
	 */
	public class HelloWorldApplet extends Applet {
		/**
		 * Die paint-Methode, die zum Zeichnen des Zeichenbereichs aufgerufen wird
		 *
		 * Graphics g: Das Grafikobjekt mit dem Sie zeichnen kÃ¶nnen (siehe: https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html)
		 */
		public void paint (Graphics g) {
			
			//g.drawString("Hello World!", getWidth()/2, getHeight()/2);
			//VerÃ¤ndern Sie hier den Code!!
			//g.drawRect(0,0,50,50);
			
			
			//2.b 
			
			g.drawRect(200,200,200,200);
			
			g.setColor(Color.RED);
			
			//links
			g.drawLine(300,100,200,200);
			
			//rechts
			g.drawLine(300,100,400,200);
			
		}
	}
	
	//Bitte am restlichen Code nichts anfassen!!
	
	public MyAppletViewer (String strTitel){
		 super(strTitel);
		 
		 this.add  (new HelloWorldApplet(), java.awt.BorderLayout.CENTER);
		 
		 this.setSize(700,500); 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);
		 
	 }

	public static void main(String [] args){
	    new MyAppletViewer("My Appletviewer");
	}	 
 }
 
 