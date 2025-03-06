package dialogs;

public class StringSelectDialog extends AbstractDialog<String> {

    public StringSelectDialog(String title, String errorMessage, String[] options) {
        super(title, errorMessage, s -> s, s -> {
            for (String option : options) {
                if (option.equals(s)) {
                    return true;
                }
            }
            return false;
        });
    }
}