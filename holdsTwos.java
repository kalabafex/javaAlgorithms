public class holdsTwos {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        boolean one=false;
        boolean two=false;
        boolean three=false;
        int num=generator.generate();
        int number=num;
        for (int i = 1; i < 4; i++) {
        num=num*i;
        while(num>0){
            if(num>10){
                if(num%10==2){

                }
                num/=10;
            }
            else{
                if(num==2){

                }
                num=number;
            }
        }
        }
    }
}
