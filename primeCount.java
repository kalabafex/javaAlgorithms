public class primeCount {
    public static void main (String args[]){
    numGenerator generator=new numGenerator();
    int num=generator.generate();
    int num1=generator.generate();
    int count=0;
    for (int i = num; i <= num1; i++) {
        boolean primeCounter=true;
        for (int j = 2; j < i; j++) {
            
        
        if(i%j==0 ){
            primeCounter=false;
        }
    }
    if(primeCounter && i>1){
        count++;
    }
    }
    System.out.println(count);
    }
}
