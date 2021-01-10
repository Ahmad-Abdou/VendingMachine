package se.lexicon.AhmadAbdou;

public abstract class Product {
    String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int price;

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String examine() {

        return null;
    }

    abstract Product purchase(int money);

    abstract void use();
}
