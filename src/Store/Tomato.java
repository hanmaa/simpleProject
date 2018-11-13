package Store;

public class Tomato implements Item {

    private String name;
    private int price;

    public Tomato(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int setPrice(int price) {
        return this.price = price;
    }

    @Override
    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString(){
        return name+" за "+price+" рублей";
    }
}
