package dialogs;

import java.util.Scanner;

public abstract class AbstractDialog<T> implements Dialog<T> {
    protected final String title;
    protected final String errorMessage;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String errorMessage) {
        this.title = title;
        this.errorMessage = errorMessage;
    }

    public T input() {
        while (true) {
            showTitle(title);
            String input = scanner.nextLine();
            if (isTypeValid(input)) {
                T result = parseInput(input);
                if (isAllowed(result)) {
                    return result;
                }
            }
            showError();
        }
    }

    protected void showTitle(String title) {
        System.out.println(title);
    }

    protected void showError() {
        System.out.println(errorMessage);
    }

    abstract protected boolean isTypeValid(String input);

    abstract protected T parseInput(String input);

    abstract protected boolean isAllowed(T result);
}