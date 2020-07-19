import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		
		System.out.println("Programming Fundamentals");
		System.out.println("Summer 2020");
		System.out.println("Name: Rachel Papiernik");
		System.out.println("PROGRAMMING ASSIGNMENT 1 \n");

		System.out.println ("Welcome to the cipher program.");
		int[] number = new int[5];
		int plainText = 0, key, digit, encode = 0, multiplie = 0;

		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		//prompt user to enter numbers for cipher
		System.out.println("Please enter 5 Numbers in range 0-19: ");
	
		for (int i = 0; i < 5; i++) {
			number[i] = input.nextInt();

			//if user enters a number greater than 19 and less than 0, this prompt will appear
			if (number[i] < 0 || number[i] > 19) {
				System.out.println("Please read directions and try again! ");
				System.exit(0);
			}
			plainText = plainText + number[i];
		}
			
		key = 0 + rand.nextInt((9 - 0) + 1);
	
		//key that was used to create the encoded message
		System.out.println("Plain Text is: " + plainText);
		System.out.println("Key is: " + key);

		
		while (plainText != 0) {
			digit = (plainText % 10);
			multiplie = 10 * multiplie + (digit + key);
			plainText = plainText / 10;

		}

		while (multiplie != 0) {
			digit = (multiplie % 10);
			encode = 10 * encode + (digit);
			multiplie = multiplie / 10;
		}
		//print out encoded message
		System.out.println("Encoded Message: : " + encode);

	}

}
