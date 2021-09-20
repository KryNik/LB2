public class mission1 {
    public static void main(String[] args) {
        int[] result;
        int number;
        int[][] mas1;
        int[][] mas2;
        int[] mas = new int[10000];
        long time1;
        long time2;

        number = 100;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println("\n" + (time2 - time1) + " milliseconds");

        number = 200;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");

        number = 400;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");

        number = 1000;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");

        number = 2000;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");

        number = 4000;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");

        number = 10000;
        time1 = System.currentTimeMillis();
        mas1 = rand(number);
        mas2 = rand(number);
        result = result(number, mas, mas1, mas2);
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " milliseconds");
    }

    static int[][] rand(int n) {
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 100);
            }
        }
        return mas;
    }

    static int[] result(int number, int[] mas, int[][] mas1, int[][] mas2) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                mas[i] = mas1[i][j] * mas2[i][j];
            }
        }
        return mas;
    }
}