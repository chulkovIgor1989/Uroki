package org.example;

public class Main{
    public static void main(String[]args){

        Dog dogSharik=new Dog("Шарик");
        Cat catFenay=new Cat("Феня");

        int minValue = 1;
        int maxValue = 240;
        int randomValue=minValue+(int)(Math.random()*(maxValue-minValue+1));

        dogSharik.run(randomValue);
        dogSharik.swim(8);




        catFenay.run(randomValue);
        catFenay.swim(randomValue);

        System.out.println("Количество  животных: "+Animals.count);
        System.out.println("Количество  кошек: "+ Cat.getCatCount());
        System.out.println("Количество  собак: "+ Dog.getDogCount());



        Cat[]cats=new Cat[5];
        for(int i=0;i<cats.length;i++){
        cats[i]=new Cat("Кот номер "+(i+1));
        }
        Bow bow=new Bow(45);
        for(int i=0;i<cats.length;i++){
            int foodTaken=bow.getFood(10);
            cats[i].eat(foodTaken);
            if(i<cats.length-1){
                System.out.print("\nОсталось в миске "+bow.FoodAmount());
            }
        }

        for(Cat cat:cats){
            if(cat.fullness){
                System.out.println(cat.name+" сытый.");
            }else{
            System.out.println(cat.name+" голодный.");
            }

        }

        catFenay.eat(bow.getFood(11));
        System.out.println("Осталось в миске "+bow.FoodAmount() + " --> ");
        bow.addFood(11);
        catFenay.eat(bow.getFood(9));

    }
}





