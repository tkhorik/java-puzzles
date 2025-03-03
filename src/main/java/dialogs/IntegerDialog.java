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
    protected boolean isTypeValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    protected Integer parseInput(String input) {
        return Integer.valueOf(input);
    }

    @Override
    protected boolean isAllowed(Integer input) {
        try {
            if (input >= min && input <= max) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println(errorMessage);
        }
        return false;
    }
}