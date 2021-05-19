import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva1241 {
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
        FastReader in = new FastReader();
        Integer testCases = in.nextInt();
        for (Integer cases = 1; cases <= testCases; cases += 1) {
            Integer n = in.nextInt();
            Integer m = in.nextInt();
            BitSet participants = new BitSet(); // 2 ** n
            participants.set(1, (1 << n) + 1);
            for (int i = 0; i < m; i += 1) {
                int participant = in.nextInt();
                participants.set(participant, false);
            }
            System.out.println(solve(n, participants, 0));
        }
    }

    public static int solve(Integer n, BitSet participants, int result) {
        if (n < 1) {
            return result;
        }
        BitSet newParticipants = new BitSet();
        int counter = 1;

        for (int i = 2; i <= (1 << n); i += 2) {
            if (participants.get(i) | participants.get(i - 1)) {
                newParticipants.set(counter);
                result +=  participants.get(i) ^ participants.get(i - 1) ? 1 : 0;
            }
            counter += 1;
        }

        return solve(n - 1, newParticipants, result);
    }
}
