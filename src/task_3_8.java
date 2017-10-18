public class task_3_8 {
    public static void main(String[] args) {
        int mas[] = new int[12];
        int max = 0, maxIndex = 0;
        for (int i = 0; i < 12; i++) {
            mas[i] = (int) (Math.round(Math.random() * 30 - 15));
            System.out.print(mas[i] + " ");
            if (i == 0) {
                max = mas[i];
                maxIndex = i;
            }
            if (i >= 1 && mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
        }
        System.out.println("\nmax= " + max + " index= " + maxIndex);
    }
}
