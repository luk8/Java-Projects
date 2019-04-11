// This non-GUI stand alone application will serve as a test driver for the TextKit
// package
//
//Written by Luksonne Zetrenne, Tampa, FL USA, 2018

public class TextKitApp {

    /* Main is used to test the methods found in the TextKit package */

    public static void main (String[] args){

        System.out.println(utils.TextKit.lineOfStars(12));

        int num = 20;
        System.out.println("*" + utils.TextKit.pad(num, 5) + "*");

    }
}