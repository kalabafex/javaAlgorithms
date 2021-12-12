public class nextPerfectSquare {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        double min=Math.floor(Math.sqrt(num));
        int number=(int)min;
        number+=1;
        System.out.println((int)Math.pow(number,2));
    }
}
