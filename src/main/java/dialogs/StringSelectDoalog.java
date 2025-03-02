package dialogs;

public class StringSelectDoalog implements Dialog<String> {

    private final String title;
    private final String errorMessage;
    private final String[] options;

    public StringSelectDoalog(String title, String errorMessage, String[] options) {
        this.title = title;
        this.errorMessage = errorMessage;
        this.options = options;
    }

    @Override
    public String input() {
        while (true) {
            System.out.println(title);
            String input = System.console().readLine();
            if (contains(input)) {
                return input;
            }

            System.out.println(errorMessage);
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
