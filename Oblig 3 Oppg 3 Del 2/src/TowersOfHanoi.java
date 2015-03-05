import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tast inn antall disker: ");
		int n = input.nextInt();
		input.close();
		
		System.out.println("Trekkene er:");
		moveDisks(n, 'A', 'B', 'C');
	}
	
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		
		if(n == 1) {
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
		} else {
			moveDisks(n-1, fromTower, auxTower, toTower);
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}

}
