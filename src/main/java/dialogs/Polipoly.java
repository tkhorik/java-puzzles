package dialogs;
//2. Проверить, является ли строка палиндромом? #
public class Polipoly {
    public static boolean isPolipoly(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversedStr = new StringBuilder(cleanedStr).reverse();
        return cleanedStr.equals(reversedStr.toString() );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Polipoly polipoly = (Polipoly) obj;
        return isPolipoly(polipoly.toString());
    }
}
