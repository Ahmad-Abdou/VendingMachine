package se.lexicon.AhmadAbdou;

public class Food extends Product{
    int calories;

    public Food(String name, int price) {
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
