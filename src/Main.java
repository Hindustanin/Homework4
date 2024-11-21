//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        short let = 18;
        if (let < 18) {
            System.out.println("Если возраст человека равен " + let + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + let + ", то он совершеннолетний");
        }

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        float temteratyra = -10f;
        if (temteratyra < 5) {
            System.out.println("На улице " + temteratyra + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + temteratyra + ", можно идти без шапки");
        }

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        float skorost = 60.1f;
        if (skorost > 60) {
            System.out.println("Если скорость " + skorost + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + skorost + ", то можно ездить спокойно");
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        let = 25;
        if (let>2 && let <= 6) {
            System.out.println("Если возраст человека равен " + let + ", то ему нужно ходить в детский сад");
        }
        if (let >=7 && let <= 17) {
            System.out.println("Если возраст человека равен " + let + ", то ему нужно ходить в школу");
        }
        if (let >= 18 && let <= 24) {
            System.out.println("Если возраст человека равен " + let + ", то ему нужно ходить в университет");
        }
        if (let > 24) {
            System.out.println("Если возраст человека равен " + let + ", то ему нужно ходить на работу");
        }
        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        let = 15;
        if (let < 5) {
            System.out.println("Если возраст ребенка равен " + let + ", то он не может кататься на аттракционе");
        }
        if (let >= 5 && let <= 14) {
            System.out.println("Если возраст ребенка равен " + let + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (let > 14) {
            System.out.println("Если возраст ребенка равен " + let + ", то он может кататься без сопровождения взрослого");
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