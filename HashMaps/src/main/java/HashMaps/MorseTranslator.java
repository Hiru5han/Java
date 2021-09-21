package HashMaps;

import java.util.HashMap;

public class MorseTranslator {
	static HashMap<String, String> morseCode = new HashMap<>();

	public void dict() {

		morseCode.put("a", ".-");
		morseCode.put("b", "-...");
		morseCode.put("c", "-.-.");
		morseCode.put("d", "-..");
		morseCode.put("e", ".");
		morseCode.put("f", "..-.");
		morseCode.put("g", "--.");
		morseCode.put("h", "....");
		morseCode.put("i", "..");
		morseCode.put("j", ".---");
		morseCode.put("k", "-.-");
		morseCode.put("l", ".-..");
		morseCode.put("m", "--");
		morseCode.put("n", "-.");
		morseCode.put("o", "---");
		morseCode.put("p", ".--.");
		morseCode.put("q", "--.-");
		morseCode.put("r", ".-.");
		morseCode.put("s", "...");
		morseCode.put("t", "-");
		morseCode.put("u", "..-");
		morseCode.put("v", "...-");
		morseCode.put("w", ".--");
		morseCode.put("x", "-..-");
		morseCode.put("y", "-.--");
		morseCode.put("z", "--..");
		
	}

	public void translate(String string) {
		
		System.out.println(morseCode.get("a"));
	}
}
