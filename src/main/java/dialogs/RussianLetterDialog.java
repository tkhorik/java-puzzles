package dialogs;

public class RussianLetterDialog extends CharacterDialog {
    public RussianLetterDialog(String title, String errorMessage) {
        super(title, errorMessage);
    }

    @Override
    protected boolean isAllowed(Character result) {
        return Character.UnicodeBlock.of(result) == Character.UnicodeBlock.CYRILLIC;
    }
}
