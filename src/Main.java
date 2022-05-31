public class Main {
    public static void main(String[] args) {
        int I = 0;
        while (I < 10) {
            I++;
            System.out.print(I + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание №2
        int f = 5;
        int necessaryFriday = f;
        for (; necessaryFriday <= 31; necessaryFriday = necessaryFriday + 7) {
            System.out.println("Сегодня пятница " + necessaryFriday + "-е число. Нужно подготовить отчет");
        }
        // Задание №3
        int year = 2022 - 200;
        int lastYear = 2022 + 100;
        while (year <= lastYear) {
            year++;
            if (year % 79 == 0)
                System.out.println(year);
        }
    }
}