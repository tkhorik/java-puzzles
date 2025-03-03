package dialogs;

public class StringSelectDialog extends AbstractDialog<String> {

    private final String[] options;

    public StringSelectDialog(String title, String errorMessage, String[] options) {
        super(title, errorMessage);
        this.options = options;
    }

    @Override
    protected boolean isTypeValid(String input) {
        return true;
    }

    @Override
    protected String parseInput(String input) {
        return input;
    }

    @Override
    protected boolean isAllowed(String result) {
        for (String option : options) {
            if (option.equalsIgnoreCase(result)) {
                return true;
            }
        }
        return false;
    }
}