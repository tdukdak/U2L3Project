public class runner {
    public static void main(String[] args) {
        ShoppingListItem item = null;
        String s = item.toString();
        item = new ShoppingListItem("apple", 0.50, 10);
        double total = item.totalCost();


        System.out.println(total);
    }
}
