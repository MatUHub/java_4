public class Order {
    Buyer buyer;
    Product product;
    Integer count;
    Order(Buyer buyer, Product product, Integer count){
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }
}
