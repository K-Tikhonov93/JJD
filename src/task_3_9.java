public class task_3_9 {
    public static void main(String[] args) {
        int counter = 0;
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        double mas3[] = new double[10];
        for (int i = 0; i < 10; i++) {
            mas1[i] = (int) (Math.random() * 9 + 1);
            mas2[i] = (int) (Math.random() * 9 + 1);
            mas3[i] = Math.round(((double) mas1[i] / (double) mas2[i]) * 100.0) / 100.0;
            if (mas3[i] == (int) mas3[i])
                counter++;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(mas1[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(mas2[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(mas3[i] + "\t");
        System.out.println("\n" + counter);
    }
}
