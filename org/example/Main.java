package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        zadanieFive(25, 4);
        zadanieSix(4);
        zadanieSeven(-5);
        zadanieEight("Srrint", 4);
        zadanieNine(2013);
        zadanieTen();
        zadanieEleven();
        zadanieTwelve();

        int[][] mass = new int[4][4];
        zadanieThirteen(mass);
        zadanieFourteen(3 * 3, 9);
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 3;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {

        int value = 120;
        if (value <= 0)
            System.out.println("Красный");

        else if (value < 0 && value <= 100)
            System.out.println("Желтый");

        else
            System.out.println("Зелёный");


    }

    public static void compareNumbers() {
        int a = 12;
        int b = 4;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static boolean zadanieFive(int a, int b) {
        return  (a + b >= 10 && a + b <= 20);
    }

    public static void zadanieSix(int a){
        if (a >= 0)
            System.out.println("Положительное число");

        else
            System.out.println("Отрицательное чило");
    }
    public static boolean zadanieSeven(int a){
        if (a < 0)
            return true;
        else
            return false;
    }
    public static void zadanieEight(String b, int a){
        int i;
        for (i = 0; i < a; i++){
            System.out.println(b);
        }
    }

    public static boolean zadanieNine(int a){

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
            return true;
        else
            return false;

    }

    public static void zadanieTen(){

       int nums[] = {1,1,0,0,1,0,1,1,0,0};
       int i;
       for (i = 0; i < nums.length; i++){
           //System.out.print(nums[i]);
           if (nums[i] == 0)
               System.out.print("1");
           else
               System.out.print("0");

       }

    }

    public static void zadanieEleven(){
        System.out.print("\n");
        int[] arr = new int [101];
        for(int i = 1; i < 101; i++){
            arr[i] = i;
            System.out.println("arr["+i+"] = " + arr[i]);

        }
    }

    public static void zadanieTwelve(){
        int nums[] = {1,1,0,0,1,0,1,1,0,0};
        for(int i = 1; i < nums.length; i++){
            nums[i] = i;
            if (i < 6)
            System.out.println(i * 2);

        }
    }

    public static void zadanieThirteen(int[][] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i][i] = 1;
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] zadanieFourteen(int len, int initialValue){

        int[] newsArr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(newsArr[i] = initialValue);

        }
        return newsArr;
    }






}


