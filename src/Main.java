//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        short age = 18;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        float temperature = -10f;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        float speed = 60.1f;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
            }
        // Задача 6
        System.out.println();
        System.out.println("Задача 6");

        byte zanatoMest = 1;
        byte mest = 102;
        byte mestSida = 60;
        if (zanatoMest >= mest) {
            System.out.println("Мест в вагоне нет");
        } else {
            if (zanatoMest >= mestSida) {
                System.out.println("Сидячих мест нет");
                System.out.println("Свободно " + (mest-zanatoMest) + " стоячих мест");
            } else {
                System.out.println("Свободно " + (mestSida - zanatoMest) + " cидячих мест ");
                System.out.println("Свободно " + (mest - mestSida) + " стоячих мест ");
            }
        }
        // Задача 7
        System.out.println();
        System.out.println("Задача 7");

        int one = 30;
        int two = 200;
        int three = 100;
        if (three > one && three > two) {
            System.out.println("Чило 'three' = " + three + " больше всех");
        } else {
            if (two > one) {
                System.out.println("Чило 'two' = " + two + " больше всех");
            } else {
                System.out.println("Чило 'one' = " + one + " больше всех");
            }
        }






    }
}