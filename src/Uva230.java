import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Uva230 {
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
        String book = in.nextLine();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<String> bookNames = new ArrayList<>();
        HashMap<Integer, String[]> bookMap = new HashMap<>();
        int counter = 0;
        while(book.compareTo("END") != 0) {

            String bookName = book.split("\" by ")[0];
            String bookAuthor = book.split("\" by ")[1];
            bookName = bookName.substring(1);
            String[] bookNameAuthor = new String[2];
            bookNameAuthor[0] = bookName;
            bookNameAuthor[1] = bookAuthor;
            bookMap.put(counter, bookNameAuthor);
            counter += 1;
            book = in.nextLine();
        }

        solve();
    }

    public static void solve() {
        String[] result = new String[100];

        System.out.printf("END\n");
    }

}

