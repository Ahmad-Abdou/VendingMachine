package se.lexicon.AhmadAbdou;

public class VendingMachinelmpl extends Product implements VendingMachine {

    int denominations[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    Product[] products = new Product[9];

    int moneyPool = 0;

    public VendingMachinelmpl(int[] denominations, Product[] products, int moneyPool) {
        super();
        this.denominations = denominations;
        this.products = products;
        this.moneyPool = moneyPool;
    }

    public VendingMachinelmpl() {
        super();

    }

    @Override
    public boolean addMoney(int money) {
        if (money >= 0) {
            moneyPool = money;
            return true;
        } else
            return false;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    String examine() {
        if (getName() == "Sweets")
            return "Name : Marshmello \n" +
                    "Price = 10kr \n" +
                    "Calories = 105";
        else if (this.name == "Drink")
            return "Name : Coca cola \n" +
                    "Price = 15kr \n" +
                    "Calories = 105";
        else if (this.name == "Food")
            return "Name : Hamburger \\" +
                    "Price = 50kr \\n" +
                    "Calories = 300";

        else return "you cant do that";
    }

    @Override
    public Product buy(int money, int prodNum) {
        Product drink1 = new Drink("Pepsi", 25);
        Product drink2 = new Drink("Cola Zero", 30);
        Product food1 = new Food("Chips", 10);
        Product food2 = new Food("Hamburger", 50);
        Product sweet1 = new Sweet("Galaxy", 20);
        Product sweet2 = new Sweet("Marshmello", 15);
        if (getPrice() == 15) {
            return sweet2;
        } else if (getPrice() == 20) {
            return sweet1;
        } else if (getPrice() == 50) {
            return food2;
        } else if (getPrice() == 10) {
            return food1;
        } else if (getPrice() == 30) {
            return drink2;
        } else if (getPrice() == 25) {
            return drink1;
        }

        return null;
    }

    @Override
    public int returnChange() {
        int result = moneyPool - getPrice();
        moneyPool = 0;
        return result;
    }

    @Override
    public void presentProducts(int productNumber) {
        if (productNumber == 1) {

            System.out.println("Name = Marshmello \nPrice = 15kr \nCalories = 105");
        } else if (productNumber == 2) {
            System.out.println("Name = Galaxy \nPrice = 20kr \nCalories = 140");
        } else if (productNumber == 3) {
            System.out.println("Name = Hamburger \nPrice = 50kr \nCalories = 245");
        } else if (productNumber == 4) {
            System.out.println("Name = Chips \nPrice = 10kr \nCalories = 80");
        } else if (productNumber == 5) {
            System.out.println("Name = Pepsi \nPrice = 25kr \nCalories = 135");
        } else if (productNumber == 6) {
            System.out.println("Name = Cola Zero \nPrice = 30kr \nCalories = 60");
        }
    }

    @Override
    public int getBalance() {
        return moneyPool;

    }

    @Override
    Product purchase(int money) {

        return null;
    }

    @Override
    void use() {
        System.out.println("the product has been consumed");
    }
}
