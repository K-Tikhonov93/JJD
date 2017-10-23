public class task_4_1_Adder {
    int i;
    int step;
    public task_4_1_Adder(int step){

        this.step = step;
        i = 0;
    }

    public void add(){
        this.i += step;
    }
    public int getValue(){
        return i;
    }
    public int getStep() { return step;}

    public static void main(String[] args){
        task_4_1_Adder a = new task_4_1_Adder(10);
        a.add();
        a.add();

        System.out.println("Выводим на экран объект класса task_4_1_Adder = " + a.getValue() + " с заявленным шагом " + a.getStep());

    }
}
