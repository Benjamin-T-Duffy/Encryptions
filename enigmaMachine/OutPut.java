package enigmaMachine;

import java.util.ArrayList;

public class OutPut {

	public String print(ArrayList<Character> output) {
		String str = "";
		for(int i = 0; i < output.size(); i++) {
			str += output.get(i);
		}
		return str;
	}
}
