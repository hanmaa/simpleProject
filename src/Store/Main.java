package Store;


import java.util.List;
import java.util.Scanner;


public class Main {

    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args){
        Cart cart = new Cart();
        Shop shop = new Shop();
        addItem(shop);
        mainMenuChoice(shop, cart);
    }

    private static void mainMenuChoice(Shop shop, Cart cart) {
        System.out.print("Здравствуй, ");
        while (true) {
            System.out.println("набери нужную цифру");
            System.out.println("1)выбрать товар");
            System.out.println("2)посмотреть корзину");
            System.out.println("3)оплатить");
            System.out.println("4)выйти");

            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1: {
                    outPut(shop.getProduct());
                    break;
                } case 2: {
                    outPut(cart.getCart());
                    break;
                } case 3: {
                    buyItem(shop, cart);
                    break;
                } case 4: {
                    System.out.println("До свидания");
                    System.exit(0);
                }
            }
        }
    }

    private static void outPut(List<Item> product) {
        for (int i = 0; i < product.size(); i++){
            System.out.println(i + 1 + ". " + product.get(i));
        }
    }

    private static void buyItem(Shop shop, Cart cart){
        System.out.println("введите номер продукта");
        int choicee = Integer.parseInt(scan.nextLine());
        cart.setCart(shop.getProduct().get(choicee - 1));
    }

    private static void addItem(Shop Shop) {
        Tomato t1 = new Tomato("помидор", 100);
        Flour f1 = new Flour("мука", 40);
        Cake c1 = new Cake("торт", 200);
        Rice r1 = new Rice("рис", 60);

        Shop.setProduct(t1);
        Shop.setProduct(f1);
        Shop.setProduct(c1);
        Shop.setProduct(r1);
    }
}