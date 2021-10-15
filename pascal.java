public class pascal {
    
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int num=generator.generate();
        int sum=0;
        int sweet=0;
        boolean pascal=false;
        for (int i = 0; i < num; i++) {
            
            if(sum==num){
              pascal=true;
              sweet=i;
              break;
            }
            sum+=i;
            }
        
        if(pascal){
            System.out.println("pascal "+(sweet));
        }
        else{
            System.out.println("not pascal");

        }
    }
}
