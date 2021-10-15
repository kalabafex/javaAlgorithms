public class countDigit {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int digit=generator.generate();
        int digitCounter=0;
        while(num>0){
            if(digit==num%10){
                digitCounter++;
            }
            num=num/10;
        }
    
        System.out.println("digit count is "+digitCounter);
    }
}

