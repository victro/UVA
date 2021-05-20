import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva11988 {
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
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = in.readLine()) != null) {
            System.out.printf("%s\n", solve(line));
        }
    }

    private static String solve(String line) {
        LinkedList<Character> myList = new LinkedList<>();
        int counterBeginning = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i += 1) {
            if (line.charAt(i) == '[') {
                counterBeginning = 0;
            } else if (line.charAt(i) == ']') {
                counterBeginning = myList.size();
            } else {
                myList.add(counterBeginning, line.charAt(i));
                counterBeginning += 1;
            }
        }

        for (char c : myList) {
            result.append(c);
        }

        return result.toString();
    }
}
