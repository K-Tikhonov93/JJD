public class task_2_3 {
    public static void main(String[] args) {
        double a = 1;
        double b = 4;
        double c = 1;

        System.out.println("Необходимо найти корни квадратного уравнения типа ax^2+bx+c=0");

        double d = (b*b)-(4*a*c);
        double i;
        double j;

        if (d==0){
            i = (-1*b)/(2*a);
            System.out.println("Уравнение имеет один корень и равен "+ i);
        }
        else if (d>0){
            i = ((-1*b)+(Math.sqrt(d)))/(2*a);
            j = ((-1*b)-(Math.sqrt(d)))/(2*a);
            System.out.println("Уравнение имеет два корня: "+i+" и "+j);
        }
        else
            System.out.println("Уравнение корней не имеет из-за отриц. дискреминанта");
    }
}
