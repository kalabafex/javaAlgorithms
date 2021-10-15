public class minFactorDistance {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int min=num;
        for (int i = 1; i < num; i++) {
             if(num%i==0){
                 for (int j =i+1; j < num; j++) {
                     if(num%j==0 && min>j-i){
                       min=j-i;
                      }
                 }
             }
        }
        System.out.println("min factor is "+min);
    }
}