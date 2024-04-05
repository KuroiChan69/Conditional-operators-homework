public class Main {
    public static void main(String[] args) {
        //Всё немного в игроничной форме, это только потому, что неверные окончания числительных и исчисляемых мне режут глаз, а писать кучу костылей, чтобы выводился верны  текс лень. Главное алгоритмы показать.
        System.out.println(" ");
        System.out.println("Задача 1");
        short personAge = 17;
        if (personAge >= 18) {
            System.out.println("Тебе" + personAge + "лет, а это значит что 18 уже есть, и теперь по закому ты совершеннолетний человек");
        } else {
            System.out.println("Тебе" + personAge + ",лет, а значит 18ти ещё нет, и возраст совершеннолетия ещё не наступил, стоит немного подождать");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        int temperature = 3;
        System.out.println("Уличный термометр показывает " + temperature + "°С");
        if (temperature >= 5) {
            System.out.println("А значит уже тепло,и можно идти без шапки");
        } else {
            System.out.println("ещё холодновато, а значит стоит надеть шапку");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        int speed = 40;
        System.out.println("Скорость равна " + speed + "км/ч  а значит");
        if (speed <= 60) {
            if (speed >= 50 && speed <= 60) {
                System.out.println("ехать можно, но стоит ехать осторожнее");
            } else {
                System.out.println("можете ехать дальше спокойно");
            }
        } else {
            System.out.println("Вы слишком гоните, так что лучше готовьте шекели на штраф дядюшке гаишнику");
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        int age = 16;
        System.out.println("итак, наш возраст " + age + " куда же нам ходить?");
        if (age < 60) {
            if (age >= 1 && age <= 3) {
                System.out.println("Да нам ещё " + age + " годика, прежде чем куда-то ходить, надо сначала ходить научиться");
            }
            if (age >= 4 && age <= 6) {
                System.out.println("возраст " + age + " - ходить уже умеем, так что ходим в садик");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Нам уже" + age + ", ходим уже увереннно, так что ходим в школу. Впитываем базовые знания");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("говоришь, что уже " + age + ", ай какие мы взрослые, но работать ещё рано. Ходи учиться в универ, чтобы потом ходить работу работать");
            }
            if (age > 24) {
                System.out.println("ого, уже " + age + " значит уже отучились, так что какие уже нам школы. уже пора работать, хватит сидеть на шее у мамы");
            }
        } else {
            System.out.println("Ничего, ничего. И в " + age + " люди живут. Но уже на пенсии");
        }
        System.out.println(" ");
        System.out.println("Задача 5");
//Практически то-же самое, я уже сделал в третьей задаче по своей инициативе, но тут свой нюанс
        int kidAge = 15;
        System.out.println("Дитяте " + kidAge + " а это значит");
        if (kidAge < 5) {
            System.out.println("Какие вам аттракционы? Ещё очень мало лет. Стоит пока обождать");
        } else {
            if (kidAge >= 5 && kidAge <= 14) {
                System.out.println("Развлечься можно, но только в сопровождении взрослого");
            } else {
                System.out.println("можно спокойно проходить на аттракцион");
            }
        }

        System.out.println(" ");
        System.out.println("Задача 6");
        short totalPlaces = 102;
        byte totalPassangers = 81;
        byte sittingPlaces = 60;
        int standingPlaces = totalPlaces - sittingPlaces;
        if (totalPassangers < totalPlaces) {
            if (totalPassangers < 60) {
                System.out.println("Всего сидячих мест осталось " + (sittingPlaces - totalPassangers));
            } else {
                System.out.println("Посидеть уже  не получится, но стоячих месть ещё " + (totalPlaces % totalPassangers));
            }
        } else {
            System.out.println("Увы, вагон полностью забит.");
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        int one = 56413;
        int two = 3542;
        int three = 64184;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}
