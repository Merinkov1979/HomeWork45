public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.printf("%d ", i);

        }
        System.out.println();





        for (int t = 5; t <= 31; t = t + 7) {
            System.out.println(" Сегодня пятница " + t + "-е число. Необходимо подготовить отчет. ");

        }





        int period = 79;
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int startYear = 0;
        for (int year = start; year <= end; year++) {
            if (year % period == startYear) {
                System.out.println(year);
            }


        }









    }
}

