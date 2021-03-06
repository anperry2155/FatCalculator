package integration245;

//Anthony Perry
// Skills Activity
// Bmi calculator as well as other stuff i have learned in cop 2006

/* The 8 primitive data types are as follows:
 *Byte data type is an 8-bit signed two's complement integer. 
 * It has a minimum value of -128 and a maximum value of 127.
 * byte data type useful in large arrays
 * They can also be used in place of int.
 * 
 *Short: The short data type is a 16-bit signed two's complement integer. 
 * It has a minimum value of -32,768 and a maximum value of 32,767
 * use short to save memory in large arrays.
 * 
 *Int: data type is a 32-bit signed two's complement integer, 
 * minimum value of -2^31 and a maximum value of 2^31-1. 
 * 
 *Long data type is a 64-bit two's complement integer. 
 * The signed long has a minimum value of -2^63 and a maximum value of 2^63-1
 * Use when int is not large enough.
 * 
 *Float data type is a single-precision 32-bit IEEE 754 floating point.
 * use a float (instead of double) to save memory in large arrays.
 * 
 *Double data type is a double-precision 64-bit IEEE 754 floating point.
 * used for decimals.
 * 
 *Boolean data type has only two possible values: true and false.
 *
 *Char data type is a single 16-bit Unicode character. 0 - 65,535.
 */
/* Milestone 1 is complete. calcBmi(scanner)
   Milestone 2 is complete. calcBmi(input)
   Milestone 3 is complete. line63
   Milestone 4 is complete. use Random Class
   Milestoen 5 is complete. Use Math class Math.Pi print statement
   Milestone 6 is complete. create else if constructs
   Milestone 7 is comlete. create ternary constructs int max
   Milestone 8 is complete. use a switch statement (switch from lbs to kilos)
   Milestone 9 is complete. compare two string statements with compareTo and == and comment bologna and sausage
   Milestone 10 is complete. use +- / * ++ -- += used near lines 86
   Milestone 11 is complete. use relational operators used in several instances through code 
   Milestone 12 is complete. use conditional operators used in bmi categories and while loop
   Milestone 13 is complete. describe operator precedence as a comment around line 93.
   Milestone 14 is complete. create and use while loops. line 90
   Milestone 15 is complete. create and use for loops. Line 117
   Milestone 16 is complete. create and use do while loops. Line 103
   Milestone 17 is complete. use break in a loop with comment. Line 174
   Milestone 18 is complete. use continue in a loop with comment. Line 119
   Milestone 19 casting is complete. line 83
   Milestone 20 format strings using an escape sequence.
   I have done it. All things are here. 
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// M3 ^^^ args is the method header 
        //and everything between the curly brackets is the parameter.
		/*
		 * scope means that a variable is only accessible within the method it was
		 * defined. variables are containers for storig data values
		 */

//Creating the object of Scanner Class
		Scanner input = new Scanner(System.in);
//Greeting
		System.out.println("Hello Friend");
// call
		calcBmi(input);
	             //^^^^  M2. Identify a call method and arguments
       
        
//alright lets add more stuff here
        callStuff();
        {
        	System.out.println("Thanks for using my program");
    		System.out.println(Math.PI);
    		System.out.println("is my favorite number");

    		int line = 1;
    //casting for milestone requirements
    		double lineLine = line;
    //while loop used in class for milestone requirements
    		int n1 = 6;
    		int n2 = 12;

    		System.out.println("Firstnum:" + n1);
    		System.out.println("Secondnum:" + n2);

    		int max = (n1 > n2) ? n1 : n2;

    		System.out.println("Maximum is = " + max);
            System.out.println(n1 + n2 - n1 * n2 / n1 --);
            System.out.println(n1 != n2);
            while (lineLine++ < 5 || lineLine >6 ) {
    			System.out.println(lineLine);
        }
            int z = 1;
            do{
            System.out.println(z);
            z++;
            }while (z<=10);
            
//M.12 operator precedence is parentheses first, and then multiply and divide
// left to right, and then add and subtract from left to right
		

		}
		String bologna = "Hello";
		String sausage = "Hello";
		String tExample = "\t";
		
//Using compareTo method 
		System.out.println("bologna.compareTo(sausage):" + bologna.compareTo(sausage));
		System.out.println("sausage.compareTo(bologna):" + sausage.compareTo(bologna));
		// This for escape sequence milestone 20
		System.out.println(tExample);
		
//== compares memory location
		System.out.println(sausage == bologna);
		System.out.println(bologna == sausage);
		// Milestone 4 use random class
		Random rand = new Random();
		int minRange = 99, maxRange = 299;
		int value = rand.nextInt(maxRange - minRange) + minRange;
		System.out.println(value);
		
		for(int i = 0; i <= 15; i ++) {
			if( i == 10 ||i == 12) {
				continue; 
			}
		}
		
	}
private static void callStuff() {
		// This method is to call other requirements
		
	}
public static void calcBmi(Scanner input) {
	                // ^^^ M1. Create a method with arguments and return values
	//lbs or kilos
			System.out.println("Enter your weight unit (kg or lbs): ");
 
			String unit = input.nextLine();

	// Now input weight
			System.out.println("Enter your Weight : ");

			double weight = input.nextDouble();

			double height = 0;

	//Checking which weight unit has been selected by user
			if (unit.equals("kg")) {

	//If unit is kg

				System.out.println("Enter your Height(In Meters) : ");

	//Taking height(in Meters) from user

				height = input.nextDouble();

			} else if (unit.equals("lbs")) {

				System.out.println("Enter your Height(In Inches) : ");
	//Taking height(in Inches) from user
				height = input.nextDouble();
	// I need to close scanner here.^^^
			}
	//Declaring a double type parameter
			double bmi = 0;
			/*
			 * Switch Cases on weight units because BMI Formula changes according to /* the
			 * Weight Units
			 */
			// M.8 use switch statement below this line
			switch (unit) {
	//If unit is kg
			case "kg":
	//caluclate the bmi with formula and store it in variable
				bmi = weight / (height * height);
	//print the BMI
				System.out.println("YOUR BMI IS : " + bmi + " kg/m2");
				// Milestone 17 use break in a loop using comment
				// break is used to stop a loop. in this case break stops the loop and it picks up at
				// the next statement which is case, and if that doesn't work it'll go to default.
				break;
			case "lbs":
	//caluclate the bmi with formula and store it in variable
				bmi = 703 * (weight / (height * height));
	//print the BMI
				System.out.println("YOUR BMI IS : " + bmi + " lbs/in2");
				break;
			default:
				System.out.println("Please choose correct weight unit");
			}

	// BMI CATEGORIES
			if (bmi < 15) {
				System.out.println("You are in 'Very severely underweight' Category");

			} else if (bmi >= 15 && bmi < 16) {
				System.out.println("You are in 'Severely underweight' Category");

			} else if (bmi >= 16 && bmi < 18.5) {
				System.out.println("You are in 'Underweight' Category");

			} else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("You are in 'Normal (healthy weight)' Category");

			} else if (bmi >= 25 && bmi < 30) {
				System.out.println("You are in 'Overweight' Category");

			} else if (bmi >= 30 && bmi < 35) {
				System.out.println("You are in 'Moderately obese' Category");

			} else if (bmi >= 35 && bmi < 40) {
				System.out.println("You are in 'Severely obese' Category");

			} else { //(bmi > 40) {
				System.out.println("You are in 'Very severely obese' Category");

			} 
			
				
			
}
}

