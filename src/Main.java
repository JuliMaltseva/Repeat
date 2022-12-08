public class Main {
    public static void main(String[] args) {
//Урок: переменные 1
//Задача 1
        System.out.println("Урок: переменные 1");
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
//Задача 2
        System.out.println("Задача 2");
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
//Задача 3
        System.out.println("Задача 3");
        // dog уменьшить на 3,5;
        // cat уменьшить на 1,6;
        // paper уменьшить на 7639;
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7_639;
        System.out.println(paper);
//Задача 4
        System.out.println("Задача 4");
        //Инициализируйте (=присвойте значение) переменную friend значением 19.
        //Увеличьте значение переменной на 2, после чего поделите значение на 7.
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//Задача 5
        System.out.println("Задача 5");
        //Инициализируйте переменную frog значением 3,5.
        //Умножьте переменную в 10 раз и поделите на 3,5.
        // Добавьте к последнему значению переменной 4.
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Задача 6
        System.out.println("Задача 6");
        //Вес одного боксера – 78,2 кг
        //Вес второго боксера – 82,7 кг
        //Подсчитайте и выведите в консоль общий вес двух бойцов.
        //Подсчитайте и выведите в консоль разницу между весами бойцов.
        var weightFirstBoxer = 78.2;
        System.out.println("Вес одного боксера " + weightFirstBoxer + " кг");
        var weightSecondBoxer = 82.7;
        System.out.println("Вес второго боксера " + weightSecondBoxer + " кг");
        var weightBoxerTotal = weightFirstBoxer + weightSecondBoxer;
        System.out.println(weightBoxerTotal + " кг - общий вес двух бойцов.");
        var weightDifference = weightFirstBoxer - weightSecondBoxer;
        System.out.println(weightDifference + " кг - разница между весами бойцов");
//Задача 7
        System.out.println("Задача 7");
        if (weightFirstBoxer > weightSecondBoxer) {
            System.out.println(weightFirstBoxer - weightSecondBoxer + " кг - разница между весами бойцов");
        } else {
            System.out.println(weightSecondBoxer - weightFirstBoxer + " кг - разница между весами бойцов");
        }
        var weightDifferenceSecondWay = weightSecondBoxer % weightFirstBoxer;
        System.out.println(weightDifferenceSecondWay + " кг - разница между весами бойцов");
//Задача 8
        System.out.println("Задача 8");
        //640 часов работы поделено между сотрудниками.
        //Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
        //Выведите результат задачи в консоль в формате "Всего работников в компании – … человек"
        var workTimeTotal = 640;
        var workTimeOneEmployee =8;
        var numberOfEmployees = workTimeTotal / workTimeOneEmployee;
        System.out.println("Всего работников в компании " + numberOfEmployees + " человек");
        //Посчитайте сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.
        //"Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками".
        var numberOfEmployeesNew = numberOfEmployees + 94;
        var workTimeTotalNew = numberOfEmployeesNew * workTimeOneEmployee;
        System.out.println("Если в компании работает " + numberOfEmployeesNew + "  человек, то всего " + workTimeTotalNew + " часов работы может быть поделено между сотрудниками.");

//Урок: переменные 2
//Задача 1
        System.out.println("Урок: переменные 2");
        System.out.println("Задача 1");
        //Объявите переменные типа int, byte, short, long, float, double.
        //"Значение переменной … с типом … равно …"
        byte nameOne = 17;
        System.out.println("Значение переменной nameOne с типом byte равно " + nameOne);
        short nameTwo = 619;
        System.out.println("Значение переменной nameTwo с типом short равно " + nameTwo);
        int nameThree = 123456789;
        System.out.println("Значение переменной nameThree с типом int равно " + nameThree);
        long nameFour = 998877665544332211L;
        System.out.println("Значение переменной nameFour с типом long равно " + nameFour);
        float nameFive = 1.234564f;
        System.out.println("Значение переменной nameFive с типом float равно " + nameFive);
        double nameSix = 9.0123456789;
        System.out.println("Значение переменной nameSix с типом double равно " + nameSix);
//Задача 2
        System.out.println("Задача 2");
        //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        float firstNumber = 27.12f;
        System.out.println("firstNumber = " + firstNumber);
        long secondNumber = 987_678_965_549L;
        System.out.println("secondNumber = " + secondNumber);
        double thirdNumber = 2.786;
        System.out.println("thirdNumber = " + thirdNumber);
        boolean monthNumber = thirdNumber == 12;
        System.out.println("monthNumber - " + thirdNumber + ". It is "+ monthNumber);
        short fourthNumber = 569;
        System.out.println("fourthNumber = " + fourthNumber);
        short fifthNumber = -159;
        System.out.println("fifthNumber = " + fifthNumber);
        short sixthNumber = 27897;
        System.out.println("sixthNumber = " + sixthNumber);
        byte sevenNumber = 67;
        System.out.println("sevenNumber = " + sevenNumber);
//Задача 3
        System.out.println("Задача 3");
        //У Людмилы Павловны 23 ученика, у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        //Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        int studentLP = 23;
        int studentAS = 27;
        int studentEA = 30;
        int studentsTotal = studentLP + studentAS + studentEA;
        int paperTotal = 480;
        int paperForOneStudent = paperTotal / studentsTotal;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги.");
//Задача 4
        System.out.println("Задача 4");
        //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате  "За … машины произвела бутылок … штук "
        int machineOutputInTwoMinutes = 16;
        System.out.println("Производительность машины для изготовления бутылок - " + machineOutputInTwoMinutes + " бутылок за 2 минуты.");
        int machineOutputInOneMinute = machineOutputInTwoMinutes / 2;
        int machineOutputInTwentyMinutes = machineOutputInOneMinute * 20;
        System.out.println("За 20 минут работы машина произвела бутылок - " + machineOutputInTwentyMinutes + "  штук.");
        int oneDay = 24 * 60;
        int machineOutputInOneDay = machineOutputInOneMinute * oneDay;
        System.out.println("В сутки машина произвела бутылок - " + machineOutputInOneDay + "  штук.");
        int machineOutputInThreeDays = machineOutputInOneDay * 3;
        System.out.println("За 3 дня машина произвела бутылок - " + machineOutputInThreeDays + "  штук.");
        int machineOutputInDecember = machineOutputInOneDay * 31;
        System.out.println("За 1 месяц машина произвела бутылок - " + machineOutputInDecember + "  штук.");
//Задача 5
        System.out.println("Задача 5");
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        //На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
        int colorsTotal = 120;
        int whitePaintForOneClass = 2;
        int brownPaintForOneClass = 4;
        int totalPaintForOneClass = whitePaintForOneClass + brownPaintForOneClass;
        int totalClasses = colorsTotal / totalPaintForOneClass;
        int whiteColorTotal = whitePaintForOneClass * totalClasses;
        int brownColorTotal = brownPaintForOneClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteColorTotal + " банок белой краски и " + brownColorTotal + " банок коричневой краски.");
//Задача 6
        System.out.println("Задача 6");
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        int bananaWeightGr = 80;
        int bananaPortion = 5;
        int milkWeightGr = 105;
        int milkPortion = 2;
        int iceCreamWeightGr = 100;
        int iceCreamPortion = 2;
        int eggWeightGr = 70;
        int eggPortion = 4;
        int grPerKg = 1000;
        int breakfastWeightGr = (bananaWeightGr * bananaPortion) + (milkWeightGr * milkPortion) + (iceCreamWeightGr * iceCreamPortion) + (eggWeightGr * eggPortion);
        System.out.println("Общий вес спорт-завтрака " + breakfastWeightGr + " грамм.");
        float breakfastWeightKg = breakfastWeightGr/(float)grPerKg;
        System.out.println("Общий вес спорт-завтрака " + breakfastWeightKg + " кг.");
//Задача 7
        System.out.println("Задача 7");
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм
        //и сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        int overweightKg = 7;
        int overweightGr = overweightKg * grPerKg;
        short minWeightLossPerDay = 250;
        short maxWeightLossPerDay = 500;
        int maxDays = overweightGr / minWeightLossPerDay;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + maxDays + " дней уйдёт на похудение");
        int minDays = overweightGr / maxWeightLossPerDay;
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + minDays + " дней уйдёт на похудение");
        int averageWeightLossPerDay = (minWeightLossPerDay + maxWeightLossPerDay) / 2;
        int averageDays = overweightGr / averageWeightLossPerDay;
        if (overweightGr % averageWeightLossPerDay == 0) {
            System.out.println(averageDays + " дней может потребоваться в среднем, чтобы добиться результата похудения.");
        } else {
            System.out.println((averageDays + 1) + " дней может потребоваться в среднем, чтобы добиться результата похудения.");
        }
