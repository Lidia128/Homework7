public class Main {
    public static void main(String[] args) {

        //Задача № 1
        System.out.println("Задача № 1");
        System.out.println();
        int many = 29000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + many / 100;
            total = total + many;
            i++;
            System.out.println("Месяцев " + i + " , сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();
        //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

    //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        int people=12_000_000;
        int live=17;
        int death=8;
        int year=1;
            for (year=1;year<=10;year++){
            people= people + ((people * live / 1000)-(people*death/1000));
            System.out.println("Год " +year+ ", численность населения составляет " +people+ " людей");        }
        System.out.println();
        //Задача № 4
        System.out.println("Задача № 4");
        System.out.println();
        int summa=15000;
        int totalSumma=0;
        int month=0;
        while (totalSumma<12_000_000){
            totalSumma=totalSumma+(summa*7)/100;
            totalSumma=totalSumma+summa;
            month++;
            System.out.println("Месяцев " + month + " , сумма накоплений равна " + totalSumma + " рублей.");
        }
        System.out.println();
        //Задача № 5
        System.out.println("Задача № 5");
        System.out.println();
        int days=1;
        while (totalSumma<12_000_000)        {
            totalSumma=totalSumma+(summa*7)/100;
            totalSumma=totalSumma+summa;
            if (days % 6 == 0) {
            System.out.println("Месяцев " + days + " , сумма накоплений равна " + totalSumma + " рублей."); }
    }
        System.out.println();
        //Задача № 6
        System.out.println("Задача № 6");
        System.out.println();
       for (days=1;days<=108;days++);{
        totalSumma=totalSumma+(summa*7)/100;
        totalSumma=totalSumma+summa;
        if (days % 6 == 0){
            System.out.println("Месяцев " + days + " , сумма накоплений равна " + totalSumma + " рублей.");}
        }
        System.out.println();
        //Задача № 7
        System.out.println("Задача № 7");
        System.out.println();
        int friday=2;
        while (friday<=31) {
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");}
                System.out.println();

        //Задача № 8
        System.out.println("Задача № 8");
        System.out.println();
        int god =2100;
        for (god = 1896; god <= 2100; god++) {
                if (god % 79 == 0) {
                    System.out.println("Год " + god + " когда появиляется камета."); }}
                System.out.println();

        //Задача № 9
        System.out.println("Задача № 9");
        System.out.println();
            int number = 1;
            int summaNumber =1;
            for (number = 1; number <= 10; number++)
                if (number % 1==0){
                    summaNumber=2*number;
                   System.out.println("2 *" + number + "=" + summaNumber);
        }}

    }}