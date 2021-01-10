package se.lexicon.AhmadAbdou;

public class Drink extends Product{

    String volume;

    public Drink(String name, int price) {
        super(name, price);
    }

    @Override
     String examine() {
        return null;
    }

    @Override
    Product purchase(int money) {
        return null;
    }

    @Override
    void use() {

    }
}
