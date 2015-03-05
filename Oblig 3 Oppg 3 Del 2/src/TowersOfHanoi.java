/*Et eksempel på hvor enkelt et komplisert problem kan løses
 * ved rekursjon. I dette tilfellet; Tower of Hanoi. */

import java.util.Scanner;

public class TowersOfHanoi {
	static int a = 0;
	static int b = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tast inn antall disker: ");
		int n = input.nextInt();
		input.close();
		
		System.out.println("Trekkene er:");
		moveDisks(n, 'A', 'B', 'C');
		
		/*Litt merkelig å skulle måte lage to separate tellere,
		 * da en disk flyttes ved hvert kall uansett. */
		System.out.println("Antall trekk: " + a);
		System.out.println("Antall kall til moveDisks: " + b);
	}
	
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		b++;
		if(n == 1) {
			a++;
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
		} else {
			a++;
			moveDisks(n-1, fromTower, auxTower, toTower);
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}

}
