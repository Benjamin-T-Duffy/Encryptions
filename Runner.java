package enigmaMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> output = new ArrayList<>();
		Encrypt crypt = new Encrypt();
		Decrypt dcrypt = new Decrypt();
		OutPut out = new OutPut();

		System.out.println("If you are encrypting a Message, type (E), if your decrypting a Message, type (D)");
		String func = (scanner.next());
				
		// asks the user to put in the given rotor numbers
		System.out.println("Please input your rotors numbers:");
		int r1 = scanner.nextInt();
		int r2 = scanner.nextInt();
		int r3 = scanner.nextInt();

		System.out.println("Input your string");
		String input = scanner.next() + scanner.nextLine();

		for (int i = 0; i < input.length(); i++) {
			if (r1 == 26) {
				r2++;
				r1 = 0;
				if (r2 == 26) {
					r3++;
					r2 = 0;
					if (r3 == 26) {
						r3 = 0;
					}
				}
			}
			if (func.charAt(0) == 'e' || func.charAt(0) == 'e') {
				output.add(crypt.setter(input.charAt(i), r1, r2, r3));
				r1++;
			} else if (func.charAt(0) == 'd' || func.charAt(0) == 'd') {
				output.add(dcrypt.setter(input.charAt(i), r1, r2, r3));
				r1++;
			}
		}
		System.out.println(out.print(output));
		scanner.close();
	}
}
