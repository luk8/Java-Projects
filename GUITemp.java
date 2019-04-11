// A stand-alone GUI Java Program to display a Celsius to Fahrenheit Conversion Table.
// Also included code to close the application when the user
// clicks the mouse in the close box.

// Written by Wayne Pollock, Tampa, FL USA, 1999
// Modified by Luksonne Zetrenne, Tampa, FL USA, 2018

// Packages to be imported for program

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Messages to be called and info used to calculate temperature

public class GUITemp extends Frame {

    private static String message = "Farhenheit";
    private static String message1 = "Celsius";
    public static String message2;
    public static String message3;
    public static String message4 = "C to F Conversion Table";
    public static String message5 = "**A Firmwire LLC Product**";
    public static String message6 = "Freezing Point";
    public static String message7 = "Boiling Point";
    public static final int celsiusConversion = 32;
    public static final double ratioC = 5.0 / 9.0;
    private static Math math;
    public static int tempF = 0;
    public static int tempC = -17;
    public static int step = 10;

    // Display conversion table with exit function

    public GUITemp(){

        setTitle("C/F conversion table");
        setSize(400, 600);
        setBackground(Color.yellow);
        setVisible(true);

        addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
                );
    }

    public static void main(String[] args){

        GUITemp temperature = new GUITemp();


    }

    // Graphics for text and design layout

    public void paint (Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(new Font("COMIC SANS", Font.CENTER_BASELINE, 14));
        g.drawString(message4, 95, 50);
        g.drawString(message, 35, 85);
        g.drawString(message1, 245, 85);
        g.drawString(message5, 75, 550);
        g.setColor(Color.BLUE);
        g.drawString(message6, 25, 520);
        g.setColor(Color.RED);
        g.drawString(message7, 230, 520);
        int y = 110;

        while(tempF <= 250) {
            message2 = Integer.toString(tempF);
            message3 = Integer.toString(tempC);

            tempC = (int) Math.round(ratioC * (tempF - celsiusConversion));
            tempF = tempF + step;

            if (tempF <= 40) {
                g.setColor(Color.BLUE);
            }

            else if (tempF <= 220) {
                g.setColor(Color.BLACK);
            }

            else {
                g.setColor(Color.RED);
            }

            g.drawString(message2, 50, y);
            g.drawString(message3, 250, y);
            y += 15;

        }

    }

}
