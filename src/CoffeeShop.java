import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee Order = null;

        System.out.println(" ");
        System.out.println("Welcome to Coffee <3v1> market");

        while (true) {
            System.out.println(" ");
            System.out.println("Select a coffee:");
            System.out.println("1. Jacobs");
            System.out.println("2. MacCoffee");
            System.out.println("3. Nescafe");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int ch = scanner.nextInt();

            if (ch == 0) {
                break;
            }

            switch (ch) {
                case 1 -> Order = new Jacobs();
                case 2 -> Order = new MacCoffee();
                case 3 -> Order = new Nescafe();
                default -> {
                    System.out.println("Invalid choice");
                    continue;
                }
            }


            while (true) {
                System.out.println(" ");
                System.out.println("Complete your order:");
                System.out.println("1. Add Milk");
                System.out.println("2. Add Sugar");
                System.out.println("3. Add Chocolate");
                System.out.println("0. Finish order");
                System.out.print("Enter your choice: ");

                int custom = scanner.nextInt();

                if (custom == 0) {
                    break;
                }

                switch (custom) {
                    case 1 -> Order = new Milk(Order);
                    case 2 -> Order = new Sugar(Order);
                    case 3 -> Order = new Choco(Order);
                    default -> System.out.println("Invalid choice.");
                }
            }

            System.out.println(" ");
            System.out.println("Your order: " + Order.getDescription());
            System.out.println("Total cost: $" + Order.cost());
        }

        scanner.close();
    }
}

