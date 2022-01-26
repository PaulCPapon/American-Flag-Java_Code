/* Name: Papon Chandra Paul.
Student Id: 21448105.
Module: Programming.
Task: 1
Title: American Flag.*/
package AmericanFlag;

public class Main {

    public static void main(String[] args) {
        //A String datatype variable for first part of flag, One line with six stars and equals and another line with 5 stars and equals.
        String StarStripesLine_Flag = "* * * * * * ==================================\n * * * * *  ==================================";
        //Another String variable for last part of flag, using only equals symbols.
        String StripesLine_Flag = "==============================================";
        //First for loop to store and print first part of flag.
        for (int i = 0; i < 4; i++) {
            System.out.println(StarStripesLine_Flag);
        }
        //To print 9th line of the flag.
        System.out.println("* * * * * * ==================================");
        //Second for loop to store and print last part of flag.
        for (int i = 0; i < 6; i++) {
            System.out.println(StripesLine_Flag);
        }
    }
}
