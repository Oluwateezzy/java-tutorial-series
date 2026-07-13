public class CustomerOrder {

    // define static variable
    static int orderNumber = 1000;
    static double seniorDiscount = 2.0;

     // define instance variable
    int quantity = 1;
    boolean seniorCitizen;

    public CustomerOrder(int quantity, boolean seniorCitizen) {
        this.quantity = quantity;
        this.seniorCitizen = seniorCitizen;

        orderNumber = orderNumber + 1;
    }
    public CustomerOrder(int quantity) {
        this(quantity, false);
    }

    double orderAmount = 0.0;

    // generate order information
    double generateOrderBill(){
        double price = Menu.price;

        orderAmount = price * quantity;

        if (seniorCitizen) {
            orderAmount = orderAmount - seniorDiscount;
        }

        return orderAmount;
    }
}
