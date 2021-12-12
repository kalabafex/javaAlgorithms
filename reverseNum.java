public class reverseNum {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int reversedNum=0;
        while(num>0){
            reversedNum=reversedNum*10 + num%10;
            num/=10;
        }
        System.out.println(reversedNum);
    }
}
