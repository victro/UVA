import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva621 {
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
        Integer testCases = in.nextInt();
        for (Integer i = 0; i < testCases; i += 1) {
            String sequence = in.next();
            System.out.println(solve(sequence));
        }
    }

    public static String solve(String sequence) {
        switch (sequence) {
            case "1":
            case "4":
            case "78":
                return "+";
        }
        if (sequence.charAt(0) == '9' && sequence.charAt(sequence.length() - 1) == '4') {
            return "*";
        } else if (sequence.charAt(sequence.length() - 2) == '3' && sequence.charAt(sequence.length() - 1) == '5') {
            return "-";
        }
        return "?";
    }
}
