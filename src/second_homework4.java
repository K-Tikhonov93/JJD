public class second_homework4 {
    public static void main(String[] args) {
    int a = (int) (Math.random()*150+5);
        if (a<=25 || a>=100){
            System.out.println("Данное число "+a+" не попало в отрезок от 25 до 100");
        }
        else
            System.out.println("Данное число "+a+" попало в отрезок от 25 до 100");
    }
}
