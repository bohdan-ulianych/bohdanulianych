package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Sport cat[] = new Cat[3];
        cat[0] = new Cat("Симба", 20, 2);
        cat[1] = new Cat("Киття", 23, 1);
        cat[2] = new Cat("Смурфик", 21, 2);
        Sport human[] = new Human[3];
        human[0] = new Human("Алёша", 10, 3);
        human[1] = new Human("Добрыня", 15, 2);
        human[2] = new Human("Илья", 17, 4);
        Sport robot[] = new  Robot[3];
        robot[0] = new Robot("Валли", 35, 1);
        robot[1] = new Robot("Оптимус", 40, 1);
        robot[2] = new Robot("Бии", 50, 1);
        Treadmill treadmill = new Treadmill(35);
        Wall wall = new Wall(2);
        cat[0].showInfo();
        human[2].showInfo();
        robot[1].showInfo();



    }
}
