public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        float f = 4.2f;
        double g = 1.67;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        int f = -159;
        short g = 27897;
        byte h = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int totalStudents = studentsLP + studentsAS + studentsEA;
        int sheetsPaper = 480;
        int sheetsStudent = sheetsPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int machinePerformanceMinutes2 = 16;
        int machinePerformanceMinutes20 = machinePerformanceMinutes2 / 2 * 20;
        int machinePerformanceDays1 = machinePerformanceMinutes2 / 2 * 24 * 60;
        int machinePerformanceDays3 = machinePerformanceMinutes2 / 2 * 3 * 24 * 60;
        int machinePerformanceMonth1 = machinePerformanceMinutes2 / 2 * 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + machinePerformanceMinutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + machinePerformanceDays1 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceDays3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machinePerformanceMonth1 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int cansPaintClasses = 120;
        int whitePaintClass1 = 2;
        int brownPaintClass1 = 4;
        int totalClasses = cansPaintClasses / (whitePaintClass1 + brownPaintClass1);
        int totalWhitePaint = totalClasses * whitePaintClass1;
        int totalBrownPaint = totalClasses * brownPaintClass1;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananasGram = 5 * 80;
        int milkGram = 200 / 100 * 105;
        int iceCreamGram = 2 * 100;
        int eggsGram = 4 * 70;
        int sportsBreakfastGram = bananasGram + milkGram + iceCreamGram + eggsGram;
        float sportsBreakfastKGram = sportsBreakfastGram / 1000f;
        System.out.println("Вес спортзавтрака в граммах: " + sportsBreakfastGram + " грамм");
        System.out.println("Вес спортзавтрака в килограммах: " + sportsBreakfastKGram + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int shedWeightGram = 7 * 1000;
        int shedWeightGramDay250 = 250;
        int shedWeightGramDay500 = 500;
        double dayGram250 = shedWeightGram / shedWeightGramDay250;
        double dayGram500 = shedWeightGram / shedWeightGramDay500;
        double dayGramAverage = (shedWeightGramDay250 + shedWeightGramDay500) / 2;
        double averageDaysCount = shedWeightGram / dayGramAverage;
        System.out.println(dayGram250 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(dayGram500 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(averageDaysCount + " дней в среднем уйдет на похудение");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMashaMonth = 67760;
        int salaryMashaYear = salaryMashaMonth * 12;
        int salaryDenisMonth = 83690;
        int salaryDenisYear = salaryDenisMonth * 12;
        int salaryKristinaMonth = 76230;
        int salaryKristinaYear = salaryKristinaMonth * 12;
        float salaryMashaMonthEnlarged = 67760 * 0.1f + 67760;
        float salaryMashaYearEnlarged = salaryMashaMonthEnlarged * 12;
        float salaryDenisMonthEnlarged = 83690 * 0.1f + 83690;
        float salaryDenisYearEnlarged = salaryDenisMonthEnlarged * 12;
        float salaryKristinaMonthEnlarged = 76230 * 0.1f + 76230;
        float salaryKristinaYearEnlarged = salaryKristinaMonthEnlarged * 12;
        System.out.println("Маша теперь получает " + salaryMashaMonthEnlarged + " рублей. Годовой доход вырос на " + (salaryMashaYearEnlarged - salaryMashaYear) + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisMonthEnlarged + " рублей. Годовой доход вырос на " + (salaryDenisYearEnlarged - salaryDenisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaMonthEnlarged + " рублей. Годовой доход вырос на " + (salaryKristinaYearEnlarged - salaryKristinaYear) + " рублей.");
    }
}