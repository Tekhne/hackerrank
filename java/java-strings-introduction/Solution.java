import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();
        boolean isALarger = A.compareTo(B) > 0;
        String sentenceCaseA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String sentenceCaseB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sum);
        System.out.println(isALarger ? "Yes" : "No");
        System.out.println(sentenceCaseA + " " + sentenceCaseB);

        sc.close();
    }
}
