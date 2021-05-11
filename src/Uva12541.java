import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Uva12541 {
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

    static class Student {
        private String name;
        private int year;
        private int month;
        private int day;

        public Student(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public String getName() {
            return name;
        }

        public Integer getYear() {
            return year;
        }

        public Integer getMonth() {
            return month;
        }

        public Integer getDay() {
            return day;
        }

    }

    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        //BufferedWriter out = new BufferedWriter(new FileWriter("output.txt", true));
        FastReader in = new FastReader();
        Integer nStudents = in.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < nStudents; i += 1) {
            String name = in.next();
            Integer day = in.nextInt();
            Integer month = in.nextInt();
            Integer year = in.nextInt();
            students.add(new Student(name, year, month, day));
        }

        String[] result = solve(students);
        System.out.printf("%s\n%s\n", result[0], result[1]);
    }

    public static String[] solve(ArrayList<Student> students) {
        String[] result = new String[2];

        Collections.sort(students, (s1, s2) -> {
            if (s1.getYear().compareTo(s2.getYear()) != 0) {
                return s1.getYear().compareTo(s2.getYear());
            }

            if (s1.getMonth().compareTo(s2.getMonth()) != 0) {
                return s1.getMonth().compareTo(s2.getMonth());
            }

            return s1.getDay().compareTo(s2.getDay());
        });

        result[0] = students.get(students.size() - 1).getName();
        result[1] = students.get(0).getName();

        return result;
    }
}
