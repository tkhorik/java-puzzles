package dialogs;

public class IntegerDialog extends AbstractDialog<Integer> {

    private final int min;
    private final int max;

    public IntegerDialog(String title, String errorMessage, int min, int max) {
        super(title, errorMessage);
        this.min = min;
        this.max = max;
    }

    @Override
    public String input() {
        while (true) {
            System.out.println(title);
            try {
                int result = Integer.parseInt(input.nextLine());
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