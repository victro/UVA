import java.io.BufferedReader;
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
        FastReader in = new FastReader();
        String line = in.next();
        while(line.length() > 0) {
            solve(line);
        }
    }

    private static String solve(String line) {
        LinkedList<Character> myList = new LinkedList<>();
        boolean beginning = false;
        for (int i = 0; i < line.length(); i += 1) {
            if (beginning == false && line.charAt(i) != '[' && line.charAt(i) != ']') {
                myList.addLast(line.charAt(i));
            } else if (beginning == true && line.charAt(i) != '[' && line.charAt(i) != ']') {
                if (myList.size() > 0) {
                    char aux = myList.getFirst();

                }
            }
        }
        return "solved!";
    }
}
