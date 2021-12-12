public class porcupine {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int num2=0;
        int nextNum=0;
        int porcupine=0;
        boolean found=false;
        boolean foundN=false;

            while(!found){ 
                num++;
                if(isPrime(num) && num%10==9){
                   
                    num2=num;
                     while(!foundN){
                     num2++;
                        if(isPrime(num2)){
                            foundN=true;
                             if(num2%10==9){
                                nextNum=num2;
                                 found=true;
                                
                             }
                        }
                     }
                   
                }
            }
            System.out.println(nextNum);
    }
    static boolean isPrime(int n){
        for(int i=2; i<n; i++)
        if(n%i==0){
        return false;
        }
        return true;
        }
}
