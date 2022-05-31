import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        for (int i = 1; i <= numberOfCases; i += 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.printf("Case %d: %d\n", i, getMedian(a, b, c));
        }

        sc.close();
    }

    static int getMedian(int a, int b, int c) {
        List<Integer> employees = new ArrayList<Integer>();
        employees.add(a);
        employees.add(b);
        employees.add(c);
        Collections.sort(employees);
        return employees.get(1);
    }
}
