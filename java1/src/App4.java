import java.time.LocalDateTime;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        // converter minutos em horas

        LocalDateTime date = LocalDateTime.now();
        int date2 = date.getHour();
        int date3 = date.getMinute();
        System.out.println(date2);
        System.out.println(date3);

        sc.close();
    }
}
