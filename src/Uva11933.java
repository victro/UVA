import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva11933 {
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


    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        //BufferedWriter out = new BufferedWriter(new FileWriter("output.txt", true));
        FastReader in = new FastReader();
        int n = in.nextInt();
        while (n != 0) {
            solve(n);
            n = in.nextInt();
        }
    }

    public static void solve(long n) {
        int cur = 1;
        int a = 0;
        int b = 0;
        boolean odd = true;

        while (cur <= n) {
            if ((n & cur) > 0) {
                if (odd) {
                    a += cur;
                } else {
                    b += cur;
                }
                odd = !odd;
            }
            cur =  cur << 1;
            if (cur < 0) // overflow
                break;
        }

        System.out.printf("%d %d\n", a, b);
    }
}