//Задача 8
        System.out.println("Задача 8");
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной.
        //Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".
        int monthlySalaryMary = 67_760;
        int monthlySalaryDen = 83_690;
        int monthlySalaryKris = 76_230;
        double indexingSize = 0.1;
        double monthlySalaryAfterARaiseMary = monthlySalaryMary + monthlySalaryMary * indexingSize;
        double monthlySalaryAfterARaiseDen = monthlySalaryDen + monthlySalaryDen * indexingSize;
        double monthlySalaryAfterARaiseKris = monthlySalaryKris + monthlySalaryKris * indexingSize;
        int annualIncomeMary = monthlySalaryMary * 12;
        int annualIncomeDen = monthlySalaryDen * 12;
        int annualIncomeKris = monthlySalaryKris * 12;
        double annualIncomeAfterARaiseMary = monthlySalaryAfterARaiseMary * 12;
        double annualIncomeAfterARaiseDen = monthlySalaryAfterARaiseDen * 12;
        double annualIncomeAfterARaiseKris = monthlySalaryAfterARaiseKris * 12;
        double annualIncreaseMary = annualIncomeAfterARaiseMary - annualIncomeMary;
        double annualIncreaseDen = annualIncomeAfterARaiseDen - annualIncomeDen;
        double annualIncreaseKris = annualIncomeAfterARaiseKris - annualIncomeKris;
        System.out.println("Маша теперь получает " + monthlySalaryAfterARaiseMary + " рублей в месяц. Годовой доход вырос на " + annualIncreaseMary + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryAfterARaiseDen + " рублей в месяц. Годовой доход вырос на " + annualIncreaseDen + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryAfterARaiseKris + " рублей в месяц. Годовой доход вырос на " + annualIncreaseKris + " рублей");

    }
}