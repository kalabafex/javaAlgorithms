public class sumDigit {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int sum=0;
        if(num<0){
            num*=-1;
        }
        while(num>0){
          sum+=num%10;
          num=num/10;
        }
        System.out.println("sum is "+ sum);      
    }
}
