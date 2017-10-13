public class second_homework2 {
    public static void main(String[] args) {
        double n = 8.5;
        double m = 11.45;
        int a = 10;
        double i = Math.abs(a-n);
        double j = Math.abs(a-m);

        if(i==j)
            System.out.println("Числа равноудалены от 10");
        else if (i<j)
            System.out.println("Число "+n+" ближе к 10");
        else
            System.out.println("Число "+m+" ближе к 10");
    }
}
