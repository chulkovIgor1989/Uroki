package org.example;




    public class Cat extends Animals {
        int MAX_RUN_DISTANCE = 250;
        private static int CatCount = 0;
        boolean  fullness;

        public Cat(String name) {
            super(name);
            CatCount++;
        }
        @Override
        public void run(int lenght) {
            if (lenght >= MAX_RUN_DISTANCE ) {
                System.out.println(name + " не может пробежать " + lenght + " м.");
            } else {
                System.out.println(name + " пробежал " + lenght + " м.");
            }
        }

        @Override
        public void swim(int lenght) {
            System.out.println(name + ": это кот, поэтому не может плавать. А умел бы плавать,цены бы ему не было :)" );
        }

        public static int getCatCount() {
            return CatCount;
        }


        public void eat(int foodAmount) {
            if (foodAmount > 0 ) {
                fullness = true;
                System.out.print(name + " покушал из миски и пошел спать или в туалет.");
            } else {
                fullness = false;
                System.out.println(name + " не может покушать из миски, так как не хватает еды. Надо вовремя приходить на обед !");
            }
        }

    }
