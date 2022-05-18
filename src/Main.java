public class Main {
    public static void main(String [] args) {
        // Задание №1
        int dog = 8;
        byte cat = 2;
        short mouse = 4;
        long camel = 111L;
        double sugarWeight = 4.7;
        float saltWeight = 1.8f;
        boolean dogIsAdult = dog > 17;
        char bar = 36;
        System.out.println(dogIsAdult);

        //Задание №2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxer = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " +  weightOfAllBoxer);
        System.out.println("Разница в весе боксеров " +  weightDifference);

        //Задание №3
        int bananas = 5;
        bananas = bananas * 80;
        System.out.println("Общий вес бананов в граммах " + bananas);
        //5 бананов по 80гр.
        int milk = 105;
        milk = milk * 2;
        System.out.println("Обьем молока в горммах " + milk);
        //200мл. молока (100мл. = 105гр)
        int iceCream = 100;
        iceCream = iceCream * 2;
        System.out.println("Общий вес двух брикотов мороженого " + iceCream);
        //2 брикета мороженного по 100гр.
        int rawEag = 4;
        rawEag = rawEag * 70;
        System.out.println("Общий вес 4-х сырых яиц " + rawEag);
        //1 сырое яйцо 70гр.
        int totalWeight = bananas + milk + iceCream + rawEag;
        System.out.println("Общий вес спорт-завтрака в граммах " + totalWeight);
        //Складываем все 4-е ингридиента
        float kilogram = 1090;
        kilogram = kilogram / 1000;
        System.out.println("Вес спорт-завтрака в кг " + kilogram);
        //Переводим граммы в килограммы

        //Задание №4
        int Kilogram = 7;
        Kilogram = Kilogram * 1000;
        System.out.println("Вес для похудения в гр " + Kilogram);
        //Переводим 7кг в гр
        int Grams1 = 7000;
        Grams1 = Grams1 / 500;
        System.out.println("Количество дней при сбросе веса по 500гр в день = " + Grams1);
        int Grams2= 7000;
        Grams2 = Grams2 / 250;
        System.out.println("Количество дней при сбросе веса по 250гр в день = " + Grams2);

        //Задание №5
        int salaryM = 67760;
        salaryM = salaryM * 10 / 100;
        System.out.println("10% от зарплаты Миши составляет " + salaryM + "руб. ");
        int salaryM1 = 67760;
        salaryM1 = salaryM1 + 6760;
        System.out.println("Зарплата Миши после увеличения на 10% = " + salaryM1 + "руб. ");
        //Увличиваем зарплату Миши на 10%
        int salaryD = 83690;
        salaryD = salaryD * 10 / 100;
        System.out.println("10% от зарплаты Дениса составляет " + salaryD + "руб. ");
        int salaryD1 = 83690;
        salaryD1 = salaryD1 + 8369;
        System.out.println("Зарплата Дениса после увеличения на 10% = " + salaryD1 + "руб. ");
        //Увеличиваем зарплату Дениса на 10%
        int salaryK = 76230;
        salaryK = salaryK * 10 / 100;
        System.out.println("10% от зарплаты Кристины составляет " + salaryK + "руб. ");
        int salaryK1 = 76230;
        salaryK1 = salaryK1 + 7623;
        System.out.println("Зарплата Кристины после увеличения на 10% = " + salaryK1 + "руб.");
        //Увеличиваем зарплату Кристины на 10%

        int salaryMisha = 67760;//до увеличения
        int salaryMisha2 = 74520;// после увеличения
        int salaryDenis = 83690;//до увеличения
        int salaryDenis2 = 92059;// после увеличения
        int salaryChristina = 76230;//до увеличения
        int salaryChristina2 = 83853;//после увеличения
        salaryMisha = salaryMisha * 12;
        salaryMisha2 = salaryMisha2 * 12;
        salaryDenis = salaryDenis * 12;
        salaryDenis2 = salaryDenis2 * 12;
        salaryChristina = salaryChristina * 12;
        salaryChristina2 = salaryChristina2 * 12;
        System.out.println("Зарплата Миши за один год до увеличения на 10% = " + salaryMisha + "руб. ");
        System.out.println("Зарплата Миши за один год после увеличения на 10% = " + salaryMisha2 + "руб. ");
        System.out.println("Зарплата Дениса за один год до увеличения на 10% = " + salaryDenis + "руб. ");
        System.out.println("Зарплата Дениса за один год после увеличения на 10% = " + salaryDenis2 + "руб. ");
        System.out.println("Зарплата Кристины за один год до увеличения на 10% = " + salaryChristina + "руб. ");
        System.out.println("Зарплата Кристины за один год после увеличения на 10% = " + salaryChristina2 + "руб. ");
        int yearSalary1 = 813120;
        int yearSalary2 = 894240;
        int difference = yearSalary2 - yearSalary1;
        difference = yearSalary2 - yearSalary1;
        System.out.println("Годовой доход Миши вырос на " + difference + "руб. ");
        int yearSalary3 = 1004280;
        int yearSalary4 = 1104708;
        int difference2 = yearSalary4 - yearSalary3;
        difference2 = yearSalary4 - yearSalary3;
        System.out.println("Годовой доход Дениса вырос на " + difference2 + "руб. ");
        int yearSalary5 = 914760;
        int yearSalary6 = 1006236;
        int difference3 = yearSalary6 - yearSalary5;
        difference3 = yearSalary6 - yearSalary5;
        System.out.println("Годовой доход Кристины вырос на " + difference3 + "руб. ");
        //Спасибо за проверку)
















    }
}

