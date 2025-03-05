package dialogs;

public class CharacterDialog extends AbstractDialog<Character> {

    public CharacterDialog(String title, String errorMessage) {
        super(title, errorMessage, s -> {
            if (s.length() != 1) {
               throw new IllegalArgumentException("Input must be a single character");
            }
            return s.charAt(0);
        });
    }

    @Override
    protected boolean isTypeValid(String input) {
        return (input.length() == 1);
    }

//    @Override
//    protected Character parseInput(String input) {
//        return input.charAt(0);
//    }

    @Override
    protected boolean isAllowed(Character result) {
        return true;
    }
}