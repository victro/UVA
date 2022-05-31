import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            cases -= 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%s\n", solve(a, b));
        }

        sc.close();
    }

    static String solve(int a, int b) {
        return a > b ? ">" : a != b ? "<" : "=";
    }
}
