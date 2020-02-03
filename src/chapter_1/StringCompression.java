package chapter_1;

public class StringCompression {
    public String compress(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        int charCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            charCounter++;

            if (i >= str.length() - 1 || str.charAt(i + 1) != str.charAt(i)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(charCounter);
                charCounter = 0;
            }
        }

        String res = stringBuilder.toString();
        return res.length() >= str.length() ? str : res;
    }
}
