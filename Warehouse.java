import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. Display All Items");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    inventory.updateQuantity(uid, newQty);
                    break;

                case 4:
                    System.out.print("Enter ID or Name: ");
                    inventory.searchItem(sc.nextLine());
                    break;

                case 5:
                    inventory.displayItems();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}