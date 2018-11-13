package Store;

import java.util.ArrayList;
import java.util.List;


class Shop {

    private List<Item> product = new ArrayList();

    public void setProduct(Item item) {
        product.add(item);
    }

    public List<Item> getProduct() {
        return this.product;
    }
}




