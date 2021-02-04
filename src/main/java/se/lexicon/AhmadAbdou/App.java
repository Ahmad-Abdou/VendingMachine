package se.lexicon.AhmadAbdou;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachinelmpl vending = new VendingMachinelmpl();
        int money = 1;
        int price = 0;
        int change = 0;
        System.out.print("Please add money : ");
        money = sc.nextInt();
        if (money == 1 || money == 2 || money == 5 || money == 10 || money == 20 || money == 50 || money == 100 || money == 200 || money == 500 || money == 1000) {


            if (money <= 0) {
                System.out.println("insufficient funds, please add more money and try again!");
                return;
            } else
                System.out.print(vending.addMoney(money));
            System.out.println(" the amount " + money + "kr was added to the deposit.");
            while (vending.addMoney(money) == true) {
                System.out.println("We have 6 products you can choose between Sweets, Drinks and Food ");
                System.out.println("Press a number between 1-6 to view product details");
                int productNumber = sc.nextInt();

                if (productNumber == 1) {
                    price = 15;
                } else if (productNumber == 2) {
                    price = 20;
                } else if (productNumber == 3) {
                    price = 50;
                } else if (productNumber == 4) {
                    price = 10;
                } else if (productNumber == 5) {
                    price = 25;
                } else if (productNumber == 6) {
                    price = 30;
                }


                vending.presentProducts(productNumber);
                System.out.println("Do you want to buy this product ?");
                System.out.println("Type yes if u want to buy the product otherwise enter no to exit and choose another product");
                String answer = sc.nextLine();
                String answer2 = sc.nextLine();

                if (answer.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("y")) {

                    change = money - price;
                    int newChange = change;
                    money = newChange;

                    if (newChange < 0) {
                        System.out.println("insufficient funds, please add more money and try again!");
                        break;
                    }

                    vending.buy(money, productNumber);
                    vending.setPrice(price);
                    System.out.println("Your change: " + newChange);
                    System.out.println("Do you want to buy another product? type yes to proceed , No to exit!");
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
                        System.out.println("Your balance now is : " + vending.returnChange());
                        continue;
                    } else {
                        System.out.println("Have a good day! :)");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("You can only add 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, please try again!");
            System.exit(-1);
        }

    }
}
