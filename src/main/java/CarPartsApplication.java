import java.util.*;
import org.springframework.boot.SpringApplication;

public class CarPartsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpringApplication.run(CarPartsApplication.class, args);

        scanner.close();
    }
}