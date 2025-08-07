import javax.tools.Tool;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpringApplication.run(CarPartsApplication.class, args);
        MainMenu.mainMenu(scanner);

        scanner.close();
    }
}