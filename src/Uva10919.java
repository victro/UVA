import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva10919 {
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
        int nCoursesTaken = in.nextInt();

        while (nCoursesTaken != 0) {
            int nCategories = in.nextInt();
            boolean meet = true;
            int[] coursesTaken = new int[10000];

            for (int i = 0; i < nCoursesTaken; i += 1) {
                int course = Integer.parseInt(in.next());
                coursesTaken[course] = 1;
            }

            for (int i = 0; i < nCategories; i += 1) {
                int nCoursesForThisCategory = in.nextInt();
                int minCoursesForThisCategory = in.nextInt();

                for (int j = 0; j < nCoursesForThisCategory; j += 1) {
                    int course = Integer.parseInt(in.next());
                    if (coursesTaken[course] == 1) {
                        minCoursesForThisCategory -= 1;
                    }
                }

                if (minCoursesForThisCategory > 0) {
                    meet = false;
                }
            }

            if (meet) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            nCoursesTaken = in.nextInt();
        }

    }
}
