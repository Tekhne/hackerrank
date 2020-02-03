import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // A simpler solution would probably involve using Arrays.sort(). However, the HackerRank
        // web site didn't seem to let us change the imports from the defaults given, so
        // java.util.Arrays couldn't be used.

        if (a.length() != b.length()) {
            return false;
        }

        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        boolean found = false;
        char[] tmpChars;
        int tmpIndex;

        for (int aIndex = 0; aIndex < aChars.length; aIndex++) {
            found = false;

            for (int bIndex = 0; bIndex < bChars.length; bIndex++) {
                if (aChars[aIndex] == bChars[bIndex]) {
                    tmpChars = new char[bChars.length - 1];
                    tmpIndex = 0;

                    for (int replaceIndex = 0; replaceIndex < bChars.length; replaceIndex++) {
                        if (replaceIndex == bIndex) {
                            continue;
                        } else {
                            tmpChars[tmpIndex++] = bChars[replaceIndex];
                        }
                    }

                    bChars = tmpChars;
                    tmpChars = null;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
