// A stand-alone GUI Java Program to display a logo.
// Also included code to close the application when the user
// clicks the mouse in the close box.

import java.awt.*;
import java.awt.event.*;

// Messages to be called

public class GUILogo extends Frame
{
    private String message = "Avenue One Capital";
    private String message1 = "Capital for your FUTURE!";
    private String message2 = "- - - - - - - - - - - - - - - - -";

    // Display logo title

    public GUILogo ()
    {
        setTitle("Ave 1 Capital Logo");
        setSize(300,200);
        setVisible(true);

        // Close window with mouse-click

        addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );
    }

    public static void main(String [] args )
    {
        GUILogo me = new GUILogo();
    }

    // Graphics for text and design layout

    public void paint (Graphics g)
    {
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect( 30, 40, 240, 130 );
        g.fillRect(30, 40, 240, 130);
        g.setColor(Color.BLACK);
        g.setFont(new Font(message, Font.BOLD, 20));
        g.drawString(message, 55, 80);
        g.setColor(Color.BLACK);
        g.setFont(new Font(message1, Font.BOLD, 14));
        g.drawString(message1, 70, 140);
        g.drawRect(30, 85, 240, 40);
        g.fillRect(30,85,240,40);
        g.setColor(Color.YELLOW);
        g.setFont(new Font(message2, Font.BOLD, 14));
        g.drawString(message2, 35, 108);
    }

}
