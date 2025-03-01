package com.mypuzzles;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberDecoder {
    // Map to hold the mapping from letters to digits
    private static final Map<Character, Character> phoneMapping = new HashMap<>();
    static {
        // Define mapping based on telephone keypad
        phoneMapping.put('A', '2'); phoneMapping.put('B', '2'); phoneMapping.put('C', '2');
        phoneMapping.put('D', '3'); phoneMapping.put('E', '3'); phoneMapping.put('F', '3');
        phoneMapping.put('G', '4'); phoneMapping.put('H', '4'); phoneMapping.put('I', '4');
        phoneMapping.put('J', '5'); phoneMapping.put('K', '5'); phoneMapping.put('L', '5');
        phoneMapping.put('M', '6'); phoneMapping.put('N', '6'); phoneMapping.put('O', '6');
        phoneMapping.put('P', '7'); phoneMapping.put('Q', '7'); phoneMapping.put('R', '7'); phoneMapping.put('S', '7');
        phoneMapping.put('T', '8'); phoneMapping.put('U', '8'); phoneMapping.put('V', '8');
        phoneMapping.put('W', '9'); phoneMapping.put('X', '9'); phoneMapping.put('Y', '9'); phoneMapping.put('Z', '9');
    }

    // Method to decode an alphanumeric phone number to its numeric equivalent
    public static String decode(String alphanumeric) {
        StringBuilder sb = new StringBuilder();
        // Process each character; map letters to digits while copying digits and punctuation directly
        for (char ch : alphanumeric.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(phoneMapping.get(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "1-800-FLOWERS";
        System.out.println("Decoded phone number: " + decode(input));
    }
}
