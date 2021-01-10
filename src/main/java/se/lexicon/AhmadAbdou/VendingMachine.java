package se.lexicon.AhmadAbdou;

public interface VendingMachine {
    boolean addMoney(int money);

    Product buy(int money, int prodNum);

    int returnChange();

    void presentProducts(int productNumber);

    int getBalance();

}
