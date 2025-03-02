package dialogs;

import java.util.Scanner;

public abstract class AbstractDialog<T> implements Dialog <T> {
    protected final String title;
    protected final String errorMessage;
    protected final Scanner input = new Scanner(System.in);

    public AbstractDialog(String title, String errorMessage) {
        this.title = title;
        this.errorMessage = errorMessage;
    }
    protected void showTitle(String title) {
        System.out.println(this.title);
    }
    protected void showError() {
        System.out.println(errorMessage);
    }
}
