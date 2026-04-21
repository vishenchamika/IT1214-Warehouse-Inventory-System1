import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    // Remove item
    public void removeItem(String id) {
        Item found = null;
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                found = item;
                break;
            }
        }
        if (found != null) {
            items.remove(found);
            System.out.println("Item removed successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Update quantity
    public void updateQuantity(String id, int newQty) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                item.setQuantity(newQty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search by ID or Name
    public void searchItem(String keyword) {
        boolean found = false;
        for (Item item : items) {
            if (item.getItemId().equalsIgnoreCase(keyword) ||
                item.getItemName().equalsIgnoreCase(keyword)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Display all items
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}