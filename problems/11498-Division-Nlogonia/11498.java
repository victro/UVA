import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfQueries = sc.nextInt();
        while (numberOfQueries != 0) {
            int vertical = sc.nextInt();
            int horizontal = sc.nextInt();
            for (int i = 0; i < numberOfQueries; i += 1) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.printf("%s\n", getPosition(vertical, horizontal, x, y));
            }
            numberOfQueries = sc.nextInt();
        }

        sc.close();
    }

    static String getPosition(int vertical, int horizontal, int x, int y) {
        if (vertical == y || horizontal == y || vertical == x || horizontal == y) {
            return "divisa";
        }

        String result = y > horizontal ? "N" : "S";
        result += x > vertical ? "E" : "O";

        return result;
    }
}
