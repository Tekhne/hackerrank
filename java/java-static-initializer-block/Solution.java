import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean flag = true;
    static short B;
    static short H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextShort();
        H = scanner.nextShort();

        if ((B < 1) || (H < 1)) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }

        scanner.close();

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
