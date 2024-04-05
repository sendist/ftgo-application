public class InvalidRevisedOrderQuantityException extends RuntimeException {
    private String menuItemId; 
    private int quantity;

    public InvalidRevisedOrderQuantityException(String menuItemId, int quantity) {
        super("Invalid revised quantity (" + quantity + ") for menu item: " + menuItemId);
        this.menuItemId = menuItemId;
        this.quantity = quantity;
    }
}