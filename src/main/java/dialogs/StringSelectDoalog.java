package dialogs;

public class StringSelectDoalog extends AbstractDialog<String> {

    private final String[] options;

    public StringSelectDoalog(String title, String errorMessage, String[] options) {
        super(title, errorMessage);
        this.options = options;
    }

    @Override
    public String input() {
        while (true) {
            showTitle(title);
            String input = System.console().readLine();
            if (contains(input)) {
                return input;
            }
            showError();
        }
    }

    private boolean contains(String input) {
        for (String option : options) {
            if (option.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }
}
