public class checkConcatnatedSum {
    public static void main (String args[]){
        numGenerator gen=new numGenerator();
        int num=gen.generate();
        int num2=gen.generate();
        int sum=0;
        while(num>0){
            if(num>10){
              sum+=getNum(num%10,num2);
              System.out.println("num is "+ getNum(num%10,num2));
              num/=10;
            }
            else{
                sum+=getNum(num,num2);
            }
        }
        System.out.println("final "+ sum);
    }
    static int getNum(int n,int n2){
        int k=n;
        for (int i = 1; i < n2; i++) {
        
        k = Integer.valueOf(String.valueOf(n) + String.valueOf(n));
        } 
        return k;
    
   }
}
