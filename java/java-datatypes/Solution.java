import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");

                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }

                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }

                if (n >= Math.pow(-2, 31) && n <= (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }

                if (n >= Math.pow(-2, 63) && n <= (Math.pow(2, 63) - 1)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
