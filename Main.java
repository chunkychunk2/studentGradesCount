import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(reader.readLine());
        int[] marks = new int[max];
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = Integer.parseInt(reader.readLine());
            switch (marks[i]) {
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                default:
                    five++;
                    break;
            }
        }
        System.out.println(two + " " + three + " " + four + " " + five);
    }
}
