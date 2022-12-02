public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1() {
        System.out.println("Задание №1");
        int i = 1;
        byte b = 2;
        short s = 3;
        long l = 4;
        float f = 5.0f;
        double d = 6.1;
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной s с типом short равно "+s);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной d с типом double равно "+d);

    }
    public static void task2() {
        System.out.println("Задание №2");
        float f1 = 27.12f;
        long l2 = 987678965549L;
        double d3 = 2.786;
        short s4 = 569;
        short h5 = -159;
        int i6 = 27897;
        byte b7 = 67;
        System.out.println(f1);
        System.out.println(l2);
        System.out.println(d3);
        System.out.println(s4);
        System.out.println(h5);
        System.out.println(i6);
        System.out.println(b7);

    }
    public static void task3() {
        System.out.println("Задание №3");
        int pupilsIn1Class = 23;
        int pupilsIn2Class = 27;
        int pupilsIn3Class = 30;
        int totalPupils = pupilsIn1Class+pupilsIn2Class+pupilsIn3Class;
        int paper = 480;
        int numberOfSheetsForPupil = paper / totalPupils;
        System.out.println("На каждого ученика рассчитано "+numberOfSheetsForPupil+" листов бумаги");
    }
    public static void task4() {
        System.out.println("Задание №4");
        int productivityInMinute = 8;
        int time1 = 20;
        int time2InDays = 1;
        int time2 = 24*60*time2InDays;
        int time3InDays = 3;
        int time3 = time2 * time3InDays;
        int time4InDays = 30;
        int time4 = time2 * time4InDays;
        int production1 = time1 * productivityInMinute;
        int production2 = time2 * productivityInMinute;
        int production3 = time3 * productivityInMinute;
        int production4 = time4 * productivityInMinute;
        System.out.println("За " + time1 + " минут машина произвела " + production1 + " бутылок");
        System.out.println("За " + time2InDays + " сутки машина произвела " + production2 + " бутылок");
        System.out.println("За " + time3InDays + " дня машина произвела " + production3 + " бутылок");
        System.out.println("За месяц машина произвела " + production4 + " бутылок");
    }
    public static void task5(){
        System.out.println("Задание №5");
        int totalTins = 120;
        int whiteTinsForClass = 2;
        int brownTinsForClass = 4;
        int tinsForClass = whiteTinsForClass + brownTinsForClass;
        int amountOfClass = totalTins / tinsForClass;
        int totalWhiteTins = whiteTinsForClass * amountOfClass;
        int totalBrownTins = brownTinsForClass * amountOfClass;
        System.out.println("В школе, где "+ amountOfClass+ " классов, нужно " + totalWhiteTins + " банок белой краски и "+ totalBrownTins + " банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задание №6");
        int bananas = 5;
        int weightOfBanana = 80;
        int milk = 2;
        int weightOf1PortionMilk = 105;
        int iceCream = 2;
        int weightOf1IceCream = 100;
        int eggs = 4;
        int weightOf1Egg = 70;
        double breakfastGramm = bananas * weightOfBanana + milk * weightOf1PortionMilk + iceCream * weightOf1IceCream + eggs * weightOf1Egg ;
        double breakfastKg = breakfastGramm / 1000;
        System.out.println("Вес спортзавтрака составил "+ breakfastGramm + " грамм или "+breakfastKg + " килограмм");
    }
    public static void task7() {
        System.out.println("Задание №7");
        int lossesOfWeight = 7000;
        int lossesOn1DietPerDay = 250;
        int lossesOn2DietPerDay = 500;
        int daysOf1Diet = lossesOfWeight / lossesOn1DietPerDay ;
        int daysOf2Diet = lossesOfWeight / lossesOn2DietPerDay ;
        int averageOfDaysOfDiet = (daysOf1Diet + daysOf2Diet) / 2;
        System.out.println(daysOf1Diet + " дней потребуется для сброса веса к соревнованию по 250 грамм в день");
        System.out.println(daysOf2Diet + " дней потребуется для сброса веса к соревнованию по 500 грамм в день");
        System.out.println(averageOfDaysOfDiet + " дней в среднем потребуется для сброса веса к соревнованию");
    }
    public static void task8() {
        System.out.println("Задание №8");
        int salaryForMasha = 67760;
        int salaryForDenis = 83690;
        int salaryForKris = 76230;
        double newSalaryForMasha = salaryForMasha * 1.1;
        double newSalaryForDenis = salaryForDenis * 1.1;
        double newSalaryForKris = salaryForKris * 1.1;
        double differenceForMasha = newSalaryForMasha * 12 - salaryForMasha * 12;
        double differenceForDenis = newSalaryForDenis * 12 - salaryForDenis * 12;
        double differenceForKris = newSalaryForKris * 12 - salaryForKris * 12;
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newSalaryForMasha, differenceForMasha);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newSalaryForDenis, differenceForDenis);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newSalaryForKris, differenceForKris);
    }
}