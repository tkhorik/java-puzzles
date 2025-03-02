package dialogs;

import java.util.Scanner;

public class IntegerDialog implements Dialog<Integer> {

    private final String title;
    private final String errorMessage;
    private final int min;
    private final int max;

    public IntegerDialog(String title, String errorMessage, int min, int max) {
        this.title = title;
        this.errorMessage = errorMessage;
        this.min = min;
        this.max = max;
    }

    @Override
    public String input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(title);
            try {
                int result = Integer.parseInt(scanner.nextLine());
                if (result < min || result > max) {
                    System.out.println(errorMessage);
                } else {
                    return null;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
}