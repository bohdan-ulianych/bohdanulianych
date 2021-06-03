package org.example;

public class App {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Тимоша", 200);
        cat[1] = new Cat("Бандит", 90);
        cat[2] = new Cat("Мурка", 500);
        Plate plate = new Plate(558);
        System.out.println("Коты " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + "  голодны");
        System.out.println(cat[0].getName() + " намерен съесть " + cat[0].getAppetite() + " грамм корма");
        System.out.println(cat[1].getName() + " намерен съесть " + cat[1].getAppetite() + " грамм корма");
        System.out.println(cat[2].getName() + " намерен съесть " + cat[2].getAppetite() + " грамм корма");
        System.out.println("B миске " + plate.getFood() + " грамм корма. Хватит ли всем корма и смогут ли котики покушать?");
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].isSatiety() == false) {
                if (plate.checkFood(cat[i].getAppetite()) == false) {
                    plate.increaseFood();
                }
                cat[i].eat(plate);
                System.out.print("Кот " + cat[i].getName() + " съел " + cat[i].getAppetite() + " граммов корма");
                if (cat[i].isSatiety() == true) {
                    System.out.println(" и уже сыт");
                }
            }
        }
        System.out.println(" В миске осталось " + plate.getFood() + " граммов корма.");
    }
}
