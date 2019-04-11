import java.util.Scanner;

class Average
 {
    private static final int MAX_NUM_OF_VALUES = 25;
 
    public static void main ( String [] args )
    {
       Scanner in = new Scanner( System.in );
       int[] vals = new int[MAX_NUM_OF_VALUES];
       int runningTotal = 0, numOfVals = 0;
 
       // Read and store values, while counting and summing them:
       System.out.println( "Enter integers, one per line (^Z to stop): " );
       while ( in.hasNextLine() )
       {
          vals[numOfVals] = Integer.parseInt( in.nextLine() );
          runningTotal += vals[numOfVals];
          ++numOfVals;
       }
 
       // Compute the average:
       if ( numOfVals == 0 )
          System.exit( 0 );
       double average = (double) runningTotal / numOfVals;
 
       // Display list of values greater than the average:
       System.out.println( "\nValues greater than " + average + ":\n" );
       for ( int i = 0; i < numOfVals; ++i )
      {
          if ( vals[i] > average )
             System.out.println( "\t" + vals[i] );
       }
    }
 } // End of class Average