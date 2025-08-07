// import API

import javax.tools.Tool;
import java.util.*;

// helper classes:
// append to currentcarpartlist
// append to newcarpartlist
// calculate 


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("---Car Part Manager---\n");
        System.out.println("""
                Please select a path (1/2/3/4):
                1. My Car
                2. Select New Parts
                3. Calculate Budget
                4. Info
                5. Quit""");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                myCar(scanner);
                break;
            case 2:
                selectCarParts(scanner);
                break;
            case 3:
                calculateBudget(scanner);
                break;
            case 4:
                information(scanner);
            case 5:
                running = false;
                break;
            default:
                System.out.println("Please input a valid number (1/2/3/4)");
        }

        scanner.close();
    }

    public static void myCar(Scanner scanner) {
        ToolBox.myCarTool(scanner);
    }

    public static void selectCarParts(Scanner scanner) {
        ToolBox.selectCarPartsTool(scanner);
    }

    public static void calculateBudget(Scanner scanner) {
        ToolBox.calculateBudgetTool(scanner);
    }

    public static void information(Scanner scanner) {
        System.out.println("---Welcome to Information---\n Here is a brief on each function:\n");

        System.out.println("""
                My Car: This tool is a storage component where you can store your current car stats (individual parts) and keep track of any changes.
                
                Select New Parts: This tool allows you to select new parts (via an API) or input them manually.
                                  It will append to a personal list and keep track of the cost as you go.
                
                Calculate Budget: This tool helps you calculate the total budget required to purchase all of your new parts, or estimate the return of selling old parts.
                                  Use this tool after the 'Select New Parts' tool.
                """);
        System.out.println("Press R to return to the main menu.");
        String back = scanner.nextLine();

        if (back == "R") {
            return;
        } else {
            System.out.println("Press R to return to the main menu.");
        }
    }

}