/*
 * File: Grill.java
 * Author: Eric Haynes
 * Date: Feb 06, 2020
 * Purpose: This program demonstrates custom class use
 */
// Import statements
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Grill {
    public static void main(String[] args) throws IOException {

        int wellnessInt;
        int r;
        int mR;
        int m;
        int mW;
        int w;
        double rT;
        double mRT;
        double mT;
        double mWT;
        double wT;

        // Default constructor
        r = 125;
        rT = 2.5;
        mR = 132;
        mRT = 3.5;
        m = 140;
        mT = 4.5;
        mW = 150;
        mWT = 5.5;
        w = 160;
        wT = 6.5;

        // Define a InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in);
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin = new BufferedReader(isReader);

        // Print Welcome Text
        System.out.println("Welcome to How to Grill the Perfect Steak\n");

        // Print Disclaimer
        System.out.println("***All Times are in minutes, and based on a 400 Degree Temp***\n");

        // Prompt User on Steak Wellness Preference
        System.out.println("How Do You Like Your Steak Cooked?");

        // Prompt user options for Steak Wellness
        System.out.println("Rare = 1, MedRare = 2, Med = 3, MedWell = 4, Well = 5\n");

        // The readLine() method reads everything entered.
        // The Integer.parseInt() method converts
        // the value to an int
        wellnessInt = Integer.parseInt(stdin.readLine());

        //if (!wellnessInt) { // Place holder for logic error

        if (wellnessInt == 1) {
            System.out.println("Your Steak should be cooked to an internal temp of: " + r + " degrees");
            System.out.println("Cook for " + rT + " minutes on each side");
        } else if (wellnessInt == 2) {
            System.out.println("Your Steak should be cooked to an internal temp of: " + mR + " degrees");
            System.out.println("Cook for " + mRT + " minutes on each side");
        } else if (wellnessInt == 3) {
            System.out.println("Your Steak should be cooked to an internal temp of: " + m + " degrees");
            System.out.println("Cook for " + mT + " minutes on each side");
        } else if (wellnessInt == 4) {
            System.out.println("Your Steak should be cooked to an internal temp of: " + mW + " degrees");
            System.out.println("Cook steak for " + mWT + " minutes on each side");
        } else if (wellnessInt == 5) {
            System.out.println("Your Steak should be cooked to an internal temp of: " + w + " degrees");
            System.out.println("Cook for " + wT + " minutes on each side");
        }
        System.out.println("Enjoy your Steak!");
    }

}