import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva10424 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader in = new FastReader();
        String name1 = in.nextLine();
        String name2 = in.nextLine();
        while (name1 != null && name2 !=null) {
            System.out.printf("%.2f %%\n", solve(name1, name2));
            name1 = in.nextLine();
            name2 = in.nextLine();
        }
    }

    public static Double solve(String name1, String name2) {
        int name1Result = processString(name1);
        int name2Result = processString(name2);
        int min, max;

        if (name1Result < name2Result) {
            min = name1Result;
            max = name2Result;
        } else {
            min = name2Result;
            max = name1Result;
        }
        return (double) (min * 1.0 / max) * 100;
    }

    public static int processString(String name) {
        int sumOfChars = getSumOfChars(name.toLowerCase());
        return getSumOfDigits(sumOfChars);
    }

    public static int getSumOfChars(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i += 1) {
            char current = name.charAt(i);
            if (current >= 'a' && current <= 'z') {
                sum += current - 96;
            }
        }

        return sum;
    }

    public static int getSumOfDigits(int number) {
        int copy = number;
        int lastDigit = copy % 10;
        int sum = lastDigit;
        copy /= 10;
        if (number < 9) {
            return number;
        }
        while (copy >= 1) {
            lastDigit = copy % 10;
            copy /= 10;
            sum += lastDigit;
        }
        if (sum > 9) {
            return getSumOfDigits(sum);
        }
        return sum;
    }
}
