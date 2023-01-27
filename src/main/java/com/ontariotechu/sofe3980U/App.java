package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		Binary binary1=new Binary("00010001000");//136
		Binary binary2=new Binary("111000");//56

		System.out.println("----------------------------------------------\n");
		System.out.println("BINARY CALCULATOR");
		System.out.println("The current local time is: " + currentTime);
		System.out.println("\n----------------------------------------------\n");

        System.out.println( "First binary number is: "+binary1.getValue());
        System.out.println( "Second binary number is: "+binary2.getValue());

		System.out.println("\n***********************************************\n");
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Sum Result "+sum.getValue());

		Binary orCheck= Binary.or(binary1,binary2);
		System.out.println( "OR Result "+orCheck.getValue());

		Binary andCheck= Binary.and(binary1,binary2);
		System.out.println( "AND Result "+andCheck.getValue());

		Binary multCheck= Binary.multiply(binary1,binary2);
		System.out.println( "Multiplication Result "+multCheck.getValue());
		System.out.println("\n***********************************************");
    }
}