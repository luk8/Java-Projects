import java.util.*;

class MsgBox
 {
    public static void main ( String [] args )
   {
       Scanner in = new Scanner( System.in );
 
       System.out.print( "Enter your Message: " );
 
       if ( ! in.hasNextLine() )
          return;  // All done on EOF, so just exit.
 
       String message = in.nextLine();
 
       int msgLength = message.length();
 
       // Draw the top of the box:
       System.out.print( "\t+" );
       for ( int i = 0; i < msgLength; ++i )
          System.out.print( "-" );
       System.out.println( "+" );
 
       // Print the message:
       System.out.println( "\t|" + message + "|" );
 
       // Draw the bottom of the box:
       System.out.print( "\t+" );
       for ( int i = 0; i < msgLength; ++i )
          System.out.print( "-" );
       System.out.println( "+" );
    }
 }
 

