import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer line = 0;

            while (scanner.hasNext()) {
                line++;
                System.out.println(line.toString() + " " + scanner.nextLine());
            }
        }
    }
}
