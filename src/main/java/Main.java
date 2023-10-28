import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввод логина и пароля");
        System.out.println(account("qerertqwer", 123456, 123456));

        Buyer[] buyers = {new Buyer("Alex"), new Buyer("Bill"), new Buyer("Luk"), new Buyer("David"), new Buyer("Barry")};
        List<Order> orders = new ArrayList<>();
        Product[] products = {new Product("Apple"), new Product("Orange"), new Product("Lemon")};
        purchase(orders, new Order(buyers[2], products[1], 2),buyers ,products);
        purchase(orders, new Order(buyers[1], products[0], 3),buyers ,products);
        purchase(orders, new Order(buyers[0], products[2], -1),buyers ,products);
        purchase(orders, new Order(buyers[2], products[1], 2),buyers ,products);
        purchase(orders, new Order(buyers[1], products[0], 1),buyers ,products);
    }

    public static boolean account(String login, long password, long confirmPassword) {

        if (login.length() > 20) {
            new WrongLoginException("длина логина больше 20 символов").printStackTrace();
            return false;
        }
        if (Long.toString(password).length() > 20 || password != confirmPassword) {
            new WrongLoginException("длина пароля больше 20 символов или пароли не совпадают").printStackTrace();
            return false;
        }
        return true;
    }

    public static Order purchase(List<Order> arr, Order order, Buyer[] buyers, Product[] products){
        if(order.count < 1) {
            new Exception("Введено кол-во товаров меньше 1").printStackTrace();
        }

        arr.add(order);
        System.out.println("Покупатель "+order.buyer.name);
        System.out.println("Вид покупки "+order.product.nameProd);
        System.out.println("Кол-во "+order.count);

        return order;
    }

}
