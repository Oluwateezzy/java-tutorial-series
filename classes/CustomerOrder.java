public class CustomerOrder {

    // define static variable
    static int orderNumber = 1000;
    static double seniorDiscount = 2;
    static double price = 10.0;

    // define instance variable
    int quantity = 1;
    double orderAmount;
    boolean seniorCitizen;

    // generate order information
    void generateOrderBill(){
        orderNumber = orderNumber + 1;
        orderAmount = price * quantity;

        if (seniorCitizen) {
            orderAmount = orderAmount - seniorDiscount;
        }
    }
}
