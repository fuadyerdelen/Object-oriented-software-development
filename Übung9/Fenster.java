import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Übung6.Gladiator;

public class Fenster extends JFrame {

    // Hier erstelle ich die Variablen
    private float _geld = 100;  
    private Gladiator _gladGewettet;
    private float _einsatz;

    public FensterGUI(){

        // Hier erstelle ich die label mit dem Namen "Geldbetrag"
        JLabel label = new JLabel("Geldbetrag: " + _geld + " Sesterzen");
        add(label, BorderLayout.NORTH);

        // Hier erstelle ich TextAreas mit dem Namen "Kampfbericht"
        JTextArea _txtKampfBericht= new JTextArea("Kampfbericht");
        add(_txtKampfBericht, BorderLayout.CENTER);

        // Hier erstelle ich ComboBox
        JComboBox _choGladiator= new JComboBox();
        add(_choGladiator, BorderLayout.WEST);
        
        // Hier erstelle ich TextAreas mit der Wert 0
        JTextArea text = new JTextArea(0);
        add(text, BorderLayout.EAST);


        // Hier erstelle ich die Button mit dem Namen "Starte Kampf"
        JButton startBtn = new JButton("Starte Kampf");
        add(startBtn, BorderLayout.SOUTH);
        // Hier erstelle ich die ActionListener für den Button "Starte Kampf"
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hier rufe ich die Methode starteKampfRunde auf
                starteKampfRunde(_gladGewettet, _gladGewettet);
            }
        });

        setSize(600, 300); // ---> Hier setze ich die Größe des Fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ---> Hier schließe ich das Fenster.
        setVisible(true);// ---> Hier mache ich JFrame sichtbar.
    }

    public static void main(String[] args) {
        new GladiatorenGUI();
    }

}
