package Übung9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Umrechnung extends JFrame {

    public Umrechnung() {
        setTitle("Umrechner");

        // Hier erstelle ich die Button mit dem Namen "berechne"
        JButton berechne = new JButton("berechne");
        add(berechne, BorderLayout.SOUTH);

        // Hier erstelle ich das Label mit dem Namen "Result"
        JLabel label = new JLabel("Result");
        add(label, BorderLayout.EAST);

        // Hier erstelle ich die TextAreas mit dem Namen "schreib_1" und "schreib_2"
        // mit dem Borderlayout NORTH und CENTER
        JTextArea schreib_1 = new JTextArea("0");
        add(schreib_1, java.awt.BorderLayout.NORTH);

        JTextArea schreib_2 = new JTextArea("0");
        add(schreib_2, java.awt.BorderLayout.CENTER);

        // Hier erstelle ich die ActionListener für den Button "berechne"
        berechne.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                try {
                    // Hier erstelle ich die Variablen double_1 und double_2
                    // und gebe ihnen die Werte von den TextAreas
                    double double_1 = Double.parseDouble(schreib_1.getText());
                    double double_2 = Double.parseDouble(schreib_2.getText());

                    double result = double_1 * double_2;// ---> Hier rechnen wir die Werte aus.

                    /*
                     * ich muss String.valueOf(result) benutzen,
                     * weil ich nicht direkt double in Label schreiben kann.
                     */
                    label.setText(String.valueOf(result));// ---> Hier geben wir das Ergebnis aus in Label.
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(350, 100); // ---> Hier setze ich die Größe des Fensters.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ---> Hier schließe ich das Fenster.
        setVisible(true);// ---> Hier mache ich JFrame sichtbar.
    }

    public static void main(String[] args) {

        // ---> Hier rufe ich die Methode Umrechnung() auf.
        new Umrechnung();

        //String name = "mm";
        //name.charAt();
       // StringBuilder       !!! noch schau mal!!
        
    }



}
