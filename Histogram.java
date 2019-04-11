// A non-GUI stand alone application which will create histogram
// tallying each input by the user.


import utils.TextKit;
import java.util.*;


public class Histogram {

public static final int MAX_NUM = 25;

public static void main (String [] args){

    
// User enters number
Scanner input = new Scanner(System.in);

int [] num = new int [MAX_NUM + 1]; // Using 1..MAX_NUM

    
// Read numbers entered by user
System.out.println("Enter your numbers between 1-25, one per line [ctrl + d to quit]: " );
    
while (input.hasNextInt()){
    
    int stars = input.nextInt();
    
    if (stars < 1 && stars > 25) {// Check user entry is between 1 - 25
        
        throw new ArrayIndexOutOfBoundsException("Invalid entry, please enter a number between 1 - 25");
    }
    
    num[stars]++;
    
} // End while loop

    
// Count and stores the number of "*" for each number entered between 1 -25
for (int count = 1; count < num.length; count++){
        
    System.out.println(TextKit.pad(count, 2) + ": " + TextKit.lineOfStars(num[count]));
    
}

}
}