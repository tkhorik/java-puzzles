package dialogs;

import java.util.Scanner;
import java.util.function.Function;

public abstract class AbstractDialog<T> implements Dialog<T> {
    protected final String title;
    protected final String errorMessage;
    protected final Function<String, T> mapper;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String errorMessage, Function<String, T> mapper) {
        this.title = title;
        this.errorMessage = errorMessage;
        this.mapper = mapper;
    }

    public T input() {
        while (true) {
            showTitle(title);
            String input = scanner.nextLine();
            try {
                if (isTypeValid(input) && isAllowed(mapper.apply(input))) {
                    return mapper.apply(input);
                }
            } catch (IllegalArgumentException e) {
//            if (isTypeValid(input)) {
//                T result = mapper.apply(input);
//                if (isAllowed(result)) {
//                    return result;
//                }
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

    abstract protected boolean isAllowed(T result);
}