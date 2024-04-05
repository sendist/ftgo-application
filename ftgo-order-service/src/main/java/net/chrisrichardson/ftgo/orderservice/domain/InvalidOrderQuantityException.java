public class InvalidOrderQuantityException extends RuntimeException {
    private String menuItemId; 
    private int quantity;

    public InvalidOrderQuantityException(String menuItemId, int quantity) {
        super("Invalid quantity (" + quantity + ") for menu item: " + menuItemId);
        this.menuItemId = menuItemId;
        this.quantity = quantity;
    }

}