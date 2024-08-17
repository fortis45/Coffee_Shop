import java.util.*;

public class Coffee_Shop {
    public static void main(String[] args) {
        System.out.println(" \n     ***Welcome to Saturn Coffee***");

        int price_BlackCoffee = 2;
        int price_Espresso = 3;
        int price_Latte = 4;
        int price_Cappuccino = 5;
        int price_Frappuccino = 6;

        System.out.println("\n1) Black Coffee: $" + price_BlackCoffee);
        System.out.println("2) Espresso: $" + price_Espresso);
        System.out.println("3) Latte: $" + price_Latte);
        System.out.println("4) Cappuccino: $" + price_Cappuccino);
        System.out.println("5) Frapuccino: $" + price_Frappuccino);

        Scanner obj = new Scanner(System.in);
        String order;

        while (true) {
            System.out.print("\nEnter option:");
            order = obj.nextLine();

            if (order.equals("0")) {
                System.exit(0);
            }
            if (order.isEmpty()) {
                System.out.println("I can't read your mind!");
            } else {
                try {
                    int a = Integer.parseInt(order);
                    if (a > 5 || a < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("INVALID INPUT!!");
                }
            }
        }

        String item = "";
        switch (order) {
            case "1" -> item = "Black Coffee";
            case "2" -> item = "Espresso";
            case "3" -> item = "Latte";
            case "4" -> item = "Cappuccino";
            case "5" -> item = "Frappuccino";
            default -> System.out.println("Invalid input!");
        }

        int quantity;
        int confirm;
        System.out.println("\nYou have selected " + item + ".");
        System.out.print("\nHow many " + item + " do you want?");
        quantity = obj.nextInt();

        int total;

        switch (item) {
            case "Black Coffee" -> total = quantity * price_BlackCoffee;
            case "Espresso" -> total = quantity * price_Espresso;
            case "Latte" -> total = quantity * price_Latte;
            case "Cappuccino" -> total = quantity * price_Cappuccino;
            case "Frappuccino" -> total = quantity * price_Frappuccino;
            default -> throw new AssertionError();
        }

        System.out.println("\n     ***Please confirm your order***\n");
        System.out.print(quantity + " " + item + "\n\nYes[1]/No[0]: ");
        confirm = obj.nextInt();

        if (confirm == 1) {
            System.out.print("\nYour total is : $" + total);
        } else if (confirm == 0) {
            System.exit(0);
        }

        System.err.println("");
        System.out.println("\n     ***Payment options***");
        System.out.println("\n1) Cash");
        System.out.println("2) Scan QR code: ");

        String payments;
        obj.nextLine(); // Add this line to consume the newline character
        System.out.print("\nEnter option: ");
        payments = obj.nextLine();

        while (true) {
            if (payments.equals("1")) {
                System.out.print("\nPlease pay at the cash counter and receive your order.\n");
                break;
            }

            if (payments.equals("2")) {
                System.out.println("\n***Payment Successfull***");
                break;
            }

            if (payments.isEmpty()) {
                System.out.println("I can't read your mind!");
            }

            try {
                int a = Integer.parseInt(payments);

                if (a > 2 || a < 0) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("INVALID INPUT");
            }
        }
    }
}