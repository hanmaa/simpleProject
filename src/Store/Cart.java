package Store;

import java.util.ArrayList;
import java.util.List;


class Cart {

    private List<Item> cart = new ArrayList();

    public void setCart(Item item) {
        cart.add(item);
    }

    public List<Item> getCart() {
        return this.cart;
    }
}



