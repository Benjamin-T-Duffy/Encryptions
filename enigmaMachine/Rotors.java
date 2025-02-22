package enigmaMachine;

import java.util.ArrayList;

public class Rotors {
	ArrayList<Character> rotor1 = new ArrayList<>();
	ArrayList<Character> rotor2 = new ArrayList<>();
	ArrayList<Character> rotor3 = new ArrayList<>();
	ArrayList<Character> standard = new ArrayList<>();
	public void rotor() {
		

		rotor1.add('p');
		rotor1.add('x');
		rotor1.add('t');
		rotor1.add('z');
		rotor1.add('s');
		rotor1.add('n');
		rotor1.add('r');
		rotor1.add('o');
		rotor1.add('u');
		rotor1.add('q');
		rotor1.add('w');
		rotor1.add('y');
		rotor1.add('v');
		rotor1.add('f');
		rotor1.add('h');
		rotor1.add('a');
		rotor1.add('j');
		rotor1.add('g');
		rotor1.add('e');
		rotor1.add('c');
		rotor1.add('i');
		rotor1.add('m');
		rotor1.add('k');
		rotor1.add('b');
		rotor1.add('l');
		rotor1.add('d');
	
		rotor2.add('t');
		rotor2.add('q');
		rotor2.add('y');
		rotor2.add('p');
		rotor2.add('s');
		rotor2.add('w');
		rotor2.add('n');
		rotor2.add('r');
		rotor2.add('z');
		rotor2.add('v');
		rotor2.add('x');
		rotor2.add('o');
		rotor2.add('u');
		rotor2.add('g');
		rotor2.add('l');
		rotor2.add('d');
		rotor2.add('b');
		rotor2.add('h');
		rotor2.add('e');
		rotor2.add('a');
		rotor2.add('m');
		rotor2.add('j');
		rotor2.add('f');
		rotor2.add('k');
		rotor2.add('c');
		rotor2.add('i');
		
		rotor3.add('r');
		rotor3.add('y');
		rotor3.add('n');
		rotor3.add('s');
		rotor3.add('o');
		rotor3.add('v');
		rotor3.add('q');
		rotor3.add('u');
		rotor3.add('p');
		rotor3.add('z');
		rotor3.add('x');
		rotor3.add('w');
		rotor3.add('t');
		rotor3.add('c');
		rotor3.add('e');
		rotor3.add('i');
		rotor3.add('g');
		rotor3.add('a');
		rotor3.add('d');
		rotor3.add('m');
		rotor3.add('h');
		rotor3.add('f');
		rotor3.add('l');
		rotor3.add('k');
		rotor3.add('b');
		rotor3.add('j');
		
		standard.add('a');
		standard.add('b');
		standard.add('c');
		standard.add('d');
		standard.add('e');
		standard.add('f');
		standard.add('g');
		standard.add('h');
		standard.add('i');
		standard.add('j');
		standard.add('k');
		standard.add('l');
		standard.add('m');
		standard.add('n');
		standard.add('o');
		standard.add('p');
		standard.add('q');
		standard.add('r');
		standard.add('s');
		standard.add('t');
		standard.add('u');
		standard.add('v');
		standard.add('w');
		standard.add('x');
		standard.add('y');
		standard.add('z');
	}
	
	public char getR1(int position) {
		char output = rotor1.get((position));
		return output;
	}
	public char getR2(int position) {
		char output = rotor2.get((position));
		return output;
	}
	public char getR3(int position) {
		char output = rotor3.get((position));
		return output;
	}
	public char getStandard(int position) {
		char output = standard.get(position);
		return output;
	}

	

}