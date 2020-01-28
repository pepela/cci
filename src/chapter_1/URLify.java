package chapter_1;

public class URLify {
    public String solve(char[] url, int trueLength) {
        int countOfSPaces = countOfSpaces(url, 0, trueLength);
        int newIndex = trueLength - 1 + countOfSPaces * 2;

        if (newIndex + 1 < url.length) {
            url[newIndex + 1] = '\0';
        }

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            if (url[oldIndex] == ' ') {
                url[newIndex] = '0';
                url[newIndex - 1] = '2';
                url[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                url[newIndex] = url[oldIndex];
                newIndex--;
            }
        }

        return new String(url);
    }

    int countOfSpaces(char[] charArray, int start, int end) {
        int counter = 0;
        for (int i = start; i < end; i++) {
            if (charArray[i] == ' ') counter++;
        }
        return counter;
    }
}
