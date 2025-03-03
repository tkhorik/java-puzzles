package dialogs;

public class IntegerDialog extends AbstractDialog<String> {

    private final int min;
    private final int max;

    public IntegerDialog(String title, String errorMessage, int min, int max) {
        super(title, errorMessage);
        this.min = min;
        this.max = max;
    }

    @Override
    protected boolean isTypeValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    protected String parseInput(String input) {
        return input;
    }

    @Override
    protected boolean isAllowed(String input) {
        try {
            int result = Integer.parseInt(input);
            if (result >= min && result <= max) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println(errorMessage);
        }
        return false;
    }
}