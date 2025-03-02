package dialogs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Dialog<Integer> integerDialog = new IntegerDialog("Enter a number between 1 and 10", "Invalid input. Please enter a number between 1 and 10", 1, 10);
//        integerDialog.input();
        String[] keys = {"да", "нет"};
        Dialog<String> stringSelectDialog = new StringSelectDoalog("Выберите один из вариантов" + showVariants(keys),
                "Неверный ввод. Пожалуйста, выберите один из вариантов" + showVariants(keys), keys);
        String input = stringSelectDialog.input();

    }

    static String showVariants(String[] keys) {
        try {
            return Arrays.toString(keys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}