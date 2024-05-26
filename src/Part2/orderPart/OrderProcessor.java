package Part2.orderPart;

public class OrderProcessor {
    Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public void processOrder() {
        validateOrder();
        notifyCustomer();
    }

    private void validateOrder() {
        // Логіка для перевірки замовлення
    }

    private void notifyCustomer() {
        // Логіка для повідомлення клієнта
    }

    private double calculateTotalPrice() {
        double price = 0.0;
        for (Item item : order.getItems()) {
            price += item.getPrice();
        }
        return price;
    }
}

