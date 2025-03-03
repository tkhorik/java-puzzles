package dialogs;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Dialog<Integer> integerDialog = new IntegerDialog("Enter a number between 1 and 10", "Invalid input. Please enter a number between 1 and 10", 1, 10);
        Integer input = integerDialog.input();
        System.out.println(input);

        String[] keys = {"да", "нет"};
        Dialog<String> stringSelectDialog = new StringSelectDialog("Выберите один из вариантов" + showVariants(keys),
                "Неверный ввод. Пожалуйста, выберите один из вариантов" + showVariants(keys), keys);
        String input2 = stringSelectDialog.input();
        System.out.println(input2);

        Dialog<Character> characterDialog = new CharacterDialog("Enter a character", "Invalid input. Please enter a single character");
        Character input3 = characterDialog.input();
        System.out.println(input3);
        Dialog<Character> russianLetterDialog = new RussianLetterDialog("Enter a character", "Invalid input. Please enter a single character");
        Character input4 = russianLetterDialog.input();
        System.out.println(input4);
    }

    static String showVariants(String[] keys) {
        try {
            return Arrays.toString(keys);
        } catch (Exception e) {
            System.err.println("An error occurred while processing the input: " + e.getMessage());
            LOGGER.log(Level.SEVERE, "An error occurred while processing the input", e);
        }
        return null;
    }
}