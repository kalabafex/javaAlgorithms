public class BEQNumber {
    
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        boolean BEQFound=false;
        int sixCounter=0;
        int numHolder=0;
        while(!BEQFound){
            sixCounter=0;
            numHolder=num*num*num;
            while(numHolder>0){
               if(numHolder%10==6){
                   sixCounter++;
               }
               numHolder/=10;
            }
            if(sixCounter==4){
                BEQFound=true;
                break;
            }
            num++;

        }
        System.out.println(num);
    }
}
