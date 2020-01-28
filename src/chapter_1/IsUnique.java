package chapter_1;

public class IsUnique {
    /*
     * time = O(n), or O(1) as for will not iterate more then 128
     * space = O(1)
     * */
    public boolean solve(String input) {
        boolean[] charSet = new boolean[128];

        for (char c : input.toCharArray()) {
            if (charSet[(int) c]) {
                return false;
            }

            charSet[(int) c] = true;
        }

        return true;
    }


    /*
    * only small letters
    * */
    public boolean solveExtraDataStructure(String input) {
        int checker = 0;

        for (char c : input.toCharArray()) {
            int val = c - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }

        return true;
    }
}
