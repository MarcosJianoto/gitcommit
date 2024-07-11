import java.time.LocalDateTime;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        String maiscula = n.toUpperCase();
        System.out.println(maiscula);

        sc.close();
    }
}
