package enigmaMachine;

public class Encrypt {
	Rotors rotors = new Rotors();

	public char setter(char input, int r1, int r2, int r3) {
		char Char = Character.toLowerCase(input);
		int pos1;
		int pos2;
		int pos3;
		boolean complete = false;
		rotors.rotor();
		for (int i = 0; i < 26; i++) {
			if (complete) {
				break;
			}
			if (Char == rotors.getStandard(i)) {
				Char = rotors.getR1(i);
				for (int l = 0; l < 26; l++) {
					if (Char == rotors.getStandard(l)) {
						pos1 = (l + r1)%26;
						Char = rotors.getR1(pos1);
						break;
					}
				}
				for (int j = 0; j < 26; j++) {
					if (complete) {
						break;
					}
					if (Char == rotors.getStandard(j)) {
						Char = rotors.getR2(j);
						for (int m = 0; m < 26; m++) {
							if (Char == rotors.getStandard(m)) {
								pos2 = (m + r2)%26;
								Char = rotors.getR2(pos2);
								break;
							}
						}
						for (int k = 0; k < 26; k++) {
							if (Char == rotors.getStandard(k)) {
								Char = rotors.getR3(k);
								for (int n = 0; n < 26; n++) {
									if (Char == rotors.getStandard(n)) {
										pos3 = (n + r3)%26;
										Char = rotors.getR3(pos3);
										break;
									}
								}
								complete = true;
								break;
							}
						}
					}
				}
			}
		}
		return Char;
	}
}
