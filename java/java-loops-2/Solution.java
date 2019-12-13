import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = scanner.nextInt();

        List<Integer> series = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for (int q = 0; q < numberOfQueries; q++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                values.add(a);

                for (int j = 0; j <= i; j++) {
                    values.add((int) (Math.pow(2, j) * b));
                }

                series.add(values.stream().mapToInt(Integer::intValue).sum());
                values.clear();
            }

            System.out.println(
                    series.stream().map(Object::toString).collect(Collectors.joining(" ")));
            series.clear();
        }

        scanner.close();
    }
}
