package fju.db;

public class DrinkTester {
    public static void main(String[] args) {
        Drink[] drinks = {
                new Drink(1, "Cola", 20),
                new Drink(2, "Juice", 15),
                new Drink(3, "7-UP", 18),
        };

        for (Drink drink: drinks) {
            System.out.println(drink.id + "\t" + drink.name + "\t" + drink.price);
        }
    }
}
