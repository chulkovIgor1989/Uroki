package org.example;

public class Bow {
    private int foodAmount;


    public Bow(int foodAmount) {

        this.foodAmount = foodAmount;
    }


    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0; // Возвращаем 0, если в миске недостаточно еды
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Докинули еды " + amount);
        }
    }

    public int FoodAmount() {
        return foodAmount;
    }


}