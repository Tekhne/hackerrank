import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<String> tokens = Arrays.asList(s.trim().split("[ !,?._.'@]+")).stream()
                .filter(t -> !t.isEmpty()).collect(Collectors.toList());
        System.out.println(tokens.size());

        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
