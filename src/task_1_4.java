public class task_1_4 {
    public static void main(String[] args) {
        int a = 284;
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;
        System.out.println("Если заданное число "+a+" значит это число состоит из цифр "+ d +" "+ c +" и "+ b +" и их сумма равна "+(b+c+d));

    }
}
