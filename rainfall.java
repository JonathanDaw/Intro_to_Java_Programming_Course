/*
Write a RainFall class that has the following field:

• an array of doubles that stores the rainfall for each of the 12 months of
the year (where the first index corresponds with January, the second with
February, etc.)

The class should also have the following methods:

• a method that returns the total rainfall for the entire year
• a method that returns the average monthly rainfall for the year
• a method that returns the month with the most rain as a string
• a method that returns the month with the least rain as a string

Demonstrate the class in a program that takes 12 doubles from the user (take the
doubles in the order of the months of the year, the first corresponding to the
rainfall in January, etc.). Do input validation: if the user inputs a negative
number, ignore it and continue asking them for input until you have 12
nonnegative doubles.

Once the user has given you all 12 doubles, create an instance of the RainFall
class and call its methods, printing out the total rainfall, the average
monthly rainfall, the month with the most rain, and the month with the least
rain, each on a separate line.
*/

import java.util.Scanner;
public class RainFall {
	
	private double[] yearlyRain;
	
	String[] months = {"January", "February", "March", "April", "May",
					   "June", "July", "August", "September", "October",
					   "November", "December"};
	
	public RainFall(double[] arr) {
		yearlyRain = arr;	
	}
	
	public double getTotalRainFall() {
		double total = 0.0;
		
		for (int i = 0; i < yearlyRain.length; i++) {
			total += yearlyRain[i];
		}
		return total;
	}
	
	public double getAverageRainFall() {
		double total = 0;
		
		for (int i = 0; i < yearlyRain.length; i++) {
			total += yearlyRain[i];	
		}
		return total / 12.0;
	}
	
	public String getMostRainFall() {
		int max = 0;
		for (int i = 0; i < yearlyRain.length - 1; i++) {
			if (yearlyRain[i] > yearlyRain[max])
				max = i;
		}
		
		return months[max];
	}
	
	public String getLeastRainFall() {
		int min = 0;
		for (int i = 0; i < yearlyRain.length - 1; i++) {
			if (yearlyRain[i] < yearlyRain[min])
				min = i;
		}
		
		return months[min];
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int monthNumber = 0;
		double[] rainfallInput = new double[12];
		String nextDoubleString;
		double input;
		
		while (monthNumber < 12) {
			do {
				System.out.print("Enter rainfall for month " + (monthNumber + 1) + ":");
				nextDoubleString = keyboard.nextLine();
				input = Double.parseDouble(nextDoubleString);
				
			}
			while (input < 0);
			rainfallInput[monthNumber] = input;
			monthNumber++;
		}
		
		RainFall rain = new RainFall(rainfallInput);
		System.out.println(rain.getTotalRainFall());
		System.out.println(rain.getAverageRainFall());
		System.out.println(rain.getMostRainFall());
		System.out.println(rain.getLeastRainFall());
	}
}
