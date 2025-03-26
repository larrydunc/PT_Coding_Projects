
public class Week4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize array of int called ages
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				
				// stored the difference of the last element in the array and the first in the variable result
				int result = ages[ages.length - 1] - ages[0];
				
				//printed the result
				System.out.println("1a: " + result);
				
				//listed these out to show alternate way to add elements to array
				int[] ages2 = new int[9];
				ages2[0] = ages[0];
				ages2[1] = ages[1];
				ages2[2] = ages[2];
				ages2[3] = ages[3];
				ages2[4] = ages[4];
				ages2[5] = ages[5];
				ages2[6] = ages[6];
				ages2[7] = ages[7];
				ages2[8] = result;
				
				//copied the code from above and adjusted variable to variable to result2 and array referenced to ages2
				int result2 = ages2[ages2.length - 1] - ages2[0];
				
				System.out.println("1b: " + result2);
				
				//created an integer sum to hold the total of all the ages in array ages2
				int sum = 0;
				
				//used for loop to cycle through array and add each element together and store it in sum
				for (int i : ages2) {
					sum += i;
				}
				
				//divided sum by the number of elements in ages2 and store it in integer avg
				int avg = sum / ages2.length;
				
				System.out.println("1c: " + avg);
				
				//Programmatically, this was similar to above. I created an int numLetters to hold the total of all word lengths
				int numLetters = 0;
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				//I used a loop to add the number of characters in each word together by utilizing the .length() method and storing it in int numLetters
				for(String name : names) {
					numLetters += name.length();
					
				}
				// divided the value in numLetters by the number of elements in the array and store the result in avgLetters
				int avgLetters = numLetters / names.length;
				System.out.println("2a: " + avgLetters);
				
				// created a String allNames to hold the  strings 
				String allNames = "";
				
				//used a loop to cycle through each element in the array and concatenate them with a space
				for(String name : names) {
					allNames += name + " ";
					
				}
				System.out.println("2b: " + allNames);
				
				System.out.println("3: The last element in an array can be access by setting the index to the length of the array - 1. This is because the indexing of arrays begins at 0. arrayName[arrayName.length - 1]");
				System.out.println("4: The first element of any array is lcated at index 0. arrayName[0];");
				
				
				int[] nameLengths = new int[names.length];
				//created a loop that populated each element in array nameLengths with the length of each element in the Array names using the .length() String method
				for(int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
				} 
				// Create an int nameLengthSum to hold the total 
				int nameLengthSum = 0;
				
				// then looped through adding each element together in nameLengthSum
				for (int nameLength : nameLengths) {
					nameLengthSum += nameLength;
				}
				System.out.println("5 & 6: " + nameLengthSum);
				
				
				System.out.println("7: " + concatenate("helllo", 5));
				
				System.out.println("8: " + fullName("Larry", "Duncan"));
				
				System.out.println("9: " + isGreaterThan(ages));
				
				double[] costs = {380.53, 999.99, 230.58, 640.52, 2865.33, 8000.76, 28.73, 93.12};
				
				System.out.println("10: " + average(costs));
				
				double[] payroll = {254.69, 330.99, 350.66, 840.52, 865.33, 800.76, 850.99, 930.28};
				
				System.out.println("11: " + firstHigher(costs, payroll));
				
				boolean hot = true;
				double money = 9.99;
				
				System.out.println("12: " + willBuyDrink(hot, money));
				
				/*I created a method that takes in a first array of double and a second array of double. 
				 * It subtracts the sum of the first array from the sum of the second and if it is over 100, 
				 * it returns a positive message. If is not greater than 100 but still equal to or greater than 0, 
				 * it returns a neutral message. If the result is less than zero it returns a negative message. 
				 * It is suppose to be a simple review of costs verses income.
				*/
				double[] invoices = {380.53, 999.99, 230.58, 640.52, 2865.33, 8000.76, 28.73, 93.12};
				double[] income = {2540.69, 3300.99, 3500.66, 840.52, 865.33, 800.76, 850.99, 930.28};
				
				System.out.println("13: " + monthlyBudgetStatus(invoices, income));
				
				
				
				
				
				
				

			}
			//Method 7: 
			public static String concatenate(String word, int n) {
				String result = "";
				for (int i = 0; i < n; i++) {
					result += word;
				}
				return result;
			}
			
			//Method 8: 
			public static String fullName(String firstName, String lastName) {
				String fullName = firstName + " " + lastName;
				return fullName;
			}
			
			//Method 9: 
			public static boolean isGreaterThan(int[] ints) {
				int sum = 0;
				for (int i : ints) {
					sum += i;
				} if (sum > 100) {
					return true;
				} else {
					return false;
				}
			}
			//Method 10
			public static double average(double[] doubles) {
				double sum = 0;
				for (double i : doubles) {
					sum += i;
				} 
				double avg = sum / doubles.length;
				return avg;
			}
			
			//Method 11
			public static boolean firstHigher (double[] doubles1, double[] doubles2) {
				double sum1 = 0;
				double sum2 = 0;
				for (double i : doubles1) {
					sum1 += i;
				}
				for (double i : doubles2) {
					sum2 += i;
				} 
				double avg1 = sum1 / doubles1.length;
				double avg2 = sum2 / doubles2.length;
				if (avg1 > avg2) {
					return true;
				} else {
					return false;
				}
				
			}
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(isHotOutside == true && moneyInPocket > 10.50) {
					return true;
				} else {
					return false;
				}
			}
			public static String monthlyBudgetStatus(double[] invoices, double[] income) {
				double invoicesSum = 0;
				double incomeSum = 0;
				String positive = "Great job, everybody!";
				String neutral 	= "Things are going okay.";
				String negative = "We are in trouble!";
				for (double i : invoices) {
					invoicesSum += i;
				}
				for (double i : income) {
					incomeSum += i;
					
				}
				double budget = incomeSum - invoicesSum;
				if (budget > 100) {
					return positive;
					
				} else if (budget >= 0) {
					return neutral;
				}else {
					return negative;
				}
			}
			
		}
