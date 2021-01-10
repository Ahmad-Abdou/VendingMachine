package se.lexicon.AhmadAbdou;

public class Sweet extends Product{
    int sugarPercent;

    public Sweet(String name, int price) {
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
