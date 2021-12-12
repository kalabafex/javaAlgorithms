import java.util.Arrays;

public class computeHMS {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int value[]=new int [3];
        value[0]=num/3600;
        num%=3600;
        value[1]=num/60;
        num%=60;
        value[2]=num;
        System.out.println(Arrays.toString(value));
    }
    
}
