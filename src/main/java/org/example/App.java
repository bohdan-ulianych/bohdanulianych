package org.example;


public class App {
    public static void main(String[] args) {
        // 1 Task
        Employee emp1 = new Employee("Ivan", "Tranee", "nfnfnf@fjf.com", "066666655840", 588, 27);
        emp1.inLine();
        // 1 Task
        System.out.println(" ");

        //2 Task
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Vadim", "driver", "jncdj@ndk.ua", "0255855", 255, 32);
        empArr[1] = new Employee("Volodymyr", "programmer", "jncd55fj@ndk.ua", "5558", 4000, 20);
        empArr[2] = new Employee("Dmitriy", "teacher", "jnccccdj@ndk.ua", "88005553555", 500, 44);
        empArr[3] = new Employee("Evgeniy", "dev", "jncdj@ndk.ua", "02855", 25500, 68);
        empArr[4] = new Employee("Akakiy", "doctor", "jncdvf22j@ndk.ua", "02565", 1350, 45);

        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() > 40) {
                empArr[i].inLine();
            }
        }
        System.out.println(" ");
        //2 Task


        //3 Task
        int distRunDog = 250;
        int distSwimDog = 20;
        System.out.println("Дистанция для бега собаки: " + distRunDog + "м");
        System.out.println("Дистанция для плаванья сабаки: " + distSwimDog + "м");
        Animal dog = new Dog(distRunDog, distSwimDog);
        if (dog.getDistRun() < 500) {
            System.out.println("Собака пробежала " + dog.getDistRun() + "м");
        }else{
                System.out.println("Собака может пробежать только 500м");
            }
        if (dog.getDistSwim() < 10){
                System.out.println("Собака проплывла " + dog.getDistSwim() + "м");
        }else{
                System.out.println("Собака может проплыть только 10м");
        }
        System.out.println(" ");
        int distRunCat = 150;
        int distSwimCat = 5;
        System.out.println("Дистанция для бега кота: " + distRunCat + "м");
        System.out.println("Дистанция для плаванья кота: " + distSwimCat + "м");
        Animal cat = new Cat(distRunCat, distSwimCat);
        if (cat.getDistRun() < 200) {
            System.out.println("Kот пробежал " + cat.getDistRun() + "м");
        }else{
            System.out.println("Kот может пробежать только 200м");
        }
        if (dog.getDistSwim() == 0){
            System.out.println("Кот не поплыл!!!");
        }else{
            System.out.println("Кот не умеет плавать и не пожет проплыть " + distSwimCat + "м");
            System.out.println(" ");
        }
    //////////////////////////Task3.1
        Animal cat1 = new Cat(12,12);
        Animal cat2 = new Cat(12,12);
        Animal cat3 = new Cat(12,12);
        Animal cat4 = new Cat(12,12);
        Animal dog1 = new Dog(12, 12);
        Animal dog2 = new Dog(12, 12);
        Animal dog3 = new Dog(12, 12);
        System.out.println("Создано котов: " + Cat.countCat);
        System.out.println("Создано собак: " + Dog.countDog);








        }
    }