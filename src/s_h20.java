public class s_h20 {
    public static void main(String[] args){
        int b=0;
        for(int i=4;i<=99994;i++){
            String s=String.valueOf(i);
            if(s.indexOf('4')!=-1){
                b++;
            }
            else if(s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
                b++;
            }
        }
        System.out.println("Нужно исключить "+b+" номеров");
    }
}
