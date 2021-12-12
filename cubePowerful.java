public class cubePowerful {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int sum=0;
        int ornum=num;
        while(num>0){ 
            sum+=((num%10)*(num%10)*(num%10));
             num/=10;
         }
         if(sum==ornum){
             System.out.println("cube powerful");
         }
         else{
            System.out.println("not cube powerful "+ sum);

         }
         
    }
}
