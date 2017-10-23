public class task_2_5 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*1000);
        System.out.println("рандомное число "+a);
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;
        if(b>=c&b>d||b>c&b>=d)
            System.out.println("В числе "+a+" наибольшее число "+b);
        else if (c>b&c>=d)
            System.out.println("В числе "+a+" наибольшее число "+c);
        else
            System.out.println("В числе "+a+" наибольшее число "+d);
    }
}
