public class largestPrimeNumber {
    
  public static void main (String args[]){
        
    numGenerator gen=new numGenerator();
    int num=gen.generate();
    int largest=0;
    for (int i = 2; i < num; i++) {
        if(isPrime(i) && num%i==0){
           largest=i;
        }
    }
    System.out.println("largest prime number is "+largest);
  }
  static boolean isPrime(int n){
    for(int i=2; i<n; i++)
    if(n%i==0){
    return false;
    }
    return true;
    }
}
