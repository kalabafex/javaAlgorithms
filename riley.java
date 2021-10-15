public class riley {
    public static void main (String args[]){
        numGenerator generator=new numGenerator();
        int n=generator.generate();
        boolean riley=true;
        while(n>0){
            if(n%2!=0){
               riley=false;
            }
            n/=10;
        }
        if(riley){
        System.out.println("riley");
        }
        else{
        System.out.println("not riley");
        }
            
    }

}
