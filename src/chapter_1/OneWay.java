package chapter_1;

public class OneWay {
    public boolean isOneOrZeroEditAway(String a, String b) {
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        boolean same = a.length() == b.length();
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        boolean oneMismatch = false;
        int j = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(j)) {
                if (oneMismatch) {
                    return false;
                }
                if (!same) j++;
                oneMismatch = true;
            }
            j++;
        }
        return true;
    }
}
