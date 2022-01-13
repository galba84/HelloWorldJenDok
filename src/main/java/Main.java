import java.io.InputStream;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; true; ) {
            if (scanner.hasNext()) {
                System.out.println(scanner.next()+" time "+ LocalDateTime.now());
            }
        }
    }
}
